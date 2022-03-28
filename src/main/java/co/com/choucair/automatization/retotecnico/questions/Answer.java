package co.com.choucair.automatization.retotecnico.questions;

import co.com.choucair.automatization.retotecnico.model.Utest_Data;
import co.com.choucair.automatization.retotecnico.userinterface.Page_final;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {

    private List<Utest_Data> data;

    public Answer(List<Utest_Data> data) {
        this.data = data;
    }

    public static Answer theD(List<Utest_Data> data) {
        return new Answer(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text_finish_botton = Text.of(Page_final.BOTTON_SETUP).viewedBy(actor).asString();
        return data.get(0).getStrFinishText().equals(text_finish_botton);
    }
}
