import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class readcomputerbyfilter {

	public static void main(String[] args) {

		//finding path where my chromedriver is .exe file is kept.
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isagev\\Downloads\\Mallo\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();	
				driver.get("https://computer-database.herokuapp.com/computers");
				//i want to be sure i am on a the right url so i have to print it in my console 
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				//sending a registered computer name
				driver.findElement(By.id("searchbox")).sendKeys("Apple");
				//filtering
				driver.findElement(By.id("searchsubmit")).click();
				//driver.close();

	}

}
