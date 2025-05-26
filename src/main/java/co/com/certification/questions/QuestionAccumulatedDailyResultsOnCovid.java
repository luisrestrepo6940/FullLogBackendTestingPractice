package co.com.certification.questions;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

@Slf4j
@AllArgsConstructor
public class QuestionAccumulatedDailyResultsOnCovid implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        final String MESSAGE = " <<%s ENCONTRO LA CLAVE %s. >>";
        final String CLAVE = "result.data.allCovidUsDaily.nodes";
        List<Map<String, Object>> mapList = new ArrayList<>();
        try {
            mapList = lastResponse().jsonPath().getJsonObject(CLAVE);
            log.info(String.format(MESSAGE, "SE", CLAVE));
        } catch (Exception exception) {
            log.error(String.format(MESSAGE, "NO SE", CLAVE).concat(String.valueOf(exception)));
        }
        return !mapList.isEmpty();
    }

    @Contract(" -> new")
    public static @NotNull QuestionAccumulatedDailyResultsOnCovid checkResponseAccumulatedDailyResultsOnCovid() {
        return new QuestionAccumulatedDailyResultsOnCovid();
    }
}
