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

//Open browser and login: Aerolínea Track
WebUI.callTestCase(findTestCase('Calls/Call - Login Passes'), [('Email') : GlobalVariable.Usr_Aerolinea_TrackCarga], FailureHandling.STOP_ON_FAILURE)

//Verify User Module not present
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Module Usuarios/Module - Usuarios'), 5)

//Logout
WebUI.waitForElementVisible(findTestObject('Customer Dashboard/Identifier - Todos'), 5)

WebUI.click(findTestObject('Customer Dashboard/Identifier - Todos'))

WebUI.click(findTestObject('Customer Dashboard/Label - Logout'))

WebUI.delay(3)

WebUI.click(findTestObject('Customer Dashboard/Logout modal/Button - Logout'))

System.out.println('Test PASSED')

WebUI.closeBrowser()


//Open browser and login:
WebUI.callTestCase(findTestCase('Calls/Call - Login Passes'), [('Email') : GlobalVariable.Usr_Agente_TrackCarga], FailureHandling.STOP_ON_FAILURE)

//Verify User Module not present
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Module Usuarios/Module - Usuarios'), 5)

//Logout
WebUI.waitForElementVisible(findTestObject('Customer Dashboard/Identifier - Todos'), 5)

WebUI.click(findTestObject('Customer Dashboard/Identifier - Todos'))

WebUI.click(findTestObject('Customer Dashboard/Label - Logout'))

WebUI.delay(3)

WebUI.click(findTestObject('Customer Dashboard/Logout modal/Button - Logout'))

System.out.println('Test PASSED')

WebUI.closeBrowser()


//Open browser and login:
WebUI.callTestCase(findTestCase('Calls/Call - Login Passes'), [('Email') : GlobalVariable.Usr_GHA_TrackCarga], FailureHandling.STOP_ON_FAILURE)

//Verify User Module not present
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Module Usuarios/Module - Usuarios'), 5)

//Logout
WebUI.waitForElementVisible(findTestObject('Customer Dashboard/Identifier - Todos'), 5)

WebUI.click(findTestObject('Customer Dashboard/Identifier - Todos'))

WebUI.click(findTestObject('Customer Dashboard/Label - Logout'))

WebUI.delay(3)

WebUI.click(findTestObject('Customer Dashboard/Logout modal/Button - Logout'))

System.out.println('Test PASSED')

WebUI.closeBrowser()