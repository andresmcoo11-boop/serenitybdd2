package starter.util;

import io.cucumber.datatable.DataTable;
import starter.models.LoginModels;
import starter.models.TransactionModels;

import java.util.List;

public class GethinfoFromTable {
    public static LoginModels getloginCredentials(DataTable userlogin) {

        List<List<String>> rows = userlogin.asLists(String.class);

        String username = "";
        String password = "";


        for (List<String> columns : rows) {

            username = columns.get(0);
            password = columns.get(1);
        }
        LoginModels LoginModels = new LoginModels();
        LoginModels.setUsername(username);
        LoginModels.setPassword(password);

        return LoginModels;
    }

    public static TransactionModels getTransactiondata(DataTable transactionInfo) {

        List<List<String>> rows = transactionInfo.asLists(String.class);


        String input_date = "";
        String input_numbere = "";
        String input_description = "";

        for (List<String> columns : rows) {


            input_date = columns.get(0);
            input_numbere = columns.get(1);
            input_description = columns.get(2);

        }

        TransactionModels transactionModel = new TransactionModels();
        transactionModel.setInput_date(input_date);
        transactionModel.setInput_numbere(input_numbere);
        transactionModel.setInput_description(input_description);

        return transactionModel;
    }
}
