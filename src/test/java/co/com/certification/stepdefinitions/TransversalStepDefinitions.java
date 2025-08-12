package co.com.certification.stepdefinitions;

import co.com.certification.questions.QuestionAccumulatedDailyResultsOnCovid;
import co.com.certification.questions.QuestionStatusCode;
import co.com.certification.tasks.ConsumeGetRequest;
import co.com.certification.utils.others.ManageParametersConnection;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static co.com.certification.utils.constants.Constants.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TransversalStepDefinitions {

    @Before
    public void setUpStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(PRODUCT_OWNER);
    }

    @Given("that the user needs to obtain the accumulated daily results on COVID")
    public void thatTheUserNeedsToObtainTheAccumulatedDailyResultsOnCOVID() {
        theActorInTheSpotlight().whoCan(CallAnApi.at(ManageParametersConnection.getUrlBase(API_URL_BASE)));
    }

    @When("the user consumes the API that allows obtaining the accumulated daily results on COVID")
    public void theUserConsumesTheAPIThatAllowsObtainingTheAccumulatedDailyResultsOnCOVID() {
        theActorInTheSpotlight().attemptsTo(ConsumeGetRequest.setData(NATIONAL_DATA));
    }

    @Then("the service returns the required status code")
    public void theServiceReturnsTheRequiredStatusCode(DataTable dataTable) {
        List<Map<String, String>> mapList = dataTable.asMaps(String.class, String.class);
        theActorInTheSpotlight().should(seeThat(QuestionStatusCode.
                checkStatusCodeResponse(Integer.parseInt(mapList.getFirst().get(STATUS_CODE))), Matchers.is(true)));
    }

    @Then("the user obtains the accumulated daily results on COVID returned by the consumed API")
    public void theUserObtainsTheAccumulatedDailyResultsOnCOVIDReturnedByTheConsumedAPI() {
        theActorInTheSpotlight().should(seeThat(QuestionAccumulatedDailyResultsOnCovid.
                checkResponseAccumulatedDailyResultsOnCovid(), Matchers.is(true)));
    }
}
