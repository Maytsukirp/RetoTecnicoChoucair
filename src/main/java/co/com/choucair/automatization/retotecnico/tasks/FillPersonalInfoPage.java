package co.com.choucair.automatization.retotecnico.tasks;

import co.com.choucair.automatization.retotecnico.model.Utest_Data;
import co.com.choucair.automatization.retotecnico.userinterface.PageInfoPersonal;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.automatization.retotecnico.userinterface.PageInfoPersonal.*;

public class FillPersonalInfoPage implements Task {

    private List<Utest_Data> data;

    public FillPersonalInfoPage(List<Utest_Data> data) {
        this.data = data;
    }


    public static FillPersonalInfoPage thePage(List<Utest_Data> data) {
        return Tasks.instrumented(FillPersonalInfoPage.class, data);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(data.get(0).getStrFirstName()).into(PageInfoPersonal.FIRST_NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(PageInfoPersonal.LAST_NAME),
                Enter.theValue(data.get(0).getStrEmail()).into(PageInfoPersonal.EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrMonthBirth()).from(MONTH_BIRTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrDayBirth()).from(DAY_BIRTH),
                SelectFromOptions.byVisibleText(data.get(0).getStrYearBirth()).from(YEAR_BIRTH),
                Click.on(BOTTON_NEXT_LOCATION)
                );

    }
}
