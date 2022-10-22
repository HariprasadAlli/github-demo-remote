package apack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("uploadfile"))).click().build().perform();
		//till here selenium completed
		
		//AutoIT
		Runtime.getRuntime().exec("D:\\thisforjava\\POMPF\\AutoItExecutableFiles\\BrowsingExcelfile.exe");
		

	}

}
