package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import BaseLaye.BaseClass;

public class Actionclass extends BaseClass{

	
	public static void click(WebElement wb) {
		new Actions(driver).click(Waits.visibilityStatus(wb)).build().perform();
	}

	public static void doubleClick(WebElement wb) {
		new Actions(driver).doubleClick(Waits.visibilityStatus(wb)).build().perform();
	}

	public static void contextClick(WebElement wb) {
		new Actions(driver).contextClick(Waits.visibilityStatus(wb)).build().perform();
	}

	public static void moveToElement(WebElement wb) {
		new Actions(driver).moveToElement(Waits.visibilityStatus(wb)).build().perform();
	}

	public static void clickAndHold(WebElement wb) {
		new Actions(driver).clickAndHold(Waits.visibilityStatus(wb)).build().perform();
	}

//	public static void dragAndDrop(WebElement source, WebElement destination) {
//		new Actions(driver).dragAndDrop(Waits.visibilityStatus(source), Wait.visibilityStatus(destination)).build()
//				.perform();
//	}
}
