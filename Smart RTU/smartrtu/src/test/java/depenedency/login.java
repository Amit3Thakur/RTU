package depenedency;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class login {

	static WebDriver driver;

	public login(WebDriver driver) {
		this.driver = driver;

	}

	public static void login() throws InterruptedException {

		driver.get("http://209.126.105.240:9090/SMARTRTU/#/login");
		Thread.sleep(2000);

//		@Given("the user is on the login page")
		WebElement LoginId = driver.findElement(By.xpath("//input[@id='loginid']"));
		LoginId.sendKeys("amit.thakur@nenosystems.in");
		Thread.sleep(2000);

//		@When("the user enters valid credentials")
		WebElement Password1 = driver.findElement(By.xpath("//input[@id='password']"));
		Password1.sendKeys("pass1234");
		Thread.sleep(2000);

//		 @When("clicks on the login button")
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		Thread.sleep(1000);

	}

}
