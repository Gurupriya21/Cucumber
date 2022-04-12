package com.Runner_Class;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber_Project.Base_Class_Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "C:\\Users\\produ\\eclipse-workspace\\Cucumber_Project\\src\\test\\java\\com\\Cucumber_Project\\Adactin.feature",
		glue = "com.Step_Definition",
				monochrome = true,
				dryRun = false,
				
			
		plugin = { "html:Cucumber_Reports/Adactin_Cucumber_Report.html",
				"json:Cucumber_Reports/Adactin_JSON_Report.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"pretty"
		}
		)


public class Adactin_Runner_Class extends Base_Class_Runner{
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		driver = Base_Class_Runner.browser("chrome");

	}

	@AfterClass
	public static void tear_Down() {
		driver.close();
	}

}
