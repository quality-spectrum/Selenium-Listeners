/*
 *   COPYRIGHT (C) QUALITY SPECTRUM.  OPEN LICENSE FOR PUBLIC USE.
 *   COMPANY CREATED THIS DOCUMENT FOR KNOWLEDGE SHARING PURPOSE
 */
import org.openqa.selenium.WebElement;

/*====================================================================================================================*/
/*                                    FILE INFORMATION                                                                */
/*====================================================================================================================*/
/*
 *   @file: Common
 *   @date: 26-July-2016
 *   @version: 1.0
 *   @author: Ehsen Raza
 */
/*====================================================================================================================*/
public class Common {
    private static GlobalParameters globals;

    public Common(GlobalParameters globals){
        Common.globals = globals;
    }

    public void vClickObj(WebElement obj){
        obj.click();
    }

    public void vSetText(WebElement obj, String text){
        obj.sendKeys(text);
    }


}
/*====================================================================================================================*/
/*                                           End Of File                                                              */
/*====================================================================================================================*/