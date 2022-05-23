package com.telran.sconto;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report.json", "pretty"},
        features = "src/test/resources/features",
       tags = "@login"
)

@io.cucumber.testng.CucumberOptions(
        plugin = {"json:target/cucumber-report.json", "pretty"},
        features = "src/test/resources/features"
)

public class RunTest extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}




