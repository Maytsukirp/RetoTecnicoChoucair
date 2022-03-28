package co.com.choucair.automatization.retotecnico.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class PageAddress {

    public static final Target CITY = Target.the("City field")
            .located(By.id("city"));

    public static final Target ZIP = Target.the("Zip code field")
            .located(By.id("zip"));

    public static final Target CONTAINER_COUNTRY = Target.the("Country field")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div"));

    public static final Target COUNTRY = Target.the("Container country")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target BOTTON_NEXT_DISPOSITIVE = Target.the("Botton to go to dispositive section ")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
