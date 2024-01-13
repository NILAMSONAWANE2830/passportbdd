package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLaye.BaseClass;

public class DropDownSelection extends BaseClass{
	
	public static void selectDropDownElemnet(WebElement wb,String value) {
		
		
		Select sel =new Select(wb);
		
		sel.selectByVisibleText(value);
		
	}

}
