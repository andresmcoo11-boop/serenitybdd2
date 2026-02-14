package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.By;
import starter.models.LoginModels;
import starter.models.TransactionModels;
import starter.tasks.addtransaction.AddTransaction;
import starter.tasks.addtransaction.CheckNewTransactionWasAdde;
import starter.tasks.login.Login;
import starter.tasks.navigation.NavigateTo;
import starter.ui.addtransaction.AddTransactionPage;
import starter.util.GethinfoFromTable;

import java.util.List;

public class AddtransactionStepDefinitions {

    @Given("{actor} ingresa a la aplicacion")
    public void ingresaAlaAplicacion(Actor actor, DataTable userlogin) {

       LoginModels loginModels= GethinfoFromTable.getloginCredentials(userlogin);

        actor.attemptsTo(

                NavigateTo.loginpage(),
                new Login(loginModels.getUsername(), loginModels.getPassword())
        );
    }

    @When("{actor} introduce la informacion requerida para la nueva transaccion")
    public void introduceLainformacionRequeridaparaLaNuevaTransaccion(Actor actor, DataTable transactionInfo) {

        TransactionModels transactionModels = GethinfoFromTable.getTransactiondata(transactionInfo);


        actor.attemptsTo(

                AddTransaction.withInfo(

                       transactionModels.getInput_date(),
                       transactionModels.getInput_numbere(),
                        transactionModels.getInput_description())
        );
    }

    @Then("{actor} deberia ver una nueva transaccion con los detalles correcto")

    public void deberiaVerUnaNuevaTransaccionConLosDetallesCorrecto(Actor actor) {

            actor.attemptsTo(
                    new CheckNewTransactionWasAdde()
            );
        }
    }






