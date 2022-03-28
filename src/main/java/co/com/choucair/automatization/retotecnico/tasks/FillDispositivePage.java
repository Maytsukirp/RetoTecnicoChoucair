package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.Utest_Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.automatization.retotecnico.userinterface.PageAddress.CITY;
import static co.com.choucair.automatization.retotecnico.userinterface.PageDispositive.*;

public class FillDispositivePage implements Task {

    private List<Utest_Data> data;

    public FillDispositivePage(List<Utest_Data> data) {
        this.data = data;
    }

    public static FillDispositivePage thePage(List<Utest_Data> data) {
        return Tasks.instrumented(FillDispositivePage.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTAINER_PC),
                Enter.theValue(data.get(0).getStrPC()).into(PC).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTAINER_VERSION),
                Enter.theValue(data.get(0).getStrVersionPC()).into(VERSION).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTAINER_LANGUAGE),
                Enter.theValue(data.get(0).getStrLenguagePC()).into(LANGUAGE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTAINER_MOBIL),
                Enter.theValue(data.get(0).getStrMobil()).into(MOBIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTAINER_MODEL_MOBIL),
                Enter.theValue(data.get(0).getStrModelMobil()).into(MODEL_MOBIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONTAINER_SO_MOBIL),
                Enter.theValue(data.get(0).getStrSOMobil()).into(SO_MOBIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(BOTTON_FINISH)

        );




    }
}
