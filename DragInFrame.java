package Week4.Day3;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragInFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		WebElement findElement = driver.findElement(By.xpath("//div[@id='draggable']"));
//		Point location = findElement.getLocation();
//		int x = location.getX();
//		int y = location.getY();
		Actions a =new Actions(driver);
		a.dragAndDropBy(findElement, 100, 60).perform();
		
			
		
	}

}
