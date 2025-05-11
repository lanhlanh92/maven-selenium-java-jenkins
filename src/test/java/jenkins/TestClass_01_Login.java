package jenkins;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass_01_Login {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com/");
	}
	@Test
	public void TC_01_runForEachTest() {
		System.out.println("sdvghfjdks");
	}
	@Test
	public void TC_02_runForEachTest() {
		System.out.println("sdvghfjdks");
	}
	@Test
	public void TC_03_runForEachTest() {
		System.out.println("sdvghfjdks");
	}
	@Test
	public void TC_04_runForEachTest() {
		System.out.println("sdvghfjdks");
	}
	
	@AfterClass 
	public void afterClass() {
	}	
}
