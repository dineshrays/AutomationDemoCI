package common

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Program Files (x86)\\Jenkins\\workspace\\AutomationDemoCI\\TrainingSession\\Include\\features",
glue="")



/*plugin = ["pretty",
 "junit:C:\\Program Files (x86)\\Jenkins\\workspace\\AutomationDemoCI\\TrainingSession\\MyReports\\cucumber.xml",
 "html:C:\\Program Files (x86)\\Jenkins\\workspace\\AutomationDemoCI\\TrainingSession\\MyReports",
 "json:C:\\Program Files (x86)\\Jenkins\\workspace\\AutomationDemoCI\\TrainingSession\\MyReports\\cucumber.json"])
 
 ,
plugin = ["pretty",
	"junit:MyReports/cucumber.xml",
	"html:MyReports",
	"json:MyReports/cucumber.json"]
 
 */

public class CucumberEARunner {
}
