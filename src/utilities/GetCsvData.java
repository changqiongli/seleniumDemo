package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class GetCsvData {
	
	public static Collection<String[]> getTestData(String path) throws IOException{
		
		ArrayList<String[]> csvContent = new ArrayList<String[]>();
		String csvRow;
		
		BufferedReader file = new BufferedReader (new FileReader(path));
		
		while ((csvRow = file.readLine()) != null) {
			String fields[] = csvRow.split(",");
			csvContent.add(fields);
		}
		file.close();
		return csvContent;
		
	}
	
	
}


