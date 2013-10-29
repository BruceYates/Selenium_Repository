package testClasses;
 
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 * Read data in an Excel spreadsheet and return it as a collection of objects.
 * This is designed to facilitate for parameterized tests in JUnit that
 * get data from an Excel spreadsheet.
**/

public class SpreadsheetData {

    // The contents of the spreadsheet, in a form compatible with JUnit 4 parameterized tests.
	
    private transient Collection<Object[]> data = null;

    public SpreadsheetData(final InputStream excelInputStream, int beginRow, int beginCol) throws IOException {
        this.data = loadFromSpreadsheet(excelInputStream,beginRow,beginCol);
    }
    
    public Collection<Object[]> getData() {
        return data;
    }

    private Collection<Object[]> loadFromSpreadsheet(final InputStream excelFile, int beginRow, int beginCol)
            throws IOException {

    	// beginRow = 0 - start at the first row  
    	// beginRow = 1 - start at the second row
    	
    	// beginCol = 0 - start at the first column  
    	// beginCol = 1 - start at the second column
    	
        HSSFWorkbook workbook = new HSSFWorkbook(excelFile);

        //data = new ArrayList<Object[]>();
        Sheet sheet = workbook.getSheetAt(0);

        List<Object[]> rows = new ArrayList<Object[]>();
        List<Object> rowData = new ArrayList<Object>();

		int lastRowNum = sheet.getLastRowNum();
		Row row = sheet.getRow(0);
		int numberOfColumns = 0;
		if (isEmpty(row)) {
			//System.out.println("Number of Columns: " + numberOfColumns);
		} else {
			numberOfColumns = countNonEmptyColumns(sheet);
			//System.out.println("Number of Columns: " + numberOfColumns);
			for (int rowNum = beginRow; rowNum <= lastRowNum; rowNum++) {
				rowData.clear();
				Row rowNo = sheet.getRow(rowNum);
				for (int column = beginCol; column < numberOfColumns; column++) {
					Cell cell = rowNo.getCell(column);
					rowData.add(objectFrom(workbook, cell));
					System.out.print(cell+ " "); 
				}
				rows.add(rowData.toArray());
				System.out.println("\n"); 
			}
		}
        return rows;
    }

	private boolean isEmpty(final Row row) {
		boolean rowIsEmpty;
		if (row == null) {
			rowIsEmpty = true;
		} else {
			Cell firstCell = row.getCell(0);
			rowIsEmpty = (firstCell == null) || (firstCell.getCellType() == Cell.CELL_TYPE_BLANK);
		}
		return rowIsEmpty;
    }

    /**
     * Count the number of columns, using the number of non-empty cells in the
     * first row.
    **/
    private int countNonEmptyColumns(final Sheet sheet) {
        Row firstRow = sheet.getRow(0);
        return firstEmptyCellPosition(firstRow);
    }

    private int firstEmptyCellPosition(final Row cells) {
        int columnCount = 0;
        for (Cell cell : cells) {
            if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                break;
            }
            columnCount++;
        }
        return columnCount;
    }

    private Object objectFrom(final HSSFWorkbook workbook, final Cell cell) {
        Object cellValue = null;

        if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
            cellValue = cell.getRichStringCellValue().getString();
        } else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
            cellValue = getNumericCellValue(cell);
        } else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
            cellValue = cell.getBooleanCellValue();
        } else if (cell.getCellType()  ==Cell.CELL_TYPE_FORMULA) {
            cellValue = evaluateCellFormula(workbook, cell);
        }

        return cellValue;
    
    }

    private Object getNumericCellValue(final Cell cell) {
        Object cellValue;
        if (DateUtil.isCellDateFormatted(cell)) {
            cellValue = new Date(cell.getDateCellValue().getTime());
        } else {
            cellValue = cell.getNumericCellValue();
        }
        return cellValue;
    }

    private Object evaluateCellFormula(final HSSFWorkbook workbook, final Cell cell) {
        FormulaEvaluator evaluator = workbook.getCreationHelper()
                .createFormulaEvaluator();
        CellValue cellValue = evaluator.evaluate(cell);
        Object result = null;
        
        if (cellValue.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
            result = cellValue.getBooleanValue();
        } else if (cellValue.getCellType() == Cell.CELL_TYPE_NUMERIC) {
            result = cellValue.getNumberValue();
        } else if (cellValue.getCellType() == Cell.CELL_TYPE_STRING) {
            result = cellValue.getStringValue();   
        }
        
        return result;
    }
}
