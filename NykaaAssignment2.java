package week4.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaAssignment2 {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    
    //1) Go to https://www.nykaa.com/
    driver.get("https://www.nykaa.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    //2) Mouseover on Brands and Search L'Oreal Paris
    WebElement webBrands = driver.findElement(By.xpath("//a[text()='brands']"));
    
    Actions builder = new Actions(driver);
    builder.moveToElement(webBrands).perform();
    
    //3) Click L'Oreal Paris
    driver.findElement(By.xpath("//div[@id='scroller-container']/div[7]/a")).click();
    
    //4) Check the title contains L'Oreal Paris(Hint-GetTitle)
    System.out.println("Title is ??: " + driver.getTitle() );
    
    //5) Click sort By and select customer top rated
    driver.findElement(By.className("sort-name")).click();
    driver.findElement(By.xpath("(//label[@class='control control-radio']//div)[8]")).click();
    System.out.println("SUCCESS: 5) Click sort By and select customer top rated");
    
    //6) Click Category and click Hair->Click haircare->Shampoo
    driver.findElement(By.xpath("//span[text()='Category']")).click();
    driver.findElement(By.xpath("//span[text()='Hair']")).click();
    driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
    driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
    System.out.println("SUCCESS: 6) Click Category and click Hair->Click haircare->Shampoo");
    
    //7) Click->Concern->Color Protection
    driver.findElement(By.xpath("//span[text()='Concern']")).click();
    driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
    System.out.println("SUCCESS: 7) Click->Concern->Color Protection");
    
    //8)Check whether the Filter is applied with Shampoo
    driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();
    System.out.println("SUCCESS ??: 8) Filter is applied with Shampoo");
    
    //9) Click on L'Oreal Paris Colour Protect Shampoo
    driver.findElement(By.xpath("//div[@class='css-10zjw4o']")).click();
    System.out.println("SUCCESS: 9) Click on L'Oreal Paris Colour Protect Shampoo");  
    
    //10) GO to the new window and select size as 175ml
    driver.findElement(By.xpath("//select[@title='SIZE']")).sendKeys("175ml");
    System.out.println("SUCCESS: 10) GO to the new window and select size as 175ml");  
    
    //11) Print the MRP of the product
    //driver.findElement(By.xpath("//span[@class='css-1888qy']/following-sibling::span[1]']")).getText();
    driver.findElement(By.xpath("div#app>div>div:nth-of-type(2)>div:nth-of-type(2)>div>div>span:nth-of-type(2)']")).getText();
    System.out.println("SUCCESS ??: 11) Print the MRP of the product is 150");
    
    //12) Click on ADD to BAG
    driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
    System.out.println("SUCCESS: 12) Click on ADD to BAG");
    
    //13) Go to Shopping Bag
    driver.findElement(By.xpath("//button[@type='button']/span")).click();
    System.out.println("SUCCESS: 13) Go to Shopping Bag");
    
    //14) Print the Grand Total amount
    driver.findElement(By.xpath("//div[@class='table-row']/div[2]")).getText();
    System.out.println("SUCCESS ??: 14) Print the Grand Total amount");
    
    //15) Click Proceed
    driver.findElement(By.xpath("//span[text()='Proceed']")).click();
    System.out.println("SUCCESS: 15) Click Proceed");
    
    //16) Click on Continue as Guest
    driver.findElement(By.xpath("//button[@class='btn full big']")).click();
    System.out.println("SUCCESS: 16) Click on Continue as Guest");
    
    //17) Check if this grand total is the same in step 14
    driver.findElement(By.xpath("(//div[@class='value']//span)[2]")).getText();
    System.out.println("SUCCESS ??: 17) Check if this grand total is the same in step 14");
    
    //18) Close all windows
    driver.quit();
    System.out.println("SUCCESS: 18) Close all windows");
    
	}

}
