package depenedency;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;


public class depenedency {

	WebDriver driver;
	login Loginnew;
	organization company;
	News news;
	FAQ needhelp;
	Ticket Systems;
    Adddevice device;
	
	
	
	@BeforeTest
	public void startup () {

//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	
		Loginnew = new login(driver);
		company = new organization(driver);
		news = new News(driver);
		needhelp = new FAQ(driver);
		Systems = new Ticket(driver);
		device = new Adddevice(driver);
	}

	@Test(priority = 0)
	public void Loginnew() throws InterruptedException {
		login.login();
	}
//
//	@Test(priority = 1)
//	public void company() throws Exception {
//		organization.organization();
//	}
//
//	@Test(priority = 2)
//	public void news() throws Exception {
//		News.News();
//	}
//
//	@Test(priority = 3)
//	public void needhelp() throws Exception {
//		FAQ.FAQ();
//	}
//
//	@Test(priority = 4)
//	public void Systems() throws Exception {
//		Ticket.Ticket();
//	}

	@Test(priority = 5)
	public void device() throws Exception {
		Adddevice.Adddevice();
	}
	
	
}
