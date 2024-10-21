package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadData;

public class BaseClass {

	public ChromeDriver driver;
	public ChromeOptions option;
	public String filename;

	@Parameters({"url","uName","pWord"})
	@BeforeMethod
	public void precondition(String url,String uName,String pWord) {

		option = new ChromeOptions();
		option.addArguments("--disable-notification");			
		driver = new ChromeDriver(option);
		driver.get(url);
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.id("Login")).click();

	}
	@AfterMethod
	public void postcondition() {

		driver.close();
	}
	@DataProvider(name = "fetchdata")
	public String[][] receivedata() throws IOException {
		return ReadData.readData(filename);

	}
	
}
