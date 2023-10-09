package depenedency;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class News {

	static WebDriver driver;

	public News(WebDriver driver2) {
		this.driver = driver;
	}

	public static void News() throws InterruptedException, IOException {

		driver.findElement(By.xpath("//img[@title='News']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@width='130px']")).click();
		Thread.sleep(2000);

		Runtime.getRuntime().exec("C:\\Users\\ncs\\Desktop\\fileuploadscript.exe");
		Thread.sleep(5000);

		WebElement News = driver.findElement(By.xpath("//input[@id='headline']"));
		News.sendKeys("NCS Custom Software Development and IT resourcing company");
		Thread.sleep(2000);

		WebElement description = driver.findElement(By.xpath("//input[@id='description']"));
		description
				.sendKeys("NCS is leading Product Development, Custom Software Development and IT resourcing company. "
						+ "We have expertise in product automation and providing integrated");
		Thread.sleep(2000);

		Select status = new Select(driver.findElement(By.xpath("//select[@id='status']")));
		status.selectByValue("Active");
		Thread.sleep(2000);

		WebElement Date = driver.findElement(By.xpath("//input[@id='validFrom']"));
		Date.sendKeys("22-07-2023");
		Thread.sleep(2000);

		WebElement Date1 = driver.findElement(By.xpath("//input[@id='validTo']"));
		Date1.sendKeys("25-07-2023");
		Thread.sleep(2000);

		WebElement save = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		save.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@class='btn btn-outline-secondary btn-sm'])[1]"));
		save.click();
		Thread.sleep(2000);

	}
}