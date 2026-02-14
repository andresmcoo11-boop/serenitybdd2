package starter.stepdefinitions;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
//import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.tasks.registration.CheckNewAccountCreate;
import starter.tasks.registration.DoNotSendAllRequiredinformation;
import starter.tasks.registration.RegisterUser;
import starter.tasks.registration.ShouldSeeAllFieldsAreRequiered;
import starter.ui.registration.RegisterPage;
//import sun.jvm.hotspot.utilities.Assert;
//import net.serenitybdd.screenplay.waits.WaitUntil;
//import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.net.URISyntaxException;
import java.util.List;
import io.cucumber.datatable.DataTable;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class RegistrationStepdefinitions {

    String expectedName = "";
    String expectedLastname ="";
    String expectedAge ="";
    String expectedEmail="";
    String expectedCountry="";


    @Given("{actor} wants to sign up in the application")
    public void wantsToSignUpInTheApplication(Actor actor) {
        actor.attemptsTo(

                Open.browserOn(new RegisterPage())
        );
    }

    @When("{actor} step sends the required information to sing up")
    public void stepSendsTheRequiredInformationToSingUp(Actor actor, DataTable UserInfo) throws URISyntaxException {

        List<List<String>>rows = UserInfo.asLists(String.class);

        for(List<String> columns: rows){

            expectedName = columns.get(0);
            expectedLastname = columns.get(1);
            expectedAge = columns.get(2);
            expectedEmail = columns.get(3);
            expectedCountry = columns.get(4);

        }


        actor.attemptsTo(
               new RegisterUser(expectedName, expectedLastname, expectedAge,
                       expectedEmail, expectedCountry));
    }

    @Then("{actor} should have a new accont created")

    public void shouldHaveANewAccontCreated(Actor actor) {

        actor.attemptsTo(
new CheckNewAccountCreate(expectedName, expectedLastname)

        );
    }

    @When("{actor} does not dent the required information")

    public void doesNotDentTheRequiredinformation(Actor actor) {
        actor.attemptsTo(
new DoNotSendAllRequiredinformation(expectedName,expectedLastname)

        );
    }
    @Then("{actor} should be told all fields are requiered")

    public void shouldBeToldAllFieldsAreRequiered(Actor actor) {
        actor.attemptsTo(
new ShouldSeeAllFieldsAreRequiered()
        );

    }
}




