package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Than brandon wants to learn automation at the academy Choucair")
    public void than_brandon_wants_to_learn_automation_at_the_academy_choucair() {
        OnStage.theActorCalled("brandon").wasAbleTo(OpenUp.thePage());
    }
    @When("he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform")
    public void he_search_for_the_course_recursos_automatizacion_bancolombia_on_the_choucair_academy_platform() {

    }
    @Then("he finds the course called resources Recursos Automatizacion Bancolombia")
    public void he_finds_the_course_called_resources_recursos_automatizacion_bancolombia() {

    }
}
