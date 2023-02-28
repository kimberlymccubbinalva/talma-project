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
WebUI.callTestCase(findTestCase('Calls/Call - Login Passes'), [('Email') : GlobalVariable.Usr_BackOffice_Admin], FailureHandling.STOP_ON_FAILURE)

//Go to users board
WebUI.click(findTestObject('Object Repository/Module Usuarios/Module - Usuarios'))

//Get a deleted user by filtering the rol to try the failed login

WebUI.click(findTestObject('Object Repository/Module Usuarios/Filters/Button - Applicar Filtros'))

//Get 1st user's email to be deleted
EmailToDelete = WebUI.getText(findTestObject('Module Usuarios/Table/Label - User Email'))

WebUI.click(findTestObject('Object Repository/Module Usuarios/Table/Icon - More Options'))

//Click on Delete user and confirm
//complete process here...
//Interacting with logout option
WebUI.waitForElementVisible(findTestObject('Customer Dashboard/Identifier - BO'), 30)

WebUI.click(findTestObject('Customer Dashboard/Identifier - BO'))

WebUI.click(findTestObject('Customer Dashboard/Label - Logout'))

WebUI.delay(10)

//Try login with deleted user
WebUI.callTestCase(findTestCase('Calls/Call - Login Fails'), [('Email') : EmailToDelete, ('Password') : GlobalVariable.GeneralPassword], 
    FailureHandling.STOP_ON_FAILURE)

System.out.println('Test PASSED')

WebUI.closeBrowser()

