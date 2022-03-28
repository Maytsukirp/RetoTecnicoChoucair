package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.Utest_Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.seleniumhq.jetty9.util.security.Password;

import java.util.List;

import static co.com.choucair.automatization.retotecnico.userinterface.Page_final.*;

public class FillFinishPage implements Task {

    private List<Utest_Data> data;

    public FillFinishPage(List<Utest_Data> data) {
        this.data = data;
    }

    public static FillFinishPage thePage(List<Utest_Data> data) {
        return Tasks.instrumented(FillFinishPage.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrPassword()).into(PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(CONFIRM_PASSWORD),
                Click.on(CHECKBOX_INFORMED),
                Click.on(CHECKBOX_TERMS_OF_USE),
                Click.on(CHECKBOX_PRIVACY),
                Click.on(BOTTON_SETUP)

        );

    }
}
