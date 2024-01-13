package UtilityLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLaye.BaseClass;

public class TakeScreenShot extends BaseClass{
	
	
	public static void screenShot() throws IOException {
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		File src =ts.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat date = new SimpleDateFormat("ddMMyy_HHmmss");
		
		String dt = date.format(new Date());
		
		File dist = new File(System.getProperty("user.dir")+"\\PassScreenshot\\pass"+dt+".png");
		
		FileUtils.copyFile(src, dist);
		
	}

}
