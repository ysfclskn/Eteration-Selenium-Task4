package utils;

import org.openqa.selenium.By;

public class Helper {
    //Clicks WebElements with LinkText
    public static void clickWithLinkText(String linkText){
        Driver.get().findElement(By.linkText(linkText)).click();
    }

}
