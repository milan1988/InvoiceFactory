package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.InvoiceFacPage;

public class TestInvoiceFac extends InitTest {
	InvoiceFacPage invoiceFac;

	@Test(priority = 5)

	public void testSelectClientField() {
		invoiceFac = new InvoiceFacPage(driver);
		invoiceFac.chooseClient();
		Assert.assertEquals(invoiceFac.getListSize(), "2");
	}

	@Test(priority = 6)

	public void testAllClients() {
		invoiceFac = new InvoiceFacPage(driver);
		invoiceFac.goToAllClients();
		Assert.assertEquals(invoiceFac.getListSizeAllClients(), "8");
	}

	@Test(priority = 7)

	public void testDateFieldFrom() {
		invoiceFac = new InvoiceFacPage(driver);
		invoiceFac.pickDateFrom();
		Assert.assertEquals(invoiceFac.checkTxtFieldFrom(), "2018-07-31");
		Assert.assertEquals(invoiceFac.getListSizeFieldFrom(), "5");

	}

	@Test(priority = 8)

	public void testDateFieldTo() {
		invoiceFac = new InvoiceFacPage(driver);
		invoiceFac.pickDateTo();
		Assert.assertEquals(invoiceFac.checkTxtFieldTo(), "2018-07-30");
		Assert.assertEquals(invoiceFac.getListSizeFieldTo(), "3");

	}

	@Test(priority = 9)

	public void testSetPeriodThisMonth() {
		invoiceFac = new InvoiceFacPage(driver);
		invoiceFac.setPeriodThisMonth();
		Assert.assertEquals(invoiceFac.checkTxtFieldFrom(), "2018-08-01");
		Assert.assertEquals(invoiceFac.checkTxtFieldTo(), "2018-08-31");
		Assert.assertEquals(invoiceFac.getListSizeThisMonth(), "3");

	}

	@Test(priority = 10)

	public void testSetPeriodLastMonth() {
		invoiceFac = new InvoiceFacPage(driver);
		invoiceFac.setPeriodLastMonth();
		Assert.assertEquals(invoiceFac.checkTxtFieldFrom(), "2018-07-01");
		Assert.assertEquals(invoiceFac.checkTxtFieldTo(), "2018-07-31");
		Assert.assertEquals(invoiceFac.getListSizeLastMonth(), "5");
	}

	@Test(priority = 11)

	public void testSetPeriodResetDates() {
		invoiceFac = new InvoiceFacPage(driver);
		invoiceFac.setPeriodResetDates();
		Assert.assertEquals(invoiceFac.getListSizeResetDates(), "8");
	}

	@Test(priority = 12)

	public void testResetButton() {
		invoiceFac = new InvoiceFacPage(driver);
		invoiceFac.goToResetButton();
		Assert.assertEquals(invoiceFac.getListSizeResetButton(), "8");
	}

	@Test(priority = 13)

	public void testChangedStatus() {
		invoiceFac = new InvoiceFacPage(driver);
		invoiceFac.changeStatus();
		Assert.assertEquals(invoiceFac.getChangedStatusTxt(), "Invalidated");
	}

	@Test(priority = 14)

	public void testEditOption() {
		invoiceFac = new InvoiceFacPage(driver);
		invoiceFac.goToEditBtn();
		Assert.assertEquals(invoiceFac.getChangedClientName(), "Dejan Ilic");
	}

	@Test(priority = 15)

	public void testPreviewOption() {
		invoiceFac = new InvoiceFacPage(driver);
		invoiceFac.goToPreviewBtn();
		Assert.assertEquals(invoiceFac.getTitlePreviewInvoice(), "Preview Invoice");
		Assert.assertTrue(invoiceFac.isChangeClientEnabled());
		invoiceFac.closePreviewInvoice();
		Assert.assertEquals(invoiceFac.getTxtInvoicesList(), "Invoices List");
	}

	@Test(priority = 16)

	public void testDeleteInvoice() {
		invoiceFac = new InvoiceFacPage(driver);
		invoiceFac.deleteInvoice();
		Assert.assertEquals(invoiceFac.getListSizeAfterDeleteInvoice(), "7");
	}

	@Test(priority = 17)

	public void testAddNewInvoice() {
		invoiceFac = new InvoiceFacPage(driver);
		invoiceFac.addNewInvoice();
		Assert.assertEquals(invoiceFac.getListSizeAddNewInvoice(), "8");
	}
}
