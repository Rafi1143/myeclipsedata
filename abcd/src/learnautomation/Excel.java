package learnautomation;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel {

	public static void main(String[] args) throws Exception {
		
		File src=new File("C:/Users/R2/Desktop/Testingtoday.xls");
		System.out.println("Excel located");
		
		Workbook wb=Workbook.getWorkbook(src);
		System.out.println("Workbook loaded");
		String data01=wb.getSheet(0).getCell(0,1).getContents();
		System.out.println("Data is "+data01);
		

	}

}
