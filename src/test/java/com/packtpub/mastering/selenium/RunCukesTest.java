package com.packtpub.mastering.selenium;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"})

public class RunCukesTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	
	}*/

}
