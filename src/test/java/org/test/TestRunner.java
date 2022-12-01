package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\AdactinLogin\\src\\test\\resources\\Adactin.feature",
glue="org.test",dryRun=false,monochrome=true,
plugin={"html:src/target/java","json:src/target/java/adac.json","junit:src/target/java/adac.xml"})

public class TestRunner {

}
