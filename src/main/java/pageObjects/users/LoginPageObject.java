package pageObjects.users;

import org.openqa.selenium.WebDriver;

import commons.BaseElement;
import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.users.LoginPageUI;

public class LoginPageObject extends BasePage {

	private WebDriver driver;
	
	public LoginPageObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public String getLoginPageUrl() {
		return getPageUrl(driver);	
	}
	
	public void clickToHereLink() {
		
	}
	
	public void inputToUserIDTextBox(String emailAdress) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, emailAdress);
	}

	public void inputToPasswordTextBox(String password) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
	}

	public void clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);	
	}
	
}
