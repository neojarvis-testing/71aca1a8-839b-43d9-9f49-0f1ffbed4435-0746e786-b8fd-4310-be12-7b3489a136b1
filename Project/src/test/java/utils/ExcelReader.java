package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    private static XSSFWorkbook workbook;
    private static String filepath = System.getProperty("user.dir")+"/testdata/data.xlsx";
    static{
        try {
            
            FileInputStream fileInputStream = new FileInputStream(new File(filepath));
            workbook = new XSSFWorkbook(fileInputStream);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * a. MethodName: getCellData
     * b. AuthorName: Sharath
     * c. Description: This is used retreiving data from specific excel cell
     * d. Parameters: SheetName of type String, rowNumber, colNumber of type int
     * e. Return Type: String
     */
    public static String getCellData(String sheetName, int rowNumber, int colNumber)
    {
        XSSFSheet sheet = workbook.getSheet(sheetName);

        if(sheet == null)
        {
            throw new IllegalArgumentException("Sheet " + sheetName + " does not exist");
        }

        Row row = sheet.getRow(rowNumber);
        if (row == null) 
            {
                throw new IllegalArgumentException("Row " + rowNumber + " does not exist in sheet " + sheetName);
            }
        Cell cell = row.getCell(colNumber);
        if (cell == null) 
        {
            return "";
        }

        return getCellValueAsString(cell);
    }
        
    /*
     * a. MethodName: getCellValueAsString
     * b. AuthorName: Sharath
     * c. Description: This calls different methods to retrieve different type of data
     * d. Parameters: cell of type Cell
     * e. Return Type: String
     */
    private static String getCellValueAsString(Cell cell) 
    {
        switch (cell.getCellType()) 
        {
            case STRING:
                return cell.getStringCellValue();

            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) 
                {
                    return cell.getDateCellValue().toString();
                } 
                else 
                {
                    return String.valueOf(cell.getNumericCellValue());
                }

            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());

            case FORMULA:
                return cell.getCellFormula();

            case BLANK:
                return "";
                
            default:
                return "Unsupported Cell Type";
        }
    }

    /*
     * a. MethodName: getRowCount
     * b. AuthorName: Sharath
     * c. Description: This retrieves specific row length of a sheet
     * d. Parameters: sheetName of type String
     * e. Return Type: int
     */
    public static int getRowCount(String sheetName) {
        XSSFSheet sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            throw new IllegalArgumentException("Sheet " + sheetName + " does not exist");
        }
        return sheet.getLastRowNum() + 1;
    }

    /*
     * a. MethodName: getColumnCount
     * b. AuthorName: Sharath
     * c. Description: This retrieves specific column length of a sheet
     * d. Parameters: sheetName of type String
     * e. Return Type: int
     */
    public int getColumnCount(String sheetName, int rowNumber) {
        XSSFSheet sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            throw new IllegalArgumentException("Sheet " + sheetName + " does not exist");
        }
        Row row = sheet.getRow(rowNumber);
        if (row == null) {
            throw new IllegalArgumentException("Row " + rowNumber + " does not exist in sheet " + sheetName);
        }
        return row.getLastCellNum();
    }

    /*
     * a. MethodName: close
     * b. AuthorName: Sharath
     * c. Description: This closes the workbook
     * d. Parameters: sheetName of type String
     * e. Return Type: int
     */
    public void close() throws IOException {
        if (workbook != null) {
            workbook.close();
        }
    }
}
