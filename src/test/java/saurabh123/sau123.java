package saurabh123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sau123 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("markborse098@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
}
}
