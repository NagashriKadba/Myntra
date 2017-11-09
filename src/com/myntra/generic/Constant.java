package com.myntra.generic;

public interface Constant {

	String filepath = PropertyFile.readProperty();
	
	String browser = Excel_Library.readData("Sheet1", 1, 1);
	String browserDriver = Excel_Library.readData("Sheet1", 1, 2);
	String browserDriverPath = Excel_Library.readData("Sheet1", 1, 3);
	
	String url = Excel_Library.readData("Sheet1", 1, 4);
	String username = Excel_Library.readData("Sheet1", 1, 5);
	String password = Excel_Library.readData("Sheet1", 1, 6);
	
	


}
