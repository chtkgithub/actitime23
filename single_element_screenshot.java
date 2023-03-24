package basic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class single_element_screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	   	 LocalDateTime ldt = LocalDateTime.now();
	   	 
	     String timestamp = ldt.toString().replace(':','-' );
	     
	     
	  System.setProperty("webdriver.gecko.driver", "E:\\firefox\\driver\\geckodriver.exe");
	       
			
			WebDriver driver = new FirefoxDriver();
			
			
			driver.get("https://www.irctc.com/contact.html");
		
			
		
			
			
			
			
		WebElement button = driver.findElement(By.xpath("//h2[text()='Contact Us']"));
		
	File temfile = button.getScreenshotAs(OutputType.FILE);
	
	File destfile = new File("./webpage/screenshot1"+timestamp+".png");
	
	  FileUtils.copyFile(temfile, destfile); 
	  
		
		
		
		

	}

}
