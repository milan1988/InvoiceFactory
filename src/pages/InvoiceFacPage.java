package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InvoiceFacPage extends PageObject {

	public InvoiceFacPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "home-page-user")
	WebElement username;

	@FindBy(css = "label[for='filter-client']")
	WebElement selectClient;

	@FindBy(xpath = "//*[@id=\"app\"]/div[35]/div/div/div[4]/a/div/div")
	WebElement clientPetar;

	@FindBy(id = "inv-client-2018-CVB2")
	WebElement lastPetar;

	@FindBy(className = "invoice-list-items mt-1 mb-1 v-card theme--light")
	List<WebElement> fullList;

	@FindBy(css = "div[class='v-list__tile__title']")
	WebElement allClients;

	@FindBy(id = "inv-client-2018-CVB2")
	WebElement lastElement;

	@FindBy(css = "label[for='filter-from']")
	WebElement filterFrom;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/button[1]")
	WebElement backToJuly;

	@FindBy(xpath = "//div[string()='31']")
	WebElement chooseDate;

	@FindBy(css = "#filter-from-ok > div")
	WebElement okButton;

	@FindBy(css = "input[id='filter-from']")
	WebElement txtFieldFrom;

	@FindBy(id = "inv-client-2018-CBA1")
	WebElement lastClient;

	@FindBy(css = "#filter-reset > div > i")
	WebElement resetBtn;

	@FindBy(id = "filter-to")
	WebElement filterTo;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/button[1]")
	WebElement backToPreviousMonth;

	@FindBy(xpath = "//div[string()='30']")
	WebElement pickDate;

	@FindBy(css = "#filter-to-ok > div")
	WebElement buttonOk;

	@FindBy(css = "input[id='filter-to']")
	WebElement txtFieldTo;

	@FindBy(id = "inv-client-2018-CVB2")
	WebElement lastMember;

	@FindBy(xpath = "//*[@id=\"filter-period\"]/div/i")
	WebElement setPeriodBtn;

	@FindBy(className = "v-btn v-btn--flat v-btn--small theme--dark")
	List<WebElement> setPeriodOptions;

	@FindBy(id = "context-336")
	WebElement multiOptionBtn;

	@FindBy(id = "context-edit-336")
	WebElement editBtn;

	@FindBy(id = "context-preview-336")
	WebElement previewBtn;

	@FindBy(id = "context-delete-336")
	WebElement deleteBtn;

	@FindBy(id = "inv-status-btn-2018-CBA2")
	WebElement changeStatusBtn;

	@FindBy(xpath = "//*[@id=\"app\"]/div[34]/main/div/div/div[2]/div/div[2]/div/div[5]/div/div[2]/div/div/div[1]/div/div/div/div[2]/div/i")
	WebElement statusMenu;

	@FindBy(xpath = "//*[@id=\"app\"]/div[28]/div/div/div[4]/a/div/div")
	WebElement statusInvalidated;

	@FindBy(css = "#inv-status-dialog-yes-2018-CBA2 > div")
	WebElement acceptBtn;

	@FindBy(id = "inv-status-2018-CBA2")
	WebElement changedStatus;

	@FindBy(xpath = "//*[@id=\"app\"]/div[11]/main/div/div/div/div[1]/form/div[1]/div[3]/div[1]/div/div/div[1]/div/div/div[1]/div/div/div/div[2]/div/i")
	WebElement setNewClient;

	@FindBy(xpath = "//*[@id=\"app\"]/div[5]/div/div/div[2]/a/div/div")
	WebElement pickDejanIlic;

	@FindBy(id = "inv-form-save-btn")
	WebElement saveChanges;

	@FindBy(id = "inv-client-2018-FGH2")
	WebElement changedClient;

	@FindBy(xpath = "//*[@id=\"app\"]/div[8]/div/div/nav/div/a/div/i")
	WebElement closePreviewOption;

	@FindBy(className = "invoice-factory-header-title ml-3")
	WebElement invoicesList;

	@FindBy(id = "context-download-dialog-yes-336")
	WebElement acceptDeleteInvoice;

	@FindBy(className = "v-toolbar__title")
	WebElement titlePreviewInvoice;

	@FindBy(id = "add-new-invoice")
	WebElement addNewInvoiceBtn;

	@FindBy(id = "click-to-enter")
	WebElement enterTitle;

	@FindBy(css = "label[for='inv-form-business']")
	WebElement setNewBusiness;

	@FindBy(css = "input[id='inv-form-business']")
	WebElement chooseFinancialServices;

	@FindBy(id = "inv-form-basis")
	WebElement setBasis;

	@FindBy(id = "inv-currency")
	WebElement setCurrency;

	@FindBy(className = "v-menu__content menuable__content__active")
	WebElement chooseEuro;

	@FindBy(css = "label[for='inv-form-select-bank']")
	WebElement selectBank;

	@FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div/div[1]/a")
	WebElement chooseDeutscheBank;

	@FindBy(id = "inv-form-save-btn")
	WebElement saveBtn;

	@FindBy(id = "add-content-btn")
	WebElement addService;

	@FindBy(name = "service0")
	WebElement newService;

	@FindBy(name = "note0")
	WebElement newNotice;

	@FindBy(id = "inv-form-days-0")
	WebElement setDays;

	@FindBy(id = "inv-form-rate-0")
	WebElement setRate;

	public boolean isUserNamePresent() {
		return username.isDisplayed();
	}

	public void chooseClient() {
		wait.until(ExpectedConditions.visibilityOf(selectClient));
		selectClient.click();
		wait.until(ExpectedConditions.elementToBeClickable(clientPetar));
		clientPetar.click();

	}

	public int getListSize() {
		wait.until(ExpectedConditions.visibilityOf(lastPetar));
		return fullList.size();

	}

	public void goToAllClients() {
		selectClient.click();
		allClients.click();

	}

	public int getListSizeAllClients() {
		wait.until(ExpectedConditions.visibilityOf(lastElement));
		return fullList.size();
	}

	public void pickDateFrom() {
		filterFrom.click();
		backToJuly.click();
		chooseDate.click();
		okButton.click();

	}

	public String checkTxtFieldFrom() {
		wait.until(ExpectedConditions.visibilityOf(txtFieldFrom));
		return txtFieldFrom.getText();

	}

	public int getListSizeFieldFrom() {
		wait.until(ExpectedConditions.visibilityOf(lastClient));
		return fullList.size();

	}

	public void pickDateTo() {
		resetBtn.click();
		filterTo.click();
		backToPreviousMonth.click();
		pickDate.click();
		buttonOk.click();
	}

	public String checkTxtFieldTo() {
		wait.until(ExpectedConditions.visibilityOf(txtFieldTo));
		return txtFieldTo.getText();
	}

	public int getListSizeFieldTo() {
		wait.until(ExpectedConditions.visibilityOf(lastMember));
		return fullList.size();

	}

	public void setPeriodThisMonth() {
		wait.until(ExpectedConditions.elementToBeClickable(setPeriodBtn));
		setPeriodBtn.click();
		setPeriodOptions.get(0).click();
	}

	public int getListSizeThisMonth() {
		return fullList.size();

	}

	public void setPeriodLastMonth() {
		wait.until(ExpectedConditions.elementToBeClickable(setPeriodBtn));
		setPeriodBtn.click();
		setPeriodOptions.get(1).click();
	}

	public int getListSizeLastMonth() {
		return fullList.size();
	}

	public void setPeriodResetDates() {
		wait.until(ExpectedConditions.elementToBeClickable(setPeriodBtn));
		setPeriodBtn.click();
		setPeriodOptions.get(2).click();
	}

	public int getListSizeResetDates() {
		return fullList.size();

	}

	public void goToResetButton() {
		resetBtn.click();
	}

	public int getListSizeResetButton() {
		return fullList.size();
	}

	public void changeStatus() {
		changeStatusBtn.click();
		statusMenu.click();
		statusInvalidated.click();
		acceptBtn.click();

	}

	public String getChangedStatusTxt() {
		wait.until(ExpectedConditions.visibilityOf(changedStatus));
		return changedStatus.getText();
	}

	public void goToEditBtn() {
		multiOptionBtn.click();
		editBtn.click();
		setNewClient.click();
		pickDejanIlic.click();
		saveChanges.click();
	}

	public String getChangedClientName() {
		wait.until(ExpectedConditions.visibilityOf(changedClient));
		return changedClient.getText();
	}

	public void goToPreviewBtn() {
		multiOptionBtn.click();
		previewBtn.click();
	}

	public boolean isChangeClientEnabled() {

		return setNewClient.isEnabled();

	}

	public void closePreviewInvoice() {
		wait.until(ExpectedConditions.visibilityOf(closePreviewOption));
		closePreviewOption.click();
	}

	public String getTxtInvoicesList() {
		wait.until(ExpectedConditions.visibilityOf(invoicesList));
		return invoicesList.getText();
	}

	public void deleteInvoice() {
		multiOptionBtn.click();
		deleteBtn.click();
		acceptDeleteInvoice.click();
	}

	public int getListSizeAfterDeleteInvoice() {

		return fullList.size();

	}

	public String getTitlePreviewInvoice() {
		wait.until(ExpectedConditions.visibilityOf(titlePreviewInvoice));
		return titlePreviewInvoice.getText();
	}

	public void addNewInvoice() {

		wait.until(ExpectedConditions.visibilityOf(addNewInvoiceBtn));
		addNewInvoiceBtn.click();
		wait.until(ExpectedConditions.visibilityOf(enterTitle));
		enterTitle.sendKeys("NewInvoice");
		wait.until(ExpectedConditions.visibilityOf(setNewClient));
		setNewClient.click();
		pickDejanIlic.click();
		wait.until(ExpectedConditions.visibilityOf(setNewBusiness));
		setNewBusiness.click();
		chooseFinancialServices.click();
		wait.until(ExpectedConditions.visibilityOf(setBasis));
		setBasis.sendKeys("Basis");
		wait.until(ExpectedConditions.visibilityOf(setCurrency));
		setCurrency.click();
		chooseEuro.click();
		wait.until(ExpectedConditions.visibilityOf(addService));
		addService.click();
		wait.until(ExpectedConditions.visibilityOf(newService));
		newService.sendKeys("NewService");
		wait.until(ExpectedConditions.visibilityOf(newNotice));
		newNotice.sendKeys("Notice123");
		wait.until(ExpectedConditions.visibilityOf(setDays));
		setDays.sendKeys("14");
		wait.until(ExpectedConditions.visibilityOf(setRate));
		setRate.sendKeys("10");
		wait.until(ExpectedConditions.visibilityOf(selectBank));
		selectBank.click();
		chooseDeutscheBank.click();
		wait.until(ExpectedConditions.visibilityOf(saveBtn));
		saveBtn.click();

	}

	public int getListSizeAddNewInvoice() {

		return fullList.size();
	}

}
