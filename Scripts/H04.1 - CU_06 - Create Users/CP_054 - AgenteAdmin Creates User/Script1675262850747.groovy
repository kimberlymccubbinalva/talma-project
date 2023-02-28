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
WebUI.callTestCase(findTestCase('Calls/Call - Login Passes'), [('Email') : GlobalVariable.Usr_Agente_Admin], FailureHandling.STOP_ON_FAILURE)

//Module Users - Manage not admin users
WebUI.click(findTestObject('Object Repository/Module Usuarios/Module - Usuarios'))

//Create User
WebUI.click(findTestObject('Object Repository/Module Usuarios/Table/Button - New User'))

//Step_1
WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Button - Siguiente'))

//Step_2
NombreUsuario = 'Marie Thurner'

EmailUsuario = 'marie@mail.com'

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Tipo Documento - Pasaporte'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/Perfil - TrackCarga'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Call - Input Fields Users'),
	[('NombresApellidos') : NombreUsuario,
		('EmailUsuario') : EmailUsuario], FailureHandling.STOP_ON_FAILURE)

//Filters present
WebUI.setText(findTestObject('Object Repository/Module Usuarios/Filters/Filter - Input - Usuario'), NombreUsuario)

WebUI.click(findTestObject('Object Repository/Module Usuarios/Filters/Button - Applicar Filtros'))

//Table of users
WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Table/Table - Users'), 2)

SearchResult = WebUI.getText(findTestObject('Module Usuarios/Table/Label - User Email'))

WebUI.verifyEqual(EmailUsuario, SearchResult)

System.out.println('User was created successfully.')

WebUI.closeBrowser()