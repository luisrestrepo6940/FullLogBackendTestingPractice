package co.com.certification.questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

@AllArgsConstructor
public class QuestionStatusCode implements Question<Boolean> {
    private final int expectedResponseCode;

    @Override
    public Boolean answeredBy(Actor actor) {
        int statusCodeObtained = SerenityRest.lastResponse().getStatusCode();
        return statusCodeObtained == expectedResponseCode;
    }

    public static QuestionStatusCode checkStatusCodeResponse(int expectedResponseCode) {
        return new QuestionStatusCode(expectedResponseCode);
    }
}
