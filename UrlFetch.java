package sitetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class UrlFetch {
	public static void main(String[]args)
	{
	//open the browser and hit the URL//
		
		WebDriver driver= new FirefoxDriver();	
		
	// Maximize the page//
	
		driver.manage().window().maximize();
		
	//Hit the URL//
		driver.get("http://nql.grr.kreatio.com/");
		
	//page  wait time//
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	
	//Getting the page Title//	
		
		String actualTitle = driver.getTitle();
		System.out.println("ActualTitle is :" + actualTitle );
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//Navigate to News page//
		driver.findElement(By.linkText("News")).click();
		String actualTitleNews =driver.getTitle();
		System.out.println("Page title is:" + actualTitleNews );
		
	//Navigate to Features Page//
		driver.findElement(By.linkText("Features")).click();
		String actualTitleFeatures =driver.getTitle();
		System.out.println("Page title is : " + actualTitleFeatures );
		
	//Navigation to search page and search some text//
		driver.findElement(By.xpath(".//*[@id='doc2']/div[1]/div[1]/div[2]/ul/li[5]/a/span")).click();
		String actualTitlesearch=driver.getTitle();
		System.out.println("Page title is : " + actualTitlesearch );
		
		driver.findElement(By.xpath(".//*[@id='searchbox_content']")).sendKeys("Test");
	    driver.findElement(By.xpath(".//*[@id='search_form']/div/input[5]")).click();
	    
	 //search with filters//
	    driver.findElement(By.xpath(".//*[@id='doc2']/div[2]/div[4]/div[2]/div[2]/div[2]/ul/li[1]/a")).click();
	    
	    if(driver.findElement(By.xpath(".//*[@id='Article']/div[1]/p[1]")) != null);
	    {
	    	System.out.println("Test passed");
	    	/*else
	    	{
	            	System.out.println("Test Failed");
	    	}*/
	    }
		driver.close();
	}
	

}
