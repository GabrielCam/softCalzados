package Runners;


import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//Gabriel//Desktop//SOFT-2022//calzados//src//test//resources//firstTest.feature",
        glue = {"StepDefinitions"},
        dryRun = false,
        monochrome = true
)
public class Run {
}
