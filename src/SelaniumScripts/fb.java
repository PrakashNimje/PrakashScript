package SelaniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
//		Launch Browser Enter URL
		driver.get("https://wallebi.asia/index");
		Thread.sleep(1000);
		
//		To Accept Cookies
		driver.findElement(By.xpath("//a[contains(@aria-label,'SafeValue must use [property]=binding:')]")).click();
//		Thread.sleep(2000);

//		To Click On FB
		driver.findElement(By.cssSelector("app-index.ng-star-inserted:nth-child(3) div.root-container:nth-child(1) mat-toolbar.mat-toolbar.mat-primary.mat-toolbar-single-row div:nth-child(3) div:nth-child(1) div.pt-1:nth-child(1) a:nth-child(1) > img.mr-3.cp")).click();
		Thread.sleep(1000);
		
//		To Click On Telegram		
		driver.findElement(By.cssSelector("app-index.ng-star-inserted:nth-child(3) div.root-container:nth-child(1) mat-toolbar.mat-toolbar.mat-primary.mat-toolbar-single-row div:nth-child(3) div:nth-child(1) div.pt-1:nth-child(1) a:nth-child(2) > img.mr-3.cp")).click();
		Thread.sleep(1000);
		
//		To Click On Tweeter
		driver.findElement(By.cssSelector("app-index.ng-star-inserted:nth-child(3) div.root-container:nth-child(1) mat-toolbar.mat-toolbar.mat-primary.mat-toolbar-single-row div:nth-child(3) div:nth-child(1) div.pt-1:nth-child(1) a:nth-child(3) > img.mr-3.cp")).click();
		Thread.sleep(1000);
		
//		To Click On Instagram
		driver.findElement(By.cssSelector("app-index.ng-star-inserted:nth-child(3) div.root-container:nth-child(1) mat-toolbar.mat-toolbar.mat-primary.mat-toolbar-single-row div:nth-child(3) div:nth-child(1) div.pt-1:nth-child(1) a:nth-child(4) > img.mr-3.cp")).click();
		Thread.sleep(1000);
		
//		To Click On FAQ
		driver.findElement(By.xpath("//a[normalize-space()='FAQ']")).click();
		Thread.sleep(2000);
		
//		To Click On Terms of Use
		driver.findElement(By.xpath("//a[normalize-space()='Terms of Use']")).click();
		Thread.sleep(2000);
		
//		To Click On Privacy Policy
		driver.findElement(By.xpath("//a[normalize-space()='Privacy Policy']")).click();
		Thread.sleep(2000);
		
//		To Click On KYC/AML Standards
		driver.findElement(By.xpath("//a[normalize-space()='KYC/AML Standards']")).click();
		Thread.sleep(2000);
		
//		To Click On Cookie policy
		driver.findElement(By.xpath("//a[normalize-space()='Cookie policy']")).click();
		Thread.sleep(2000);
		
////		Back to Home
//		driver.navigate().to("https://wallebi.asia/index");
//		
////		To Click On Telegram
//		driver.findElement(By.xpath("//div[@class='pt-1']//a[1]")).click();
//		
////		To Back to Home
//		driver.navigate().forward();
		
////   To Click On Telegram
//		driver.findElement(By.xpath("//div[@class='pt-1']//a[1]")).click();
//		
////		To click on Twitter
//		driver.findElement(By.xpath("//div[@class='pt-1']//a[1]")).click();
//		
////		To click on Instagram
//		driver.findElement(By.xpath("//div[@class='pt-1']//a[1]")).click();
//		
//		
////		To click login
////		driver.findElement(By.xpath("//a[@class='nav-link js-scroll-trigger text-purple cp'][normalize-space()='Login']")).click();

	
		
//
////		To Enter UserName
//		driver.findElement(By.id("mat-input-8")).sendKeys("prakashnimje800@gmail.com");	
////		
////        To Enter Password		
//		driver.findElement(By.id("mat-input-9")).sendKeys("Prakash@12345");
//		
////		To click on checkbox
//		driver.findElement(By.xpath("//div[@class='mat-checkbox-inner-container']")).click();
//		
////	    To Enter SignIN
//		driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
//		
////		To click on Cancel Button
//		driver.findElement(By.xpath("//span[normalize-space()='Cancel']")).click();
//		Thread.sleep(3000);
//		
//		
////		To click on Account
//		driver.findElement(By.xpath("//mat-panel-title[normalize-space()='Account']")).click();
//		Thread.sleep(2000);
//		
////		To click on Profile
//		driver.findElement(By.xpath("//body/app-root/app-layout[@class='ng-star-inserted']/mat-sidenav-container[@class='main-sidenav-container mat-drawer-container mat-sidenav-container']/mat-sidenav[@class='mat-drawer mat-sidenav ng-tns-c9-1 ng-trigger ng-trigger-transform mat-drawer-side mat-drawer-opened mat-sidenav-fixed ng-star-inserted']/div[@class='mat-drawer-inner-container']/mat-list[@id='menus']/mat-accordion[@class='mat-accordion']/mat-expansion-panel[@class='mt-10 box-sh-no mat-expansion-panel ng-tns-c12-2 mat-expanded mat-expansion-panel-spacing']/div[@id='cdk-accordion-child-0']/div[@class='mat-expansion-panel-body']/div[@class='ml-10']/a[1]/div[1]")).click();
//
//		
//		
//////		To Enter the Value House No.
////		driver.findElement(By.id("mat-input-3")).sendKeys("Prakash Home");	
////		
//////		To Enter the Value Street.
////		driver.findElement(By.id("mat-input-4")).sendKeys("Near NIT Garden");	
////		
//////		To Enter the Value Zip Code.
////		driver.findElement(By.id("mat-input-5")).sendKeys("441802");	

	}

}
