package salesforce_application;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseClass;

public class SalesForceEdit extends BaseClass {
	
	

    public SalesForceEdit(ChromeDriver driver) {
		this.driver = driver;
	}


	public void editSalesForce(String fName,String desc) throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", ele);
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys(fName,Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("(//span[@class='slds-icon_container slds-icon-utility-down']/parent::a)"));
		driver.executeScript("arguments[0].click();", ele1);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//td[@role='gridcell']/span[text()='10']")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds')])[3]")).click();
		driver.findElement(By.xpath("//span[@title='Perception Analysis']")).click();
		Thread.sleep(5000);
		WebElement ele2 = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input')])[5]"));
		driver.executeScript("arguments[0].click();", ele2);
		WebElement ele3 = driver.findElement(By.xpath("//span[@title='In progress']"));
		driver.executeScript("arguments[0].click();", ele3);
		driver.findElement(By.xpath("//textarea[@part='textarea']")).sendKeys(desc);
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
		String result = driver.findElement(By.xpath("//span[text()='Perception Analysis']")).getText();
		if (result.contains("Perception")) {
			System.out.println("Edited Successfully");
		}
		else
			System.out.println("Edited Not Successfully");

		

	}
}
