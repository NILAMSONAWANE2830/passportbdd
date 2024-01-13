package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

public class RadioButton {
	
	
	public static void radioButton(List<WebElement>  wb,String value) {
		
		for(WebElement wb1 :wb) {
			
			if(wb1.getText().equalsIgnoreCase(value)) {
				wb1.click();
				break;
			}else {
				wb1.click();
			}
		}
	}

}
