package co.com.screenplay.baseline.interactions;

import co.com.screenplay.baseline.userinterface.SauceHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Interaction {
    private SauceHomePage loginPage;

    public static OpenTheBrowser navigateForSauceDemo(){
        return instrumented(OpenTheBrowser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(loginPage));
    }
}
