package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits extends BaseLaye.BaseClass {
	public static  WebElement visibilityStatus(WebElement wb) {
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	}

	public static void sendkeys(WebElement wb, String value) {
		visibilityStatus(wb).sendKeys(value);
	}

	public static void click(WebElement wb) {
		visibilityStatus(wb).click();
	}

	public String gettext(WebElement wb) {
		return visibilityStatus(wb).getText();
	}

	public String getatribute(WebElement wb, String key) {
		return visibilityStatus(wb).getAttribute(key);
	}
	
	public void selectAnyButton(List<WebElement>ls,String value) {
		List<WebElement>list=new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(ls));
	     for(WebElement ws:list) {
	    	 if(ws.getText().equalsIgnoreCase(value)) {
	    		 ws.click();
	    		 break;
	    	 }
	     }
	
	}
	public static boolean isSelected(WebElement wb) {

		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).isSelected();
	}
	public static void clear(WebElement wb) {

		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).clear();
	}
}
