package co.com.screenplay.baseline.stepdefinitions;

import co.com.screenplay.baseline.tasks.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.screenplay.baseline.interactions.OpenTheBrowser.navigateForSauceDemo;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class AuthenticationStepDefinitions {

    @Before
    public void configuracionInicial(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) carga la informacion de la compra$")
    public void ellaCargaLaInformacionDeLaCompra(String actor) {
        theActorCalled(actor).wasAbleTo(navigateForSauceDemo());

//        user.wasAbleTo(OpenBrowser.visistedTheSauceSite());
    }

    @When("^Ella realiza la autenticacion con standard_user y secret_sauce en la plataforma$")
    public void ellaRealizaLaAutenticacionConStandard_userYSecret_sauceEnLaPlataforma() {
        System.out.println("2-When");
    }

    @Then("^Ella verifica la autenticacion exitosa$")
    public void ellaVerificaLaAutenticacionExitosa() {
        System.out.println("3-Then");
    }
}
