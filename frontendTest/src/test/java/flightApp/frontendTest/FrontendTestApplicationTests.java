package flightApp.frontendTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.util.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class FrontendTestApplicationTests {
	ChromeDriver driver = new ChromeDriver();
	private String url = "http://localhost:3000/";
	@Test
	void RenderingListOfTrips_ReturnsTrue(){
		driver.get(url);
		List<WebElement> trips = driver.findElements(By.tagName("article"));
		assertTrue(trips.size()!= 0);
	}
	@Test
	void NavigationWorks_returnsTrue() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> buttons = driver.findElements(By.tagName("button"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		WebElement button = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/section[1]/article[1]/div[1]/button[1]"));
		Thread.sleep(1000);
		button.click();
		String currentUrl = driver.getCurrentUrl();
		assertEquals("http://localhost:3000/reservation", currentUrl);
	}

}
