package pageTest;

import org.testng.annotations.Test;
import utils.excelUtils;

public class ExcelTest {
	
  @Test
  public void main() {
	  
	  //excelUtils utils = new excelUtils("","");
	  
	  
	  String projectPath = System.getProperty("user.dir");
	  new excelUtils(projectPath + "/excel/dataTable.xlsx","Sheet1");
	  
	  excelUtils.getRowCount();
	  excelUtils.getColCount();
	  excelUtils.getColumnNum("Address");
	  excelUtils.getRowNum("Ben");
	  excelUtils.getCellData(0, 0);
  }
}
