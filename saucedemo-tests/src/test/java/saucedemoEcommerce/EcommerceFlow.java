package saucedemoEcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class EcommerceFlow {
      @Test

	public  void LoginToCheckout() throws InterruptedException {
	
		ChromeOptions options = new ChromeOptions();		
		// Optional: disable infobars and notifications			
			options.addArguments("--incognito");		
					
			ChromeDriver driver = new ChromeDriver(options);		
					
				driver.get("https://www.saucedemo.com/");		
						
				driver.manage().window().maximize();



				// Step 2: Locate username, password, and login button
				WebElement username = driver.findElement(By.id("user-name"));
				username.sendKeys("standard_user");
				
				WebElement password = driver.findElement(By.id("password"));
				password.sendKeys("secret_sauce");
				
				WebElement loginButton = driver.findElement(By.id("login-button"));
				loginButton.click();
			
			
		        Thread.sleep(2000);
				// add to cart

				WebElement backpacks = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
				backpacks.click();

				//click on cart

				WebElement shoppingCart =  driver.findElement(By.className("shopping_cart_link"));
				shoppingCart.click();

				//click on checkout
			
				WebElement checkout = driver.findElement(By.id("checkout"));
				checkout.click();

				//enter details
			
				WebElement firstName = driver.findElement(By.id("first-name"));
				firstName.sendKeys("Veena");


				WebElement lastName = driver.findElement(By.id("last-name"));
				lastName.sendKeys("Singh");

				WebElement postalCode = driver.findElement(By.id("postal-code"));
				postalCode.sendKeys("123456");

				//click on continue button
				
				WebElement continueButton = driver.findElement(By.id("continue"));
				continueButton.click();


				// click on finishButton
			
				WebElement finishButton = driver.findElement(By.id("finish"));
				finishButton.click();

				//back to home
		
				WebElement backToHome = driver.findElement(By.id("back-to-products"));
				backToHome.click();

				driver.quit();
		
		

	}

}
