/*
 *   COPYRIGHT (C) QUALITY SPECTRUM.  OPEN LICENSE FOR PUBLIC USE.
 *   COMPANY CREATED THIS DOCUMENT FOR KNOWLEDGE SHARING PURPOSE
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*====================================================================================================================*/
/*                                    FILE INFORMATION                                                                */
/*====================================================================================================================*/
/*
 *   @file: SiteObjects
 *   @date: 26-July-2016
 *   @version: 1.0
 *   @author: Ehsen Raza
 */
/*====================================================================================================================*/
class SiteObjects{

    private static GlobalParameters globals;
    private Common Utils = null;
    SiteObjects(GlobalParameters globals){
        SiteObjects.globals = globals;
        PageFactory.initElements((WebDriver) globals.webDrivers, this);
        Utils = new Common(globals);    }

    @FindAll({
            @FindBy(className ="login"),
            @FindBy(css =".login")
    })
    private WebElement lnkSignIn;

    @FindAll({
            @FindBy (id = "email"),
            @FindBy(css = "#email")
    })
    private WebElement tbEmail;
    @FindAll({
            @FindBy (id = "passwd"),
            @FindBy(css = "#passwd")
    })
    private WebElement tbPassword;
    @FindAll({
            @FindBy (id = "SubmitLogin"),
            @FindBy(css = "#SubmitLogin")
    })
    private WebElement btSignIn;
    @FindAll({
            @FindBy (className = "account"),
            @FindBy(css = ".account>span")
    })
    private WebElement lblUserName;
    @FindAll({
            @FindBy (className = "logout"),
            @FindBy(css = ".logout")
    })
    private WebElement lnkSignOut;
    @FindAll({
            @FindBy (className = "ajax_cart_no_product"),
            @FindBy(css = ".ajax_cart_no_product")
    })
    private WebElement lblCartValue;
    @FindAll({
            @FindBy(css = ".alert.alert-warning")
    })
    private WebElement lblWarningMsg_000;
    public void vClickSignInLink()
    {
        Utils.vClickObj(lnkSignIn);
    }
    public void vTypeEmail(String strEmail)
    {
        Utils.vSetText(tbEmail,strEmail);
    }
    public void vTypePassword(String strPassword)
    {
        Utils.vSetText(tbPassword,strPassword);
    }
    public void vClickSignInButton()
    {
        Utils.vClickObj(btSignIn);
    }
    public WebElement weReturnUserName()
    {
        return lblUserName;
    }
    public void vClickSignOutLink()
    {
        Utils.vClickObj(lnkSignOut);
    }
    public String strGetSignInText()
    {
        return lnkSignIn.getText();
    }
    public String strGetCartValue(){ return lblCartValue.getText();}
    public void vClickCartMenu(){ Utils.vClickObj(lblCartValue);}
    public String strGetCartEmptyWarnning(){ return lblWarningMsg_000.getText();}

}
/*====================================================================================================================*/
/*                                           End Of File                                                              */
/*====================================================================================================================*/