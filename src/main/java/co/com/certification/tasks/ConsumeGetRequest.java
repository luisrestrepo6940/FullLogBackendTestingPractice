package co.com.certification.tasks;

import co.com.certification.interactions.Get;
import co.com.certification.utils.others.GetHeaders;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class ConsumeGetRequest implements Task {
    private final String endOfTheEndpoint;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.to(endOfTheEndpoint)
                .with(requestSpecification -> requestSpecification
                        .relaxedHTTPSValidation()
                        .headers(new GetHeaders().getHeader())
                ));
    }

    public static Performable setData(String endOfTheEndpoint) {
        return Tasks.instrumented(ConsumeGetRequest.class, endOfTheEndpoint);
    }
}
