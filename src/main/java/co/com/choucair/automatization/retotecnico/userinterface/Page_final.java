package co.com.choucair.automatization.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Page_final {

    public static final Target PASSWORD = Target.the("Password field")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD = Target.the("Confirm password field")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_INFORMED = Target.the("Checkbox informed")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target CHECKBOX_TERMS_OF_USE = Target.the("Checkbox terms of use")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECKBOX_PRIVACY = Target.the("Checkbox privacy")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BOTTON_SETUP = Target.the("Botton setup")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
