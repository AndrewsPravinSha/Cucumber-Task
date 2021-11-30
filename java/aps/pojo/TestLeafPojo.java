package aps.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aps.utils.CucumberBase;

public class TestLeafPojo extends CucumberBase{

	public TestLeafPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h5[text()='Edit']//following-sibling::img")
	private WebElement editBox;
	
	@FindBy(xpath="//h5[text()='Image']//following-sibling::img")
	private WebElement imageBox;
	
	@FindBy(xpath="//h5[text()='Radio Button']//following-sibling::img")
	private WebElement radioButtonBox;
	
	@FindAll({
		@FindBy(xpath="(//input)[1]"),
		@FindBy(id="email")
	})
	private WebElement editEmail;
	
	@FindBy(xpath="(//input)[4]")
	private WebElement editClear;
	
	@FindBy(xpath="(//input)[7]")
	private WebElement radioButtonImg;

	@FindAll({
		@FindBy(xpath="(//input)[5]"),
		@FindBy(xpath="//input[@disabled='true']")
	})
	private WebElement editDisabled;
	
	@FindBy(xpath="(//img)[2]")
	private WebElement imgHomepageImg;
	
	@FindBy(xpath="(//img)[3]")
	private WebElement imgBrokenImg;

	@FindAll({
		@FindBy(xpath="(//input)[3]"),
		@FindBy(name="username")
	})
	private WebElement editDefaultValue;
	
	@FindBy(xpath="(//div[contains(@class,'small-12')])[2]//child::input")
	private WebElement radioButtons;
	
	public WebElement getRadioButtons() {
		return radioButtons;
	}

	public WebElement getEditBox() {
		return editBox;
	}

	public WebElement getImageBox() {
		return imageBox;
	}

	public WebElement getRadioButtonBox() {
		return radioButtonBox;
	}

	public WebElement getEditEmail() {
		return editEmail;
	}

	public WebElement getEditDefaultValue() {
		return editDefaultValue;
	}
	public WebElement getEditClear() {
		return editClear;
	}

	public WebElement getEditDisabled() {
		return editDisabled;
	}

	public WebElement getImgHomepageImg() {
		return imgHomepageImg;
	}

	public WebElement getImgBrokenImg() {
		return imgBrokenImg;
	}

	public WebElement getRadioButtonImg() {
		return radioButtonImg;
	}

}
