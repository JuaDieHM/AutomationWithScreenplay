package co.com.screenplay.baseline.tasks;

import co.com.screenplay.baseline.userinterface.SauceHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenBrowser implements Task {
    private SauceHomePage site;

    public static OpenBrowser visistedTheSauceSite(){
        return instrumented(OpenBrowser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(site));
    }
}
