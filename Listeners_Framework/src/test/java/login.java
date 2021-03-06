/*
 *   COPYRIGHT (C) QUALITY SPECTRUM.  OPEN LICENSE FOR PUBLIC USE.
 *   COMPANY CREATED THIS DOCUMENT FOR KNOWLEDGE SHARING PURPOSE
 */

/*====================================================================================================================*/
/*                                    FILE INFORMATION                                                                */
/*====================================================================================================================*/
/*
 *   @file: login
 *   @date: 26-July-2016
 *   @version: 1.0
 *   @author: Ehsen Raza
 */
/*====================================================================================================================*/

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
    private static GlobalParameters globals;
    private Browsers driver = null;
   /* @BeforeTest
    public void setup_webdriver(){
            driver = new Browsers(globals);
            globals = new GlobalParameters();
            globals.webDrivers = driver.Browser("Chrome");
    }*/
    @BeforeMethod
    public void navigate_site(){
    globals = TestListener.globals;
    globals.webDrivers.get("http://automationpractice.com/index.php");
    }
    @Test(priority = 0, enabled = true)
    public void sign_in(){
        SiteObjects pgSite = new SiteObjects(globals);

        pgSite.vClickSignInLink();
        pgSite.vTypeEmail("araza109@hotmail.com");
        pgSite.vTypePassword("password");
        pgSite.vClickSignInButton();
        Assert.assertEquals(pgSite.weReturnUserName().getText(),"Selenium Automation");
    }

    @Test(priority = 1, enabled = true, dependsOnMethods = "sign_in")

    public void sign_out(){
        SiteObjects pgSite = new SiteObjects(globals);

        pgSite.vClickSignOutLink();

        Assert.assertEquals(pgSite.strGetSignInText(),"Sign in");
    }
    /*@AfterTest
    public void kill_driver(){
        globals.webDrivers.close();
        globals.webDrivers.quit();
    }*/
}
/*====================================================================================================================*/
/*                                           End Of File                                                              */
/*====================================================================================================================*/