package step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AcademyHomePage;
import pages.AcademyInstructorsPage;
import utils.Driver;
import utils.Helper;

public class stepDefs {
    AcademyHomePage homePage = new AcademyHomePage();
    AcademyInstructorsPage instructorsPage = new AcademyInstructorsPage();
    @Given("I opens Eteration Academy Page")
    public void iOpensEterationAcademyPage() {
        String expectedUrl = "https://academy.eteration.com/";
        Assert.assertEquals(expectedUrl, Driver.get().getCurrentUrl());

    }

    @Then("I goes to {string} Page")
    public void iGoesToPage(String page) {
        homePage.openPage(page);
        instructorsPage.isInstructorPage();

    }

    @And("I verifies instructors list count")
    public void iVerifiesInstructorsListCount() {
        instructorsPage.checkInstructors();
    }
}
