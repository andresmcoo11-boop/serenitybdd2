package starter.tasks.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import starter.ui.registration.SummayPage;

public class CheckNewAccountCreate implements Task {

    private final String expectedName;
    private final String expectedLastname;

    public CheckNewAccountCreate(String expectedName, String expectedLastname){

this.expectedName= expectedName;
this.expectedLastname= expectedLastname;

}
    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(

            Switch.toWindowTitled("Summary"),

            Ensure.that(SummayPage.LABEL_NAME).text()
                    .containsIgnoringCase(expectedName),

            Ensure.that(SummayPage.LABEL_LAST_NAME).text()
                    .containsIgnoringCase(expectedLastname)
    );
    }
}

