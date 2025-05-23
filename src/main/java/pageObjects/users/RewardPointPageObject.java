package pageObjects.users;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageGeneratorManager;
import pageUIs.users.RewardPointPageUI;

public class RewardPointPageObject extends SideBarMyAccountPageObject {
	private WebDriver driver;
	
	public RewardPointPageObject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
}
