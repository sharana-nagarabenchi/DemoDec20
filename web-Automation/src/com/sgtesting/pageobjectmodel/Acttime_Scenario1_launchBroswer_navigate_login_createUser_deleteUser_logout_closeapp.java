package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acttime_Scenario1_launchBroswer_navigate_login_createUser_deleteUser_logout_closeapp {

	private static WebDriver oBrowser = null;
	private static ActiTimePage oPage = null;
	
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUsers();
		deleteUser();
		logOut();
		closeApplication();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
			oPage = new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLoginButton().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUsers()
	{
		try
		{
			oPage.getcreateUser().click();
			oPage.getcreateUser1().click();
			oPage.getcreateUser1Firstname().click();
			oPage.getcreateUser1Firstname().sendKeys("Elon");
			oPage.getcreateUserLastname().click();
			oPage.getcreateUserLastname().sendKeys("musk");
			oPage.getcreateUser1Emailid().click();
			oPage.getcreateUser1Emailid().sendKeys("elon.musk@gmail.com");
			oPage.getcreateUsername1().click();
			oPage.getcreateUsername1().sendKeys("Elon");
			oPage.getcreatePassword1().click();
			oPage.getcreatePassword1().sendKeys("welcomeuser1");
			oPage.getcreateRetypePassword1().click();
			oPage.getcreateRetypePassword1().sendKeys("welcomeuser1");
			oPage.getCreateUserbutton().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try
		{
			oPage.getToDeleteClickElon().click();
			oPage.deleteUserButton().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logOut()
	{
		try
		{
			oPage.getLogout().click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
