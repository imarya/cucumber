package com.cucumber.application;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by pradeep on 15/10/16.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", snippets = SnippetType.CAMELCASE, dryRun = true)
public class RunCukesTest {
}
