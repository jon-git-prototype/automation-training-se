package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	static int rowCount;
	static int colCount;

  public static void main(String[] args) {
	  //getRowCount();
	  //getCellData(0,0);
  }
	
  public excelUtils(String excelPath, String sheetName) {
	  try {
	  workbook = new XSSFWorkbook(excelPath);
	  sheet = workbook.getSheet(sheetName);
	  }catch (Exception e) {
		  e.printStackTrace();
	  }
  }

  public static void getRowCount() {
	  try {	  
		  int xCount = sheet.getPhysicalNumberOfRows();
		  System.out.println("No of rows: " + xCount);	
		  
		  rowCount = xCount;
	  } catch (Exception exp) {
		  System.out.println(exp.getMessage());
		  System.out.println(exp.getCause());
		  exp.printStackTrace();
	  }
  }
  
  public static void getColCount() {
	  try {	  
		  int xCount = sheet.getRow(0).getLastCellNum();
		  System.out.println("No of columns: " + xCount);	
		  
		  colCount = xCount;
	  } catch (Exception exp) {
		  System.out.println(exp.getMessage());
		  System.out.println(exp.getCause());
		  exp.printStackTrace();
	  }
  }
 
  public static void getColumnNum(String strColData) {
	  try {
		  System.out.println("colCount "+ colCount);
		  for(int i = 0;i<=colCount;i++)
		  {
			  String cellValue = sheet.getRow(0).getCell(i).getStringCellValue();
			  if(cellValue.equals(strColData))
			  {
				  colCount = i;
				  System.out.println(strColData + " column number is " + i);
				  break;
			  }				  
		  }
	  }catch (Exception exp) {
		  exp.printStackTrace();
	  } 
  }

  public static void getRowNum(String strRowData) {
	 // try {
		  System.out.println("rowCount "+ rowCount);
		  for(int i = 0;i<=rowCount;i++)
		  {
			  String cellValue = sheet.getRow(i).getCell(colCount).getStringCellValue();
			  System.out.println(colCount);
			  System.out.println(cellValue);
			  if(cellValue.equals(strRowData))
			  {
				  rowCount = i;
				  System.out.println(strRowData + " row number is " + i);
			  }				  
		  }
	 // }catch (Exception exp) {
	//	  exp.printStackTrace();
	//  } 
  }

  public static void getCellData(int xRow, int xCol) {
	  try {
		  String cellData =  sheet.getRow(xRow).getCell(xCol).getStringCellValue();
		  System.out.println(cellData);
		  
	  }catch (Exception exp) {
		  System.out.println(exp.getMessage());
		  System.out.println(exp.getCause());
		  exp.printStackTrace();
	  }	  
  }

}
