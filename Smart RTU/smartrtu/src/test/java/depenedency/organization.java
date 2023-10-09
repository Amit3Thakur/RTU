package depenedency;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class organization {

	static WebDriver driver;

	public organization(WebDriver driver) {
		this.driver = driver;

	}

	public static void organization() throws InterruptedException, AWTException, Exception {

		driver.findElement(By.xpath("//img[@title='Organization Setting']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@href='#/organization'])[2]")).click();
	Thread.sleep(2000);

		Runtime.getRuntime().exec("C:\\Users\\ncs\\Desktop\\fileuploadscript.exe");
		Thread.sleep(5000);

		WebElement orgname = driver.findElement(By.xpath("//input[@type='text']"));
		orgname.sendKeys("neno system consultancy");
		Thread.sleep(2000);

		WebElement Email = driver.findElement(By.xpath("//input[@type='officialEmail']"));
		Email.sendKeys("ncs121tech@gmail.com");
		Thread.sleep(2000);

		WebElement number = driver.findElement(By.xpath("//input[@type='number']"));
		number.sendKeys("8770297471.com");
		Thread.sleep(2000);

		WebElement Text = driver.findElement(By.xpath("//textarea[@id='description']"));
		Text.sendKeys("We are honest and responsible. If we can do it, we’ll do it well."
				+ " If we can’t do it, we’ll let you know upfront.");
		Thread.sleep(2000);

		WebElement Alarm1 = driver.findElement(By.xpath("//input[@type='a1']"));
		Alarm1.sendKeys("AC");
		Thread.sleep(2000);

		WebElement Alarm2 = driver.findElement(By.xpath("//input[@type='a2']"));
		Alarm2.sendKeys("DC");
		Thread.sleep(2000);

		WebElement Alarm3 = driver.findElement(By.xpath("//input[@type='a3']"));
		Alarm3.sendKeys("EB");
		Thread.sleep(2000);

		WebElement Alarm4 = driver.findElement(By.xpath("//input[@type='a4']"));
		Alarm4.sendKeys("fuel");
		Thread.sleep(2000);

		WebElement save = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		save.click();
		Thread.sleep(2000);

		WebElement list = driver.findElement(By.xpath("(//a[@href='#/organizationlist'])[3]"));
		list.click();
		Thread.sleep(2000);

		WebElement Organizationsearch = driver.findElement(By.xpath("(//input[@id='organizationName'])[1]"));
		Organizationsearch.sendKeys("neno system consultancy");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();// search
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[2]")).click();// erase
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();// search
		Thread.sleep(2000);

		WebElement pno = driver.findElement(By.xpath("(//input[@id='phoneNo'])[1]"));
		pno.sendKeys("7878798787");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();// search
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[2]")).click();// erase
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm ml-2'])[1]")).click();// search
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@class='btn btn-outline-success btn-sm'])[1]")).click();// EDIT
		Thread.sleep(2000);

		WebElement orgname1 = driver.findElement(By.xpath("//input[@type='text']"));
		orgname1.clear();
		orgname1.sendKeys("NCS SOFTWARE COMPANY INDORE");
		Thread.sleep(2000);

		WebElement save1 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		save1.click();
		Thread.sleep(2000);

		WebElement list1 = driver.findElement(By.xpath("(//a[@href='#/organizationlist'])[3]"));
		list1.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@title='Delete']")).click();// Delete
		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

}
