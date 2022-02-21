import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deletecomputer {

	public static void main(String[] args) {
		

			//finding path where my chromedriver is .exe file is kept.
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Isagev\\Downloads\\Mallo\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();	
					driver.get("https://computer-database.herokuapp.com/computers");
					//i want to be sure i am on a the right url so i have to print it in my console 
					System.out.println(driver.getTitle());
					System.out.println(driver.getCurrentUrl());
					//sending a registered computer name
					driver.findElement(By.id("searchbox")).sendKeys("Lenovo12345");
					//filtering
					driver.findElement(By.id("searchsubmit")).click();
					//finding computer by link text
					driver.findElement(By.linkText("Lenovo12345")).click();
					//deleting computer
					driver.findElement(By.className("danger")).click();
					//driver.close();

	}

}
