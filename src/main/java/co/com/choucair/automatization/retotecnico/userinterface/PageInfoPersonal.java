package co.com.choucair.automatization.retotecnico.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class PageInfoPersonal {

    public static final Target FIRST_NAME = Target.the("User name field")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("Last name field")
            .located(By.id("lastName"));

    public static final Target EMAIL = Target.the("Email field")
            .located(By.id("email"));

    public static final Target MONTH_BIRTH = Target.the("Month birth field")
            .located(By.id("birthMonth"));

    public static final Target DAY_BIRTH = Target.the("Day birth field")
            .located(By.id("birthDay"));

    public static final Target YEAR_BIRTH = Target.the("Year birth field")
            .located(By.id("birthYear"));

    public static final Target BOTTON_NEXT_LOCATION = Target.the("Botton to go to address section ")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
