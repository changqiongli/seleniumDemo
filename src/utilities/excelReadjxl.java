package utilities;

import java.io.IOException;
import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
 

public  class excelReadjxl{
	
public  Object [][] excelRead () throws BiffException, IOException{
	
	File f= new File("C:/SeleniumFrameWork/src/databaseANDtestng/EndToEnd/data/TestDataXLSX.xlsx");
	Workbook w=Workbook.getWorkbook(f) ;
	Sheet s=w.getSheet("sheet1");
	int rows=s.getRows();
	int columns=s.getColumns();
	

	String inputData[][]=new String[rows][columns];
	for(int i=0;i<rows; i++){
		for(int j=0; j<columns;j++){
			Cell c=s.getCell(j, i);
			inputData[i][j]=c.getContents();
			
			
		}
	}
	return inputData ;
}
}