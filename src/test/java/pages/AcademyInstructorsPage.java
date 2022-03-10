package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class AcademyInstructorsPage{
    public AcademyInstructorsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".page-title>.container>span")
    public WebElement instructorsTitle;

    @FindAll({
            @FindBy(className="instructor-item-title"),

    })

    public List<WebElement> instructorItems;
    public void isInstructorPage(){
        String actualTitle = instructorsTitle.getText();
        Assert.assertTrue(actualTitle.contains("INSTRUCTORS"));
    }

    public void checkInstructors(){
        System.out.println(instructorItems.size());
       if( !instructorItems.isEmpty()){
           Assert.assertTrue(" Is Instructors count 8? : ",instructorItems.size() == 8);
       }
    }

}
