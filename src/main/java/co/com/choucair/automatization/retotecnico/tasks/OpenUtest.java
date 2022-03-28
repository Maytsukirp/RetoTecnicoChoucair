package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.userinterface.PageUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUtest implements Task {
    private PageUtest pageUtest;

    public static OpenUtest thePage() {
        return Tasks.instrumented(OpenUtest.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pageUtest),
                Click.on(PageUtest.BOTTON_JOIN));

    }
}
