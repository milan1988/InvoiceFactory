package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BusinessPage extends PageObject {

	public BusinessPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "nav-bar-business")
	WebElement businessTab;

	@FindBy(id = "add-new-business")
	WebElement addNewBusinessBtn;

	@FindBy(css = "input[id='business-form-name']")
	WebElement setBusinessName;

	@FindBy(css = "input[id='business-form-country']")
	WebElement selectCountry;

	@FindBy(xpath = "//*[@id=\"app\"]/div[3]/div/div/div[3]/a/div/div")
	WebElement pickAlgeria;

	@FindBy(css = "input[id='business-form-city']")
	WebElement setCity;

	@FindBy(css = "input[id='business-form-street']")
	WebElement setStreet;

	@FindBy(css = "input[id='business-form-zip']")
	WebElement setZip;

	@FindBy(css = "input[id='business-form-reg-num']")
	WebElement setRegistryNumber;

	@FindBy(id = "business-form-save-btn")
	WebElement saveBusinessBtn;

	@FindBy(className = "layout business-item-subheader text-xs-left")
	List<WebElement> fullListBusiness;

	@FindBy(id = "business-name-203")
	WebElement lastElementInList;

	@FindBy(id = "expand-business-details")
	List<WebElement> viewDetailsMenu;

	@FindBy(id = "business-subtitle-51")
	WebElement checkDetails;

	@FindBy(id = "business-edit-btn-51")
	WebElement editBusinessBtn;

	@FindBy(id = "business-form-save-btn")
	WebElement saveChangesBusiness;

	@FindBy(id = "business-name-51")
	WebElement newBusinessName;

	@FindBy(id = "context-delete-51")
	WebElement deleteBusinessBtn;

	@FindBy(id = "context-download-dialog-yes-51")
	WebElement acceptDeleteBusiness;

	public void goToBussinesList() {
		businessTab.click();
		wait.until(ExpectedConditions.visibilityOf(addNewBusinessBtn));
		addNewBusinessBtn.click();
		wait.until(ExpectedConditions.visibilityOf(setBusinessName));
		setBusinessName.sendKeys("Financial services and products");
		selectCountry.click();
		wait.until(ExpectedConditions.visibilityOf(pickAlgeria));
		pickAlgeria.click();
		setCity.sendKeys("Algiers");
		wait.until(ExpectedConditions.visibilityOf(setStreet));
		setStreet.sendKeys("Street91");
		wait.until(ExpectedConditions.visibilityOf(setZip));
		setZip.sendKeys("123963");
		wait.until(ExpectedConditions.visibilityOf(setRegistryNumber));
		setRegistryNumber.sendKeys("654");
		wait.until(ExpectedConditions.visibilityOf(saveBusinessBtn));
		saveBusinessBtn.click();
	}

	public int getBusinessListSize() {
		wait.until(ExpectedConditions.visibilityOf(lastElementInList));
		return fullListBusiness.size();
	}

	public void goToViewDetails() {

		viewDetailsMenu.get(0).click();
	}

	public String getDetails() {
		wait.until(ExpectedConditions.visibilityOf(checkDetails));
		return checkDetails.getText();

	}

	public void editBusinessName() {
		wait.until(ExpectedConditions.visibilityOf(editBusinessBtn));
		editBusinessBtn.click();
		wait.until(ExpectedConditions.visibilityOf(setBusinessName));
		setBusinessName.clear();
		setBusinessName.sendKeys("Financial products");
		wait.until(ExpectedConditions.visibilityOf(saveChangesBusiness));
		saveChangesBusiness.click();

	}

	public String checkNewBusinessName() {
		wait.until(ExpectedConditions.visibilityOf(newBusinessName));
		return newBusinessName.getText();
	}

	public void deleteBusiness() {
		viewDetailsMenu.get(0).click();
		wait.until(ExpectedConditions.visibilityOf(deleteBusinessBtn));
		deleteBusinessBtn.click();
		acceptDeleteBusiness.click();

	}

	public int getBussinessListSizeAfterDelete() {
		wait.until(ExpectedConditions.visibilityOf(lastElementInList));
		return fullListBusiness.size();
	}

}
