package pages;

import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.Helper;

public class AcademyHomePage {
    public AcademyHomePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public void openPage(String page){
        Helper.clickWithLinkText(page);
    }
}
