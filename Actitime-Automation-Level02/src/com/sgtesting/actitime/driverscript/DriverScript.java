package com.sgtesting.actitime.driverscript;

import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.tests.HomePage;
import com.sgtesting.actitime.tests.Initialize;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Users;

public class DriverScript {

	public static void main(String[] args) {
		WebDriver oBrowser=null;
		try
		{
			//Create User Scenario
			oBrowser=Initialize.launchBrowser();
			Initialize.navigate(oBrowser);
			LoginLogout.login(oBrowser);
			HomePage.minimizeFlyOutWindow(oBrowser);
			Users.createUser(oBrowser);
			Users.deleteUser(oBrowser);
			LoginLogout.logout(oBrowser);
			Initialize.closeApplication(oBrowser);

			//Modify User Scenario
			oBrowser=Initialize.launchBrowser();
			Initialize.navigate(oBrowser);
			LoginLogout.login(oBrowser);
			HomePage.minimizeFlyOutWindow(oBrowser);
			Users.createUser(oBrowser);
			Users.modifyUser(oBrowser);
			Users.deleteUser(oBrowser);
			LoginLogout.logout(oBrowser);
			Initialize.closeApplication(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
