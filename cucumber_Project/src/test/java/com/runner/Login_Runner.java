package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)   // runwith is used when we have to run specific file

@CucumberOptions(features= {"\\src\\test\\resources\\forms\\govt_form.feature"},
glue={"Steps"})

public class Login_Runner {
	
	
	

}
