package Week4.Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SweetAlert {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01d27i52u3p0oafo3zs46w5dte367032.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Sweet Alert so no need of switchToAlert() fn directly go with inspect
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String text = driver.findElement(By.xpath("//span[text()='Are you sure you want to proceed?']")).getText();
		System.out.println(text);
		driver.findElement(By.id("j_idt88:j_idt108")).click();
		
	}

}
