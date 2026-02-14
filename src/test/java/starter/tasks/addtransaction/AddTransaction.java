package starter.tasks.addtransaction;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.addtransaction.AddTransactionPage;

public class AddTransaction {

    public static Performable withInfo(String input_date, String input_numbere, String input_description){
        return Task.where("{0} adds a new transaction",

                Click.on(AddTransactionPage.BUTTON_ADD_TRANS),
                Enter.theValue(input_date).into(AddTransactionPage.INPUT_DATE),
                Enter.theValue(input_numbere).into(AddTransactionPage.INPUT_NUMBER),
                Enter.theValue(input_description).into(AddTransactionPage.INPUT_DESCRIPTION),
                Click.on(AddTransactionPage.BUTTON_SAVE)

                );


    }

}





