package Purple;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkullCandy {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skullcandy.in/");
		WebElement login = driver.findElement(By.id("Path_417"));
		login.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(0,250)");
		
		 WebElement incorrectUser = driver.findElement(By.id("username"));
		 incorrectUser.sendKeys("ammu11403"); 
		 waitForSeconds(7);
		 WebElement incorrectPassword = driver.findElement(By.xpath("//input[@id='password']"));
	     incorrectPassword.sendKeys("incorrect_password");
	     //waitForSeconds(8);
	     WebElement loginButton1 = driver.findElement(By.xpath("//button[@name='login']"));
	     loginButton1.click();
	     waitForSeconds(7);
	     js.executeScript("javascript:window.scrollBy(0,250)");
	     
		//WebElement userName = driver.findElement(By.id("username"));
		//userName.sendKeys("ammu11403");
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		passWord.sendKeys("Bindhu@123");
		waitForSeconds(7);
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		loginButton.click();
		waitForSeconds(7);
		
		WebElement skullcandy=driver.findElement(By.xpath("(//a/img[@title='Skullcandy'])[1]"));
		skullcandy.click();
		waitForSeconds(7);
		
		WebElement Searchbutton = driver.findElement(By.id("Ellipse_174"));
		Searchbutton.click();
		waitForSeconds(7);
		
		WebElement Searchbox = driver.findElement(By.xpath("//input[@id='s']"));
		Searchbox.sendKeys("headphones");
		waitForSeconds(7);
		Searchbox.sendKeys(Keys.ENTER);
		
		
		js.executeScript("javascript:window.scrollBy(0,650)");
		
		WebElement Viewoption = driver
				.findElement(By.xpath("(//a[@class='theme_btn dark full listing-page-addtocart'])[1]"));
		Viewoption.click();
		
		js.executeScript("javascript:window.scrollBy(0,450)");
		WebElement Addtocart = driver
				.findElement(By.xpath("//button[@class='custom_single_add_to_cart_button button alt']"));
		Addtocart.click();
		waitForSeconds(7);
		
		WebElement continueShop = driver.findElement(By.xpath("//*[@id=\"woofc-area\"]/div/div[3]/div[5]/span"));
		continueShop.click();
		waitForSeconds(7);
		
		WebElement earbuds = driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div[6]/a"));
		earbuds.click();
		waitForSeconds(7);
		
		js.executeScript("javascript:window.scrollBy(0,1500)");
		WebElement earbudsScroll = driver
				.findElement(By.xpath("/html/body/section[3]/div/div/div/div[8]/div/div[1]/a/img"));
		earbudsScroll.click();
		waitForSeconds(7);
		
		js.executeScript("javascript:window.scrollBy(0,450)");
		WebElement filterColour = driver
				.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[2]/div/form/div[1]/div/div[3]/div/div[2]/div[1]/div"));
		filterColour.click();
		waitForSeconds(7);
		WebElement Addtocart2 = driver
				.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[2]/div/form/div[2]/div[2]/div/button[2]"));
		Addtocart2.click();
		waitForSeconds(7);
		
		WebElement continueShop2 = driver.findElement(By.xpath("//*[@id=\"woofc-area\"]/div/div[3]/div[5]/span"));
		continueShop2.click();
		waitForSeconds(7);
		
		WebElement earbuds2 = driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div[6]/a"));
		earbuds2.click();
		waitForSeconds(7);
		
		WebElement wiredEarbuds = driver.findElement(By.xpath("/html/body/section[2]/div/div/div/div[1]/a"));
		wiredEarbuds.click();
		waitForSeconds(7);
		
		js.executeScript("javascript:window.scrollBy(0,350)");
		WebElement wiredEarbudsoption = driver.findElement(By.xpath("/html/body/section[3]/div/div/div/div[2]/div/div[1]/a/img"));
		wiredEarbudsoption.click();
		waitForSeconds(7);
		
		js.executeScript("javascript:window.scrollBy(0,160)");
		WebElement filterClick = driver
				.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[2]/div/div[2]/div"));
		filterClick.click();
		waitForSeconds(7);
		
		WebElement filterColour2 = driver
				.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[2]/div/form/div[1]/div/div[3]/div/div[2]/div[1]/div"));
		filterColour2.click();
		waitForSeconds(7);
		
		//js.executeScript("javascript:window.scrollTo(350,0)");
		//js.executeScript("javascript:window.scrollBy(0,350)");
		
		WebElement Addtocart3 = driver
				.findElement(By.xpath("/html/body/section[1]/div[2]/div/div[2]/div/form/div[2]/div[2]/div/button[2]"));
		Addtocart3.click();
		waitForSeconds(7);
		
		WebElement checkOut = driver
				.findElement(By.xpath("//*[@id=\"woofc-area\"]/div/div[3]/div[4]/div/div[2]/a"));
		checkOut.click();
		js.executeScript("javascript:window.scrollBy(0,400)");
		waitForSeconds(7);
		
		
		//WebElement streetAdd = driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]"));
//		streetAdd.sendKeys("vidyanagar Cross");
//		waitForSeconds(3);
//		streetAdd.sendKeys(Keys.ENTER);
//		
//		WebElement cityAdd = driver.findElement(By.xpath("//*[@id=\"billing_city\"]"));
//		cityAdd.sendKeys("Banglore");
//		waitForSeconds(3);
//		cityAdd.sendKeys(Keys.ENTER);
//		
//		WebElement countryDrop = driver
//				.findElement(By.xpath("//*[@id=\"billing_state_field\"]/span/span/span[1]/span"));
//		countryDrop.click();
//		
//		WebElement selectDrop = driver.findElement(By.xpath("/html/body/span/span/span[1]/input"));
//		selectDrop.sendKeys("Karnataka");
//		waitForSeconds(3);
//		selectDrop.sendKeys(Keys.ENTER);
//		
//		WebElement pinCode = driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]"));
//		pinCode.sendKeys("562157");
//		waitForSeconds(3);
//		pinCode.sendKeys(Keys.ENTER);
//		
//		WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\"billing_phone\"]"));
//		phoneNumber.sendKeys("8296364717");
//		waitForSeconds(3);
//		phoneNumber.sendKeys(Keys.ENTER);
		
		
		WebElement checkOutHome = driver
				.findElement(By.xpath("/html/body/header/div[1]/div[1]/div/div[1]/div[1]/a/img"));
		checkOutHome.click();
		driver.get("https://www.skullcandy.in/");
	
		
		driver.quit();
	}
		 private static void waitForSeconds(int seconds)
		 {
		        try {
		            Thread.sleep(seconds * 10000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		    }
	
}