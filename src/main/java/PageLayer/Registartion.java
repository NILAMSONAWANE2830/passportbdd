package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLaye.BaseClass;
import UtilityLayer.DropDownSelection;
import UtilityLayer.RadioButton;

public class Registartion extends BaseClass {

	@FindBy(xpath = "//label[text()='Passport Office']")
	private WebElement passbutton;

	@FindBy(xpath = "//select[@id='dcdrLocation']")
	private WebElement passportoffcity;

	@FindBy(xpath = "//input[@name='givenName']")
	private WebElement fullname;

	@FindBy(xpath = "//input[@name='surname']")
	private WebElement surname;

	@FindBy(xpath = "//input[@name='dob']")
	private WebElement calender;

	@FindBy(name = "email")
	private WebElement email;

	@FindBys({ @FindBy(xpath = "//input[@name='emailloginSame']") })
	private List<WebElement> option;

	@FindBy(name = "loginId")
	private WebElement loginId;

	@FindBy(id = "pwd")
	private WebElement password;

	@FindBy(id = "confirmPwd")
	private WebElement confirmPwd;

	@FindBy(id = "hintQues")
	private WebElement hintquestion;

	@FindBy(id = "hintAns")
	private WebElement hintAns;

	
	
	public Registartion() {
		PageFactory.initElements(driver, this);
	}

	public void registrationfunctinality(String city, String fname, String lname, String dmy, String mail, String yesno,
			String logID, String pass, String cnfpass, String question, String ans) {

		passbutton.click();

		DropDownSelection.selectDropDownElemnet(passportoffcity, city);

		fullname.sendKeys(fname);

		surname.sendKeys(lname);

		calender.click();

		calender.sendKeys(dmy);

		email.sendKeys(mail);

		RadioButton.radioButton(option, yesno);

		loginId.sendKeys(logID);

		password.sendKeys(pass);

		confirmPwd.sendKeys(cnfpass);

		DropDownSelection.selectDropDownElemnet(hintquestion, question);

		hintAns.sendKeys(ans);

	}

}
