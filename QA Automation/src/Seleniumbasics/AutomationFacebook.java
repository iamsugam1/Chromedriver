package Seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomationFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);

		

		driver.get("https://www.facebook.com");
		WebElement UserNameBox = driver.findElement(By.id("email"));
		driver.findElement(By.id("email")).sendKeys("anticbaby@gmail.com");
		// git.close();

		driver.findElement(By.id("pass")).sendKeys("qaclass123");

		driver.findElement(By.name("login")).click();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(
				"//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[1]/a/div[1]/div"))
				.click();
		driver.findElement(By.xpath("//a[text()='Friends']")).click();
		//
//		driver.get("https://github.com/iamsugam1/eclipse");
//		System.out.println(driver.getTitle());
//		driver.close();
//		

//		driver.get("https://github.com/iamsugam1/eclipse");
	}

}
