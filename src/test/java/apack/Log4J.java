package apack;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4J {

	public static void main(String[] args) {
		org.apache.logging.log4j.Logger log = LogManager.getLogger(Log4J.class.getName());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://omayo.blogspot.com/");
		log.debug("website opened");
		
		
		driver.findElement(By.linkText("compendiumdev")).click();
		driver.navigate().back();
		log.debug("Navigated Back");
		driver.navigate().forward();
		log.debug("Navigated Forward");
		
		

	}

}
