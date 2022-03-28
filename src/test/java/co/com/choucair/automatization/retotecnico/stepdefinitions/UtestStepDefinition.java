package co.com.choucair.automatization.retotecnico.stepdefinitions;

import co.com.choucair.automatization.retotecnico.model.Utest_Data;
import co.com.choucair.automatization.retotecnico.questions.Answer;
import co.com.choucair.automatization.retotecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public void setState(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^May wants to register on the Utest website$")
    public void mayWantsToRegisterOnTheUtestWebsite() {
        OnStage.theActorCalled("May").wasAbleTo(OpenUtest.thePage());

    }

    @When("^enter all requested information$")
    public void enterAllRequestedInformation(List<Utest_Data> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillPersonalInfoPage.thePage(data), FillAddressPage.thePage(data),
               FillDispositivePage.thePage(data), FillFinishPage.thePage(data) );

    }

    @Then("^registration is successfully completed$")
    public void registrationIsSuccessfullyCompleted(List<Utest_Data> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.theD(data)));

    }

}
