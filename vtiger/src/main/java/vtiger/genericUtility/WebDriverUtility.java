package vtiger.genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtility {
	
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IPathConstant.IMPLICIT_WAIT));
	}
	
	public void waitElementToBeClickable(WebDriver driver, WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IPathConstant.EXPLICIT_WAIT));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void takeScreenshot(WebDriver driver, String fileName) throws WebDriverException, IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		Files.copy(ts.getScreenshotAs(OutputType.FILE), new File(".\\src\\test\\resources\\screenshots\\"+fileName+".png"));
	}
	
	public void switchToWindow(WebDriver driver, String titleToSwitch) {
		
		Set<String> allIDs = driver.getWindowHandles();
		
		for(String id:allIDs) {
			driver.switchTo().window(id);
			
			String currentTitle = driver.getTitle();
			
			if(currentTitle.contains(titleToSwitch)) {
				break;
			}
			
		}
		
	}

}
