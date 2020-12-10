package Seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/iamsugam1/eclipse");
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
