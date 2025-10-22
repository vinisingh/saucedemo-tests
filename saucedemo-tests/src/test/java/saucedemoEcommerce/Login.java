package saucedemoEcommerce;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeOptions options = new ChromeOptions();

	        // Disable Chrome's password manager popups
	        Map<String, Object> prefs = new HashMap<>();
	        prefs.put("credentials_enable_service", false);
	        prefs.put("profile.password_manager_enabled", false);
	        options.setExperimentalOption("prefs", prefs);

	        // Optional: disable infobars and notifications
	        options.addArguments("--disable-notifications");
	        options.addArguments("--disable-infobars");
	        options.addArguments("--start-maximized");
		
		
		
		
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("https://www.saucedemo.com/");
         driver.manage().window().maximize();
         
         
   
         // Step 2: Locate username, password, and login button
         WebElement username = driver.findElement(By.id("user-name"));
         WebElement password = driver.findElement(By.id("password"));
         WebElement loginButton = driver.findElement(By.id("login-button"));

         // Step 3: Enter credentials
         username.sendKeys("standard_user");
         password.sendKeys("secret_sauce");

         // Step 4: Click login
         loginButton.click();  
         
         
         try {
        	    Thread.sleep(2000); // short wait to allow popup to appear
        	    Alert alert = driver.switchTo().alert();
        	    System.out.println("Alert detected after login: " + alert.getText());
        	    alert.dismiss(); // or alert.accept(); depending on popup type
        	    System.out.println("Login alert handled successfully.");
        	} catch (Exception e) {
        	    System.out.println("No alert appeared after login.");
        	}
         
         Thread.sleep(2000);
	    // add to cart
         
         WebElement backpacks = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
         backpacks.click();
         
         //click on cart
         
         WebElement shoppingCart =  driver.findElement(By.className("shopping_cart_link"));
         shoppingCart.click();
         
         //click on checkout
         Thread.sleep(2000);
         WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();
        
        //enter details
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Veena");
        
       
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Singh");
        
        WebElement postalCode = driver.findElement(By.id("postal-code"));
        postalCode.sendKeys("123456");
        
        //click on continue button
        Thread.sleep(2000);
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
        
    
        // click on finishButton
        Thread.sleep(2000);
        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();
         
         //back to home
        Thread.sleep(1000);
        WebElement backToHome = driver.findElement(By.id("back-to-products"));
        backToHome.click();
         
		
		
		
	}

}
