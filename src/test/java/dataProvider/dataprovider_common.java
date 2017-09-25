package dataProvider;

import genericLibrary.ExcelReadwrite;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.DataProvider;

public class dataprovider_common {
	
	
		
		@DataProvider(name="commondp")
	
		public static Iterator<Object[]> dpdata_invalidLogin() throws Exception{
			
			return  ExcelInputData("Flipkart", "invalidlogin" );
							
		}
		/*public static Iterator<Object[]> dpdata(Method m) throws Exception{
			
			 String[] sc = m.getName().split("_");
			String sheet=sc[0];
			String script = sc[1];
			return ExcelInputData(sheet, script );
							
		}*/
		
	
	public static Iterator<Object[]> ExcelInputData(String sheetName, String scriptName) throws Exception
	{
		
		ExcelReadwrite readwrite = new ExcelReadwrite(System.getProperty("user.dir") + "\\src\\test\\resources\\Test_data.xlsx");
		int colCount = readwrite.colCount(sheetName);
		int rowCount = readwrite.rowCount(sheetName);
		
		ArrayList<Object[]> arrayList = new ArrayList<Object[]>();
		
		for(int iRow=1;iRow<=rowCount;iRow++)
		{
			String Script=readwrite.readCellValue(sheetName, iRow, 1);
			String ExecuteStatus = readwrite.readCellValue(sheetName, iRow, 2);
			if(Script.trim().toLowerCase().equals(scriptName) && ExecuteStatus.trim().toLowerCase().equals("y") )
			{
			
				Object[] obj=new Object[1];
				Map<String, String> map = new HashMap<String,String>();
				for(int icol=0;icol<colCount;icol++)
				{
					String Key = readwrite.readCellValue(sheetName, 0, icol);
					String Value=readwrite.readCellValue(sheetName, iRow, icol);
					map.put(Key, Value);
				}
				obj[0]=map;
				arrayList.add(obj);
				
			}
		}
		
		return arrayList.iterator();
		
	}
}

