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

//Module Users - Manage not admin users
WebUI.click(findTestObject('Object Repository/Module Usuarios/Module - Usuarios'))

//Filters present
WebUI.callTestCase(findTestCase('Test Cases/Calls/Call - Verify Filters Users'), [:], FailureHandling.STOP_ON_FAILURE)

//Create User_1 Aerolinea 20526643578
WebUI.click(findTestObject('Object Repository/Module Usuarios/Table/Button - New User'))

//Step_1
RUC1 = '20526643578'

WebUI.setText(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Input - RUC'), RUC1)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Button - Buscar RUC'))

WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Button - Siguiente'))

//Step_2
NombreUsuario1 = 'Jhon Thurner'

EmailUsuario1 = 'jhon@mail.com'

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Tipo Documento - CE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/BackOffice/Rol - Aerolinea'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/Perfil - Administrador'), [:], FailureHandling.OPTIONAL)

//WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/Clients/Perfil - TrackCarga non-backoffice'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Código Aerolínea - XTL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Código Aerolínea - ACL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Proceso - Facturación'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Proceso - Proceso_2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Call - Input Fields Users'),
	[('NombresApellidos') : NombreUsuario1 ,
		('EmailUsuario') : EmailUsuario1], FailureHandling.STOP_ON_FAILURE)

//Filter new user
WebUI.setText(findTestObject('Object Repository/Module Usuarios/Filters/Filter - Input - Empresa'), RUC1)

WebUI.setText(findTestObject('Object Repository/Module Usuarios/Filters/Filter - Input - Usuario'), NombreUsuario1)

WebUI.click(findTestObject('Object Repository/Module Usuarios/Filters/Button - Applicar Filtros'))

//Table of users
WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Table/Table - Users'), 2)

SearchResult1 = WebUI.getText(findTestObject('Module Usuarios/Table/Label - User Email'))

WebUI.verifyEqual(EmailUsuario1, SearchResult1)

System.out.println('User_1 was created successfully.')

//
//Create User_2 GHA 20526643578
WebUI.click(findTestObject('Object Repository/Module Usuarios/Table/Button - New User'))

//Step_1
RUC2 = '20526643578'

WebUI.setText(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Input - RUC'), RUC2)

WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Button - Buscar RUC'))

WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Button - Siguiente'))

//Step_2
NombreUsuario2 = 'July Thurner'

EmailUsuario2 = 'july@mail.com'

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Tipo Documento - CE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/BackOffice/Rol - GHA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/Perfil - Administrador'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/Clients/Perfil - TrackCarga non-backoffice'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Código Aerolínea - XTL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Código Aerolínea - ACL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Proceso - Facturación'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Proceso - Proceso_2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Call - Input Fields Users'), 
	[('NombresApellidos') : NombreUsuario2, 
		('EmailUsuario') : EmailUsuario2], FailureHandling.STOP_ON_FAILURE)

//Filter user
WebUI.setText(findTestObject('Object Repository/Module Usuarios/Filters/Filter - Input - Empresa'), RUC2)

WebUI.setText(findTestObject('Object Repository/Module Usuarios/Filters/Filter - Input - Usuario'), NombreUsuario2)

WebUI.click(findTestObject('Object Repository/Module Usuarios/Filters/Button - Applicar Filtros'))

//Table of users
WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Table/Table - Users'), 2)

SearchResult2 = WebUI.getText(findTestObject('Module Usuarios/Table/Label - User Email'))

WebUI.verifyEqual(EmailUsuario2, SearchResult2)

System.out.println('User_2 was created successfully.')

//
//Create User_3 Agente 20526643578
WebUI.click(findTestObject('Object Repository/Module Usuarios/Table/Button - New User'))

//Step_1
RUC3 = '20526643578'

WebUI.setText(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Input - RUC'), RUC3)

WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Button - Buscar RUC'))

WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Button - Siguiente'))

//Step_2
NombreUsuario3 = 'Esther Thurner'

EmailUsuario3 = 'esther@mail.com'

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Tipo Documento - CE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/BackOffice/Rol - Agente de Carga'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/Perfil - Administrador'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/Clients/Perfil - TrackCarga non-backoffice'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Proceso - Facturación'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Proceso - Proceso_2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Call - Input Fields Users'),
	[('NombresApellidos') : NombreUsuario3,
		('EmailUsuario') : EmailUsuario3], FailureHandling.STOP_ON_FAILURE)

//Filter user
WebUI.setText(findTestObject('Object Repository/Module Usuarios/Filters/Filter - Input - Empresa'), RUC3)

WebUI.setText(findTestObject('Object Repository/Module Usuarios/Filters/Filter - Input - Usuario'), NombreUsuario3)

WebUI.click(findTestObject('Object Repository/Module Usuarios/Filters/Button - Applicar Filtros'))

//Table of users
WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Table/Table - Users'), 2)

SearchResult3 = WebUI.getText(findTestObject('Module Usuarios/Table/Label - User Email'))

WebUI.verifyEqual(EmailUsuario3, SearchResult3)

System.out.println('User_3 was created successfully.')

//
WebUI.closeBrowser()
