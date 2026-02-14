package starter.tasks.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable loginpage(){
        return Task.where("{0}navitates to login page",
                Open.url("http://127.0.0.1:5500/login.html")
                );

    }

}
