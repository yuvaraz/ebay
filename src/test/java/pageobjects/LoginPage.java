package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.appium.base.BaseClass;
import com.appium.base.CommonMethod;

public class LoginPage extends BaseClass{


	public By singIn = By.id("com.ebay.mobile:id/button_sign_in");
	public By txtUserName = By.id("com.ebay.mobile:id/edit_text_username");
	public By txtPassword = By.id("com.ebay.mobile:id/edit_text_password");
	public By btnLogin = By.id("com.ebay.mobile:id/button_sign_in");

	public String email;
	public String password;
	
	public void userLogin() throws Exception {

		CommonMethod.click(singIn);
		CommonMethod.sendKeys(txtUserName, email);
		CommonMethod.sendKeys(txtPassword, password);
	}
	
	public void clickOnSignInButton() {
		CommonMethod.click(singIn);
	}
	
	public void clickOnLoginButton() throws InterruptedException {
		CommonMethod.click(btnLogin);
		Thread.sleep(15000);
	}
	
	public void getLoginDataFromSheet() {
		email = ereader.getCellData("Login", 1, 0);
		password = ereader.getCellData("Login", 1, 1);
	}
	
	
	
	
	
	
	
	
	
	
	
}