package commons;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.users.HomePageObject;
import pageUIs.users.BaseElementUI;

public class BaseElement extends BasePage {

	private WebDriver driver;
	
	public BaseElement(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void clickToHeaderLinkByName(String pageName) {
		waitForElementClickable(driver, BaseElementUI.DYNAMIC_HEADER_LINKS_BY_NAME, pageName);
		clickToElement(driver, BaseElementUI.DYNAMIC_HEADER_LINKS_BY_NAME, pageName);
	}
	
	public void clickToButtonByText(String buttonText) {
		waitForElementClickable(driver, BaseElementUI.DYNAMIC_BUTTON_BY_TEXT, buttonText);
		clickToElement(driver, BaseElementUI.DYNAMIC_BUTTON_BY_TEXT, buttonText);
	}
	public String getTextboxErrorMessageByID(String errorMessageID) {
		waitForElementVisible(driver, BaseElementUI.DYNAMIC_TEXTBOX_ERROR_MSG_BY_ID, errorMessageID);
		return getElementText(driver, BaseElementUI.DYNAMIC_TEXTBOX_ERROR_MSG_BY_ID, errorMessageID);
	}
	
	public void enterToTextboxByID(String textboxID, String valueSenkey) {
		waitForElementVisible(driver, BaseElementUI.DYNAMIC_TEXTBOX_BY_ID, textboxID);
		senkeyToElement(driver, BaseElementUI.DYNAMIC_TEXTBOX_BY_ID, valueSenkey, textboxID);
	}
	
	public String getTextboxAttributeByID(String textboxID) {
		waitForElementVisible(driver, BaseElementUI.DYNAMIC_TEXTBOX_BY_ID, textboxID);
		return getElementAtribute(driver, BaseElementUI.DYNAMIC_TEXTBOX_BY_ID, "value", textboxID);	
	}
	
	public void clickToCheckBoxVerify() {
		waitForElementInvisiable(driver, BaseElementUI.ICON_LOADING);
		waitForElementClickable(driver, BaseElementUI.INPUT_CHECKBOX_VERIFYING);
		clickToElement(driver, BaseElementUI.INPUT_CHECKBOX_VERIFYING);
	}
}

