package learnautomation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCSV {

	public static void main(String[] args) throws Exception {
		
		//This will load csv file
		CSVReader reader= new CSVReader(new FileReader("D:/Selenium Main/TestingCSV.csv"));
		
		//this will load content into list
		List<String[]> li=reader.readAll();
		System.out.println("Total rows which we have is "+ li.size());
		
		//Create Iterator reference
		Iterator<String[]>il=li.iterator();
		
		//Iterate all values
		while (il.hasNext()){
			String[] str=il.next();
			System.out.println("values are");
			for(int i=0;i<str.length;i++){
				System.out.println(""+ str[i]);
			}
		System.out.println("");
		}
		
	}

}
