package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"features/signup.feature"},
                 glue =     {"StepDefinations"},
                 plugin =    { "pretty","html:target/cucumber-reports",
    		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                	 tags = "@smoketesting",
                  monochrome = true )

public class Runnerclass extends AbstractTestNGCucumberTests{
	
	}