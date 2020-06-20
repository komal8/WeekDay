package com.IT.RegisterTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue="com.IT.RegisterStepDEF",dryRun=false,monochrome=true,plugin= {"pretty","json:test-output/cucumber.json","html:out/cucumber.html","junit:out/cucmber.xml"}
//tags= {"@smoke"}
)
public class TestRunner {

}
