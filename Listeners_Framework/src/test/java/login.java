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

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
    private static GlobalParameters globals;
    private Browsers driver = null;

    @BeforeTest
    public void setup_webdriver(){
            driver = new Browsers(globals);
            globals = new GlobalParameters();
            globals.webDrivers = driver.Browser("Chrome");
    }
    @BeforeMethod
    public void navigate_site(){
    globals.webDrivers.get("http://automationpractice.com/index.php");
    }
    @Test(priority = 0, enabled = true)
    public void sign_in(){
        System.out.println(globals.webDrivers.getTitle());
    }

    @AfterTest
    public void kill_driver(){
        globals.webDrivers.close();
        globals.webDrivers.quit();
    }
}
/*====================================================================================================================*/
/*                                           End Of File                                                              */
/*====================================================================================================================*/