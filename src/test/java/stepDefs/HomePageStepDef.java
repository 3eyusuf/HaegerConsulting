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



    @Then("verify that the {string}")
    public void verifyThatThe(String title) {

        homePage.title_method(title);
    }


    @Then("verify that the Url {string}")
    public void verifyThatTheUrl(String expected_URL) {
        String actual_Url = Driver.get().getCurrentUrl();
        assertEquals(expected_URL, actual_Url);


    }

    @And("the user should be able to  click {string}")
    public void theUserShouldBeAbleToClick(String parts) throws InterruptedException {
        homePage.menu(parts);

    }


}
