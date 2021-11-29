package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature Files\\",
glue = {"org.stepdefinition","org.hooks"},
dryRun = false, strict = false,
snippets = SnippetType.CAMELCASE,
tags = {"@TestLeaf"})
public class Runner {

}
