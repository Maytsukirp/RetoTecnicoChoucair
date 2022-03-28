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

import static co.com.choucair.automatization.retotecnico.userinterface.PageAddress.*;
import static co.com.choucair.automatization.retotecnico.userinterface.PageDispositive.VERSION;

public class FillAddressPage implements Task {

    private List<Utest_Data > data;

    public FillAddressPage(List<Utest_Data> data){

        this.data = data;
    }

    public static FillAddressPage thePage(List<Utest_Data> data) {
        return Tasks.instrumented(FillAddressPage.class, data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(data.get(0).getStrZip()).into(ZIP),
                Click.on(CONTAINER_COUNTRY),
                Enter.theValue(data.get(0).getStrCountry()).into(COUNTRY),
                //Hit.the(Keys.ARROW_DOWN).into(COUNTRY),
                //Hit.the(Keys.ENTER).into(COUNTRY),
                Click.on(BOTTON_NEXT_DISPOSITIVE)
        );


    }
}
