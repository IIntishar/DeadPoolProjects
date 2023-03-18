package upskill.ebay.pageAction;

import java.security.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbayHomePageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomePageActions {
	
	EbayHomePageLocators EbayHomePageLocatorsObj;
	
	public EbayHomePageActions(){
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);
	}
	
	public void searchShoes(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shoes");
		EbayHomePageLocatorsObj.btnSearch.click();
	}

	public void searchItems(String items){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(items);
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	
	public void searchBigTallTee(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Big & Tall Cotton Tee");
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	
	public void mouseHoverMyEbay() throws Exception {
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(EbayHomePageLocatorsObj.linkMyEbay);
		actions.perform();
		Thread.sleep(2000);		
	}
	
	public void clickSummary() throws Exception {
	EbayHomePageLocatorsObj.linkSummary.isEnabled();
	EbayHomePageLocatorsObj.linkSummary.click();
	Thread.sleep(5000);
	}
	public void KeyboardKey() {
		EbayHomePageLocatorsObj.btnSearch.sendKeys(Keys.RETURN);
		EbayHomePageLocatorsObj.btnSearch.sendKeys(Keys.UP);
		EbayHomePageLocatorsObj.btnSearch.sendKeys(Keys.DOWN);
		EbayHomePageLocatorsObj.btnSearch.sendKeys(Keys.CLEAR);
		EbayHomePageLocatorsObj.btnSearch.sendKeys(Keys.DELETE);
		
	}
}