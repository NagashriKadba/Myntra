package com.myntra.generic;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {

		public static String readProperty() {
			String data = null;
		
			try{
				FileInputStream fis = new FileInputStream("/home/tyss/Desktop/wrkspce/Myntra/Resource/Project.properties");
				Properties p = new Properties();
				p.load(fis);
				data = p.getProperty("DataFile");
				
		}catch(Exception e){
			
		}
			return data;
		}

}
