package Week4.Day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testleaf.herokuapp.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Simple alert
		//Find the element and click on it
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		//Using switchToAlert() to switch to alert box since no inspect
		Alert alert2 = driver.switchTo().alert();
		//Getting a text before accept
		System.out.println("Simple Alert "+alert2.getText());
		alert2.accept();
		
		//Confirm alert
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println("Confirm Alert "+alert3.getText());
		alert3.accept();
		
		//Prompt Alert
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("TestLeaf");
		//Cancelling the alert
		alert.dismiss();
		String text = driver.findElement(By.id("result1")).getText();
		System.out.println("Prompt Alert "+text);
		
		
		

	}

}
