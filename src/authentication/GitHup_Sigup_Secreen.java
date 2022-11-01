package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHup_Sigup_Secreen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String TestEmail= "0797204960";
		String TestPassword = "14785";
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(TestEmail);
		driver.findElement(By.id("pass")).sendKeys(TestPassword);
		driver.findElement(By.name("login")).click();
	}

}
