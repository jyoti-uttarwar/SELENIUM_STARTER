package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchAmazon extends TestCases{

    public void TC_searchAmazon(){
        // Get the Url  "https://www.google.com/"
        driver.get("https://www.google.com/");
        // Locate the Search inputBox Using Locator "ID" "APjFqb"
        WebElement eleSearchBox = driver.findElement(By.id("APjFqb"));
        // Type the input String  "Amazon"
        eleSearchBox.sendKeys("Amazon");
        // Locate the Google Search button Using Locator "XPath" "(//input[@name='btnK'])[1]"
        // Click "Google search" button  
        driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
        // Validate for"Amazon.in" link Using Locator "XPath" "//span[text()='Amazon.in']"
        boolean status = driver.findElement(By.xpath("//span[text()='Amazon.in']")).isDisplayed();
        // Print the Result in the console  
        System.out.println("Is the link present : " + status);
    }

}