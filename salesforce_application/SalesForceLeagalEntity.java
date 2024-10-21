package salesforce_application;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import base.BaseClass;

public class SalesForceLeagalEntity extends BaseClass {
	
	 public SalesForceLeagalEntity(ChromeDriver driver) {
			this.driver = driver;
		}
	
	public  void LeaglEntity() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
        WebElement clicklegalentity = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
        driver.executeScript("arguments[0].click();", clicklegalentity);
        driver.findElement(By.xpath("(//*[@data-key='chevrondown'])[6]")).click();
        Thread.sleep(3000);
       WebElement clicknewlegalentity = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
       driver.executeScript("arguments[0].click()", clicknewlegalentity);
       driver.findElement(By.xpath("(//div[contains(@class,'slds-form-element__control slds-grow')]//input[@class='slds-input'])[2]")).sendKeys("SalesForce Automation by Ajith");
       driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
       String verify = driver.findElement(By.xpath("//div[@class='slds-media__body']")).getText();
       if (verify.contains("Ajith")) {
		System.out.println("Leagl Entity verified");
	}
       else
    	   System.out.println("Legal Entity Not verify");
       
	}

}
