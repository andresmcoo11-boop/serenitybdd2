package starter.ui.addtransaction;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddTransactionPage {

    public static Target BUTTON_ADD_TRANS = Target.the("button add trans").located(By.xpath("//button[@data-target='#transactionModal']"));
    public static Target INPUT_DATE = Target.the("input date ").located(By.xpath("//input[@type='date'] "));
    public static Target INPUT_NUMBER = Target.the("input number ").located(By.xpath("//input[@type='number']"));
    public static Target INPUT_DESCRIPTION = Target.the("input description ").located(By.id("description"));
    public static Target BUTTON_SAVE = Target.the("button save ").located(By.xpath("//button[contains(., 'Guardar')]"));
public static Target TRANSACTIONS_TABLE = Target.the("transaction table").located(By.id("//tbody[@id='transactions-list']"));

public static String TRANSACTIONS_TABLE_XPATH = "//tbody[@id='transactions-list']" ;
}
