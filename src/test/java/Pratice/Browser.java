package Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws Throwable {

  String key="webdriver.edge.driver";
  String Value="./src/main/resources/msedgedriver.exe";
  System.setProperty(key, Value);
  WebDriver driver=new EdgeDriver();
    
  driver.get("http://localhost:8888/");
  driver.manage().window().maximize();
  driver.findElement(By.name("user_name")).sendKeys("admin");
  driver.findElement(By.name("user_password")).sendKeys("admin");
  
  driver.findElement(By.id("submitButton")).click();
  driver.findElement(By.linkText("Organizations")).click();
  driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
  driver.findElement(By.name("accountname")).sendKeys("Qspid12");
  driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
  
  Thread.sleep(2000);
  driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
  driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}
