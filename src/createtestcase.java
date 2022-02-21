import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createtestcase {

	public static void main(String[] args) {
		
		//finding path where my chromedriver is .exe file is kept.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isagev\\Downloads\\Mallo\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://computer-database.herokuapp.com/computers");
		//i want to be sure i am on a the right url so i have to print it in my console 
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("add")).click();
		//driver.findElement(By.className("primary")).click();
		driver.findElement(By.id("name")).sendKeys("Lenovo From Isaiah Terseer");
		driver.findElement(By.id("introduced")).sendKeys("1985-01-01");
		driver.findElement(By.id("discontinued")).sendKeys("2022-02-21");
		//dropdown with select
		
		WebElement staticDropdown = driver.findElement(By.id("company"));
		//selecting my dropdown using index.
		//because is a static dropdown
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(35);
		System.out.print(dropdown.getFirstSelectedOption().getText());
		//creating a new computer
		driver.findElement(By.className("primary")).click();
		//driver.close();
	}
}
