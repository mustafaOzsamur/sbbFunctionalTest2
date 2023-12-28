package stepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.sbbPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class sbbStepdefinitions {
    sbbPage sbbPage=new sbbPage();
    Faker faker=new Faker();

    @Given("Go to the {string} address")
    public void go_to_the_address(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty("sbbUrl"));
        sbbPage.cokiesAkzeptieren.click();
        ReusableMethods.bekle(3);
    }
    @When("Click on the Anmelden button")
    public void click_on_the_anmelden_button() {

        sbbPage.homePageAnmeldenButton.click();
        sbbPage.cokiesAkzeptieren.click();
        ReusableMethods.bekle(1);
    }
    @When("Enter an invalid {string} address in the email box")
    public void enter_an_invalid_address_in_the_email_box(String email) {
        sbbPage.emailBox.sendKeys(email);

    }
    @When("Enter an invalid {string} in the password box")
    public void enter_an_invalid_in_the_password_box(String password) {
sbbPage.passwordBox.sendKeys(password);

    }
    @When("Click the Anmelden button")
    public void click_the_anmelden_button() {
    sbbPage.anmeldungPageAnmeldenButton.click();

    }
    @When("Verify that the login was unsuccessful")
    public void verify_that_the_login_was_unsuccessful() {
        Assert.assertTrue(sbbPage.warnungTextElement.isDisplayed());
    }
    @Then("Close the browser")
    public void close_the_browser() {
        Driver.closeDriver();

    }


    @When("Enter the bus stop to board.")
    public void enter_the_bus_stop_to_board() {
        sbbPage.vonBox.sendKeys("Kronbühl, Bruggbach");
    }
    @When("Enter the destination stop.")
    public void enter_the_destination_stop() {
        sbbPage.nachBox.sendKeys("St. Gallen, Bahnhof");
        sbbPage.stGallenBahnhofOption.click();

    }



    @And("Select a different date.")
    public void selectADifferentDate() {
        sbbPage.datum.click();
        sbbPage.datum.clear();
        sbbPage.datum.sendKeys("01.01.2024");
    }

    @And("Select a different time.")
    public void selectADifferentTime() {
        sbbPage.uhr.click();
        sbbPage.uhr.clear();
        sbbPage.uhr.sendKeys("09.30");
        sbbPage.uhr.sendKeys(Keys.ENTER);
    }


}
