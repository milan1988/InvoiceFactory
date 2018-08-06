package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageObject {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "login-form-email")
	WebElement email;

	@FindBy(id = "login-pass")
	WebElement pass;

	@FindBy(css = "div[class='v-btn__content']")
	WebElement login;

	@FindBy(xpath = "//*[@id=\"app\"]/div/main/div/div/div/div/form/div[1]/div[1]/div/div[2]/div/div/div")
	WebElement emailMessage;

	@FindBy(xpath = "//*[@id=\"app\"]/div/main/div/div/div/div/form/div[1]/div[2]/div/div[2]/div[1]/div/div")
	WebElement passMessage;

	@FindBy(css = "#app > div > div > div > div > p")
	WebElement invalidMessage;

	public void fillInputs(String email, String pass) {
		this.email.clear();
		this.email.sendKeys(email);

		this.pass.clear();
		this.pass.sendKeys(pass);
	}

	public void logIn() {
		wait.until(ExpectedConditions.visibilityOf(login));
		login.click();
	}

	public String isEmailMsgAt() {
		wait.until(ExpectedConditions.visibilityOf(emailMessage));
		return emailMessage.getText();
	}

	public boolean isPassMsgAt() {
		wait.until(ExpectedConditions.textToBePresentInElement(passMessage, "The password field is required."));
		return passMessage.isDisplayed();
	}

	public String isInvalidMsgAt() {
		wait.until(ExpectedConditions.visibilityOf(invalidMessage));
		return invalidMessage.getText();
	}
}
