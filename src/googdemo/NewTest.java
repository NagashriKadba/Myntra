package googdemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTest {
	
	public WebDriver driver;
	String actualText = "";
	String expectedText = "Short passwords are easy to guess. Try one with at least 8 characters.";
	
	@BeforeMethod
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.gecko.driver","/home/tyss/Desktop/Softwares/geckodriver"); 
		 driver = new FirefoxDriver();
		
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://accounts.google.com/SignUp?hl=en-GB");
	  }
	
  @Test
  public void main() {
	  
	  driver.findElement(By.id("FirstName")).sendKeys("aaa");
	  driver.findElement(By.id("LastName")).sendKeys("xyz");
	  driver.findElement(By.id("Passwd")).sendKeys("1111111");
	  driver.findElement(By.id("PasswdAgain")).click();
	  
	  //WebDriverWait wait=new WebDriverWait(driver, 20);
	  WebElement Elem = driver.findElement(By.id("errormsg_0_Passwd"));
	  
	  actualText = Elem.getText();
	  //System.out.println(actualText);
	  if (actualText.contentEquals(expectedText)){
          System.out.println("Test Passed!");
      } else {
          System.out.println("Test Failed!");
      }
	  
	  //driver.findElement(By.xpath("//span[@id='BirthMonth']")).click();
	  //Select bdaymnth = new Select(driver.findElement(By.xpath("//*[@title='Birthday']")));
//	  Select bdaymnth = new Select(driver.findElement(By.xpath("//span[@id='BirthMonth']/div[1]")));
//	  bdaymnth.selectByVisibleText("July");
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//span[@id='BirthMonth']/div[1]"))).click().perform();
	  
	  driver.findElement(By.xpath("//div[div[text() = 'July']]")).click();
	
	  
  }
  

  @AfterMethod
  public void afterTest() {
	  driver.quit();
  }

}
