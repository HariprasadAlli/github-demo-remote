package ppack;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.LoginPage;
import objectrepository.MyAccountPage;

public class LoginTest {
	WebDriver driver;
	
	@Test
	public void login() {
		
		System.out.println("Hello I have updated");
		System.out.println("Changes");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailField().sendKeys("hariprasadalli@gmail.com");
		loginPage.passwordField().sendKeys("123@");
		loginPage.loginButton().click();
		
		MyAccountPage myAccountPage = new MyAccountPage(driver);
		Assert.assertTrue(myAccountPage.accountBreadCrumb().isDisplayed());
		
	}
	@AfterMethod
	public void closure() {
		driver.close();
	}
	

}
