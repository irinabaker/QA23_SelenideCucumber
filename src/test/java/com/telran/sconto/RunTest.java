package com.telran.sconto;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
        "json:target/cucumber-report.json"},
        features = "src/test/resources/features",
        tags = "@negative"
)
public class RunTest {
}
