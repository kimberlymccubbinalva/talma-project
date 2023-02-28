import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Calls/Call - Logout Passes'), [('UserEmail') : GlobalVariable.Usr_BackOffice_Admin], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Calls/Call - Logout Passes'), [('UserEmail') : GlobalVariable.Usr_BackOffice_TrackCarga], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Calls/Call - Logout Passes'), [('UserEmail') : GlobalVariable.Usr_BackOffice_TrackCarga_Admin], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Calls/Call - Logout Passes'), [('UserEmail') : GlobalVariable.Usr_Aerolinea_Admin], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Calls/Call - Logout Passes'), [('UserEmail') : GlobalVariable.Usr_Aerolinea_TrackCarga], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Calls/Call - Logout Passes'), [('UserEmail') : GlobalVariable.Usr_Aerolinea_TrackCarga_Admin], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Calls/Call - Logout Passes'), [('UserEmail') : GlobalVariable.Usr_Agente_Admin], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Calls/Call - Logout Passes'), [('UserEmail') : GlobalVariable.Usr_Agente_TrackCarga], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Calls/Call - Logout Passes'), [('UserEmail') : GlobalVariable.Usr_Agente_TrackCarga_Admin], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Calls/Call - Logout Passes'), [('UserEmail') : GlobalVariable.Usr_GHA_Admin], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Calls/Call - Logout Passes'), [('UserEmail') : GlobalVariable.Usr_GHA_TrackCarga], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Calls/Call - Logout Passes'), [('UserEmail') : GlobalVariable.Usr_GHA_TrackCarga_Admin], FailureHandling.STOP_ON_FAILURE)

