package googdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Mydemo1 {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		String baseUrl = "http://google.com";
		String expectedTitle = "Google";
		 String actualTitle = "";
		 
		 
		 driver.get(baseUrl);
		 

}
}