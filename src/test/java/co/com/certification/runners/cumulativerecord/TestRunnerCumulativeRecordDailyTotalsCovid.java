package co.com.certification.runners.cumulativerecord;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/cumulative_record_daily_totals_covid.feature",
        glue = "co/com/certification/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = "pretty"
)
public class TestRunnerCumulativeRecordDailyTotalsCovid {
}
