package br.cucumber_tst;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber" }, features = "features", glue = {
		"br.cucumber_tst.step_definition" }, tags = {})
public class CucumberTest {
	
}
