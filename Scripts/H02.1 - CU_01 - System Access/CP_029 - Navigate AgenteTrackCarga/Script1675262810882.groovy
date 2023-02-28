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

//Open browser and login
WebUI.callTestCase(findTestCase('Calls/Call - Login Passes'), [('Email') : GlobalVariable.Usr_Agente_TrackCarga], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Module Usuarios/Module - Usuarios'), 2)

//Module Exportación
WebUI.click(findTestObject('Object Repository/Module Exportaciones/Icon - Exportaciones'))

WebUI.click(findTestObject('Object Repository/Module Exportaciones/Module - Track Exportaciones'))

//Interacting with logout option
WebUI.waitForElementVisible(findTestObject('Object Repository/Customer Dashboard/Identifier - AT (Agente Track)'), 3)

WebUI.click(findTestObject('Object Repository/Customer Dashboard/Identifier - AT (Agente Track)'))

WebUI.click(findTestObject('Customer Dashboard/Label - Logout'))

WebUI.delay(3)

//Validating components present
WebUI.verifyElementVisible(findTestObject('Customer Dashboard/Logout modal/Img - Logout image'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Customer Dashboard/Logout modal/Label - Confirmation message'), 2)

WebUI.click(findTestObject('Customer Dashboard/Logout modal/Button - Cancel logout'))

//Loging out
WebUI.click(findTestObject('Object Repository/Customer Dashboard/Identifier - AT (Agente Track)'))

WebUI.click(findTestObject('Customer Dashboard/Label - Logout'))

WebUI.click(findTestObject('Customer Dashboard/Logout modal/Button - Logout'))

System.out.println('Test PASSED')

WebUI.closeBrowser()

