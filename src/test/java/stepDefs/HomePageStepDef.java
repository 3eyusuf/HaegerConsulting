package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HomePageStepDef {

    HomePage homePage = new HomePage();

    @Given("The user is on Home Page")
    public void the_user_is_on_Home_Page() {
       Driver.get().get(ConfigurationReader.get("URL"));


    }


    @Then("verify that the Haeger-Consulting Logo Displayed is")
    public void verifyThatTheHaegerConsultingLogoDisplayedIs() {

        assertTrue(homePage.logo_loc.isDisplayed());
    }


    @And("the user should be able to  click {string}")
    public void theUserShouldBeAbleToClick(String navigationElement) throws InterruptedException {
        homePage.menu(navigationElement);

    }


    @Then("verify that the {string}")
    public void verifyThatThe(String title) {

        homePage.title_method(title);
    }





}
