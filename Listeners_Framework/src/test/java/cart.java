/*
 *   COPYRIGHT (C) QUALITY SPECTRUM.  OPEN LICENSE FOR PUBLIC USE.
 *   COMPANY CREATED THIS DOCUMENT FOR KNOWLEDGE SHARING PURPOSE
 */
/*====================================================================================================================*/
/*                                    FILE INFORMATION                                                                */
/*====================================================================================================================*/
/*
 *   @file: cart
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

public class cart {
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
    public void cart_empty_OnStart(){
        SiteObjects pgSite = new SiteObjects(globals);

        Assert.assertEquals(pgSite.strGetCartValue(),"(empty)");
    }

    @Test(priority = 1, enabled = true)
    public void cart_empty_warning(){
        SiteObjects pgSite = new SiteObjects(globals);

        pgSite.vClickCartMenu();

        Assert.assertEquals("Your shopping cart is empty.",pgSite.strGetCartEmptyWarnning());
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
