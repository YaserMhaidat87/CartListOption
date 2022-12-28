import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomePage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Toshiba-com\\Desktop\\udemyfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String userName = "standard_user";
		String password = "secret_sauce";
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(userName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		String actualTitleResult = driver.getTitle();
//		String expectedTitleResult = "Swag Labs";
//		Assert.assertEquals(actualTitleResult, expectedTitleResult);

//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		
//		insted of all the previous lines from 27 ** 42
		
		List <WebElement> addButtons = driver.findElements(By.className("btn"));
		for (int i = 0; i< addButtons.size();i++) {
			
			addButtons.get(i).click();
		}
		
		int actualCartTotal = Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText()); 
    	int expectedCartTotal = 6;
	    Assert.assertEquals(actualCartTotal,expectedCartTotal );
		
	}

}
