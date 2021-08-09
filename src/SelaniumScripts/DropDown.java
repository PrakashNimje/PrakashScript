package SelaniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
/*// 1)write script to select "Goa" in "From" dropdown in Spicejet home page using chrome browser.
		
		// To initialize browser
        System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		//to click on "From" dropdown
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//to select "Goa (GOI)"
		driver.findElement(By.linkText("Goa (GOI)")).click();*/
		
/*// 2)write script to select "Goa" in "From" dropdown in Spicejet home page using
		
		
				        // To initialize browser
						System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
						WebDriver driver= new ChromeDriver();
						driver.get("https://www.spicejet.com/");
						driver.manage().window().maximize();
						
						//to click on "From" dropdown
						driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
						
						//to select "Goa (GOI)"
						driver.findElement(By.linkText("Goa (GOI)")).click();	*/
		
/*//3)Develop automation test script to select "BRAHMADEVI-NLR" in "From" Dropdown in APSRTC online application.
		
		// To initialize browser
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		//To enter "NLR" into "From" dropdown
		driver.findElement(By.name("source")).sendKeys("NLR");
		
		//to pause execution
		Thread.sleep(4000);
		
		//to select "BRAHMADEVI-NLR"
		driver.findElement(By.linkText("BRAHMADEVI-NLR")).click();	*/
		
		
		System.setProperty("webdriver.gecko.driver", "./Drivers//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		//to click on "REGISTER"
		driver.findElement(By.linkText("REGISTER")).click();
		
		//configure "country" dropdown to "Select" class
		Select listCountry=new Select(driver.findElement(By.name("country")));
		
		//to Select "INDIA" using "selectByVisibleText()" method
		listCountry.selectByVisibleText("INDIA");
		
		Thread.sleep(4000);
		//to select "GERMENY" using "selectByValue()" method
		listCountry.selectByValue("242");
		
		Thread.sleep(4000);
		//to select 1st value using index
		listCountry.selectByIndex(0);
		
	}

}
