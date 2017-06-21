/*
 *   COPYRIGHT (C) QUALITY SPECTRUM.  OPEN LICENSE FOR PUBLIC USE.
 *   COMPANY CREATED THIS DOCUMENT FOR KNOWLEDGE SHARING PURPOSE
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*====================================================================================================================*/
/*                                    FILE INFORMATION                                                                */
/*====================================================================================================================*/
/*
 *   @file: Browsers
 *   @date: 26-July-2016
 *   @version: 1.0
 *   @author: Ehsen Raza
 */
/*====================================================================================================================*/
public class Browsers {

    private static GlobalParameters globals;
    private ChromeDriver crDriver = null;
    public Browsers(GlobalParameters globals){
        Browsers.globals = globals;
    }

/*====================================================================================================================*/
    /**
     * This is Browser function of Webdriver class for our testing framework
     *  @param BrowserName It will take browser name as input parameter
     *  @return RemoteWebDriver
     */
/*====================================================================================================================*/
    public WebDriver Browser(String BrowserName) {
        if (BrowserName.equalsIgnoreCase("Chrome")) {
            String strPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", strPath + "\\src\\main\\resources" +
                    "\\Chrome\\chromedriver.exe");
            this.crDriver = new ChromeDriver();
            this.crDriver.manage().window().maximize();
        }
        return this.crDriver;
    }
}
/*====================================================================================================================*/
/*                                           End Of File                                                              */
/*====================================================================================================================*/