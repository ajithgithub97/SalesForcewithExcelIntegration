package salesforce_application;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import base.BaseClass;

public class SalesForceLeaglEntityEdit extends BaseClass {
	 public SalesForceLeaglEntityEdit(ChromeDriver driver) {
			this.driver = driver;
		}
	
   
	public void editLegalEntity() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		WebElement clicklegalentity = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		driver.executeScript("arguments[0].click();", clicklegalentity);
		WebElement clicklegalentity1=  driver.findElement(By.xpath("(//span[text()='Legal Entities'])[1]"));
		driver.executeScript("arguments[0].click();", clicklegalentity1);
		driver.findElement(By.xpath("//input[@name='LegalEntity-search-input']")).sendKeys("SalesForce Automation by Ajith",Keys.ENTER);
		Thread.sleep(3000);
		WebElement clickdd = driver.findElement(By.xpath("(//div[contains(@class,'forceVirtualActionMarker')]//span)[1]"));
		driver.executeScript("arguments[0].click()", clickdd);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Sales Force");
		WebElement clickactive = driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux fix-slds-input_faux ')]"));
		driver.executeScript("arguments[0].click();", clickactive);
		String verify = driver.findElement(By.xpath("//span[text()='Active']")).getText();
		if (verify.contains("Active")) {
			System.out.println("Status Verified");
		}
		else
			System.out.println("Status Not Verified");
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
	}
}
