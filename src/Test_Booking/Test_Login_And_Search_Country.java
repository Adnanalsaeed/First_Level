package Test_Booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Login_And_Search_Country {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String UserNameTest = "adnanalsaeed53@gmail.com" ;
		String PasswordTest = "Alsaeed@11";
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://WWW.Booking.com");
		driver.findElement(By.className("js-header-login-link")).click();
		driver.findElement(By.id("username")).sendKeys(UserNameTest);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(PasswordTest);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.xpath("//input[@id='ss']")).sendKeys("Amman");
	}

}
