package starter.tasks.addtransaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.By;
import starter.questions.GetTransactionq;
import starter.ui.addtransaction.AddTransactionPage;

public class CheckNewTransactionWasAdde implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Ensure.that(GetTransactionq.getDescription()).contains(("testing"))



        );
    }
}
