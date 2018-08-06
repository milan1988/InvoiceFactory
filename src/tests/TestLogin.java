package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.InvoiceFacPage;
import pages.LoginPage;

public class TestLogin extends InitTest {
	LoginPage login;
	InvoiceFacPage invoiceFac;

	@Test(priority = 0)

	public void withoutEmail() {
		login = new LoginPage(driver);
		driver.get("http://app.invoice-factory.source-code.rs");
		login.fillInputs("", "qwe123");
		login.logIn();
		Assert.assertEquals(login.isEmailMsgAt(), "The email field is required.");

	}

	@Test(priority = 1)

	public void withoutPassword() {
		login = new LoginPage(driver);
		login.fillInputs("milanvunjak88@gmail.com", "");
		login.logIn();
		Assert.assertTrue(login.isPassMsgAt());

	}

	@Test(priority = 2)

	public void incorrectEmail() {
		login = new LoginPage(driver);
		login.fillInputs("milanvunjak8@gmail.com", "qwe123");
		login.logIn();
		Assert.assertEquals(login.isInvalidMsgAt(), "Invalid credentials.");

	}

	@Test(priority = 3)

	public void incorrectPassword() {
		login = new LoginPage(driver);
		login.fillInputs("milanvunjak88@gmail.com", "qwe1234");
		login.logIn();
		Assert.assertEquals(login.isInvalidMsgAt(), "Invalid credentials.");

	}

	@Test(priority = 4)

	public void successfulLogin() {
		login = new LoginPage(driver);
		invoiceFac = new InvoiceFacPage(driver);
		login.fillInputs("milanvunjak88@gmail.com", "qwe123");
		login.logIn();
		Assert.assertTrue(invoiceFac.isUserNamePresent());

	}
}
