package depenedency;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Ticket {
	static WebDriver driver;

	public Ticket(WebDriver driver) {
		this.driver = driver;
	}
	
//	class="btn btn-outline-success btn-sm"

	public static void Ticket() throws InterruptedException, IOException {

//		driver.findElement(By.xpath("(//a[@href='#/admin'])[2]")).click();
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//div[@routerlink='/ticketmanagementlist']")).click();
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("(//a[@class='btn btn-outline-success btn-sm'])[1]")).click(); // EDIT Need Help
//		Thread.sleep(2000);
//
//		Select Severity = new Select(driver.findElement(By.xpath("//select[@id='severity']")));
//		Severity.selectByVisibleText("Major");
//		Thread.sleep(2000);
//
//		Select priority = new Select(driver.findElement(By.xpath("//select[@id='priority']")));
//		priority.selectByVisibleText("High");
//		Thread.sleep(2000);
//
//		Select AssignTo = new Select(driver.findElement(By.xpath("//select[@id='assignedTo']")));
//		AssignTo.selectByVisibleText("prince maru");
//		Thread.sleep(2000);
//
//		Select Status = new Select(driver.findElement(By.xpath("//select[@id='status']")));
//		Status.selectByVisibleText("Resolved");
//		Thread.sleep(2000);
//
//		WebElement save = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
//		save.click();
//		Thread.sleep(2000);

		// -----------------------------------------------------------------Return need
		// help for check status
//
//		driver.findElement(By.xpath("//img[@title='Help']")).click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//a[@id='two-tab']")).click();
//		Thread.sleep(5000);
//
//		// ----------------------------------------------------------Add Ticket
//
		driver.findElement(By.xpath("(//a[@href='#/admin'])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@routerlink='/ticketmanagementlist']")).click();
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//a[@id='two-tab']")).click();
//		Thread.sleep(2000);

		
		
		
		
//		Select Category = new Select(driver.findElement(By.xpath("//select[@id='category']")));
//		Category.selectByVisibleText("Software");
//		Thread.sleep(2000);
//
//		Select Severity1 = new Select(driver.findElement(By.xpath("//select[@id='severity']")));
//		Severity1.selectByVisibleText("Major");
//		Thread.sleep(2000);
//
//		Select priority1 = new Select(driver.findElement(By.xpath("//select[@name='priority']")));
//		priority1.selectByVisibleText("High");
//		Thread.sleep(2000);
//
//		Select AssignTo1 = new Select(driver.findElement(By.xpath("//select[@id='assignedTo']")));
//		AssignTo1.selectByVisibleText("Prabhakar Mandloi");
//		Thread.sleep(2000);
//
//		WebElement title = driver.findElement(By.xpath("//input[@id='headtitle']"));
//		title.sendKeys("NCS Custom Software Development and IT resourcing company");
//		Thread.sleep(2000);
//
//		WebElement Description = driver.findElement(By.xpath("//textarea[@id='description']"));
//		Description.sendKeys("NCS Custom Software Development and IT resourcing company");
//		Thread.sleep(2000);
//
//		WebElement save1 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
//		save1.click();
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='btn btn-outline-success btn-sm'])[1]")).click(); // EDIT Need Help
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//button[@data-target='#addNote']")).click();
		Thread.sleep(2000);

		WebElement addnote = driver.findElement(By.xpath("//button[@data-target='#addNote']"));
		Thread.sleep(1000);
		
		WebElement text = driver.findElement(By.xpath("(//textarea[@type='text'])[2]"));
	    text.sendKeys("NCS Custom Software Development and IT resourcing company resourcing company");
		Thread.sleep(3000);

		WebElement save2 = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		save2.click();
		Thread.sleep(2000);

		WebElement close2 = driver.findElement(By.xpath("(//button[@class='btn btn-outline-secondary btn-sm'])[1]"));
		close2.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm'])[3]")).click();
		Thread.sleep(3000);

		Runtime.getRuntime().exec("C:\\Users\\ncs\\Desktop\\fileuploadscriptticket.exe");
		Thread.sleep(5000);

		 driver.navigate().refresh();
		
			driver.findElement(By.xpath("(//button[@class='btn btn-outline-primary btn-sm'])[3]")).click();
			Thread.sleep(3000);

			Runtime.getRuntime().exec("C:\\Users\\ncs\\Desktop\\fileuploadscriptticket.exe");
			Thread.sleep(5000);
	
			driver.navigate().refresh();
			
	
	
	}

}
