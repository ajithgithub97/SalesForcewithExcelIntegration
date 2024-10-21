package salesforce_application;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseClass;

public class SalesForceGroupEdit extends BaseClass{
	
	 public SalesForceGroupEdit(ChromeDriver driver) {
			this.driver = driver;
		}
	
	
	public  void editSalesForceGroup() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//p[text()='Work Type Groups']"));
		driver.executeScript("arguments[0].click();", ele);
		WebElement clickWorkType = driver.findElement(By.xpath("//a[contains(@title,'Recently Viewed')]/span"));
		driver.executeScript("arguments[0].click();", clickWorkType);
		driver.findElement(By.xpath("(//div[@part='input-container']/input)[1]")).sendKeys("Salesforce Automation by Ajith",Keys.ENTER);
		Thread.sleep(3000);
		WebElement editClick = driver.findElement(By.xpath("(//div[contains(@class,'forceVirtualActionMarker')]//span)[1]"));
		driver.executeScript("arguments[0].click();", editClick);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Automation");
		driver.findElement(By.xpath("//button[contains(@class,'slds-input_faux fix-slds-input_faux slds-combobox__input-value')]")).click();
		driver.findElement(By.xpath("//span[@title='Capacity']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		WebElement clicksalesforce = driver.findElement(By.xpath("//a[contains(@title,'Salesforce')]"));
		driver.executeScript("arguments[0].click()", clicksalesforce);
		 String res = driver.findElement(By.xpath("(//span[contains(@class,'test-id__field-value')])[2]")).getText();
		if (res.contains("Automation")) {
			System.out.println("Description updated");
		}
		else 
			System.out.println("Description not updated");
		
	}
}
