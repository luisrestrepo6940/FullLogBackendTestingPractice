package co.com.certification.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.rest.abilities.CallAnApi.as;

@AllArgsConstructor
public class Get extends RestInteraction {
    private final String resource;

    @Step("{0} executes a GET on the resource #resource")
    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().log().all().get(as(actor).resolve(resource)).then().log().all();
    }

    public static Get to(String resource) {
        return instrumented(Get.class, resource);
    }
}
