package testRunner;




	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(tags="",features= {"src/test/resources/features"},
	glue= {"StepDefination"},
	plugin= {"pretty","html:target/htmlreport.html"})


	public class cucumbertestRunner extends AbstractTestNGCucumberTests{

	}


