package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//UserName Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	//Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	

	//Login button in Login page
	//@FindBy(xpath="//div[text()='Login ']")
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}

	//FlyOutWindow field
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//Create Users
	//@FindBy(xpath ="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	
	
	//@FindBy(xpath ="//a[@class='content selected users']")
	@FindBy(xpath ="//a[@class='content users']")
	//a [@class='content users']
	
	private WebElement oUser;
	public WebElement getcreateUser()
	{
		return oUser;
	}
	
	@FindBy(xpath="//div[@class='addUserButton beigeButton useNativeActive']")
	private WebElement oUser1;
	public WebElement getcreateUser1()
	{
		return oUser1;
	}
	
	
	@FindBy(xpath="//input[@id='userDataLightBox_firstNameField']")
	private WebElement oUser1Firstname;
	public WebElement getcreateUser1Firstname()
	{
		return oUser1Firstname;
	}
	
//	@FindBy(xpath="//input[@class=\'countryCodeSelectorInput_selector\']]")
//	private WebElement oUser1Lastname;
//	public WebElement getcreateUser1Lastname()
//	{
//		return oUser1Lastname;
//	}
	
	private WebElement userDataLightBox_lastNameField;
	public WebElement getcreateUserLastname()
	{
		return userDataLightBox_lastNameField;
	}
	
	
	
	
	
	
	@FindBy(xpath="//input[@class=\'emailField inputFieldWithPlaceholder\']")
	private WebElement oUser1Emailid;
	public WebElement getcreateUser1Emailid()
	{
		return oUser1Emailid;
	}

	//username1 field
	private WebElement userDataLightBox_usernameField;
	public WebElement getcreateUsername1()
	{
		return userDataLightBox_usernameField;
	}

	//password1 field
	private WebElement userDataLightBox_passwordField;
	public WebElement getcreatePassword1()
	{
		return userDataLightBox_passwordField;
	}
	
	//retype password1 field
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getcreateRetypePassword1()
	{
		return userDataLightBox_passwordCopyField;
	}

	//Create user button
	@FindBy(xpath="//span[@class=\"buttonTitle\"][text()='Create User']")
	private WebElement oCreatUser;
	public WebElement getCreateUserbutton()
	{
		return oCreatUser;
	}
		
	//to delete click user musk, Elon
	@FindBy(xpath="//span[@class=\"userNameSpan\"][text()=\"musk, Elon\"]")
	private WebElement oTodeletClickElon;
	public WebElement getToDeleteClickElon()
	{
		return oTodeletClickElon;
	}
	
	//User delete button
	@FindBy(xpath="//button[@id='userDataLightBox_deleteBtn']")
	private WebElement odelteUser;
	public WebElement deleteUserButton()
	{
		return odelteUser;
	}
	
//	private WebElement userDataLightBox_deleteBtn;
//	public WebElement deleteUserButton()
//	{
//		return userDataLightBox_deleteBtn;
//	}
	
	
	
	//Logout Link Field
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}


		
		
}


