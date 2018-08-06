package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BusinessPage;
import pages.InvoiceFacPage;

public class TestBusiness extends InitTest {
	InvoiceFacPage invoiceFac;
	BusinessPage business;

	@Test(priority = 18)

	public void testAddNewBusiness() {
		invoiceFac = new InvoiceFacPage(driver);
		business = new BusinessPage(driver);
		business.goToBussinesList();
		Assert.assertEquals(business.getBusinessListSize(), "6");
	}

	@Test(priority = 19)

	public void testViewDetailsAndEdit() {
		business = new BusinessPage(driver);
		business.goToViewDetails();
		Assert.assertEquals(business.getDetails(), "Address, Zip, City, Country");
		business.editBusinessName();
		Assert.assertEquals(business.checkNewBusinessName(), "Financial products");

	}

	@Test(priority = 20)

	public void testDeleteBusinessOption() {
		business = new BusinessPage(driver);
		business.deleteBusiness();
		Assert.assertEquals(business.getBussinessListSizeAfterDelete(), "5");
	}

}
