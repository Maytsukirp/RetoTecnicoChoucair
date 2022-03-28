package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;



@DefaultUrl("https://www.utest.com/")

public class PageUtest extends PageObject {

    public static final Target BOTTON_JOIN = Target.the("Botton to start registration")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));


}
