package salesforce_application;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseClass;

public class SalesForceCreat extends BaseClass {


	public SalesForceCreat(ChromeDriver driver) {
		this.driver = driver;
	}


	public void creatsalesforce(String pName,String value) throws InterruptedException { 


		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//driver.executeScript("arguments[0].click();", clickview);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", ele);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Opportunity Name')]/following::input[@class='slds-input']")).sendKeys(pName);
		driver.findElement(By.xpath("//div[@type='text']/input[@name='Amount']")).sendKeys(value);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//button[text()='Today']")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds')]/span[@class='slds-truncate'])[2]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		String result = driver.findElement(By.xpath("//div[@class='slds-media__body']/h1")).getText();
		if (result.contains("Ajith")) {
			System.out.println("Opportunity created");
		}
		else
			System.out.println("Opportunity not created");


	}
}
