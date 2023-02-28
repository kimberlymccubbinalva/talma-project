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

//Create User_1 Aerolinea 20526643578
WebUI.click(findTestObject('Object Repository/Module Usuarios/Table/Button - New User'))

//Step_1
WebUI.setText(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Input - RUC'), RUC)

WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Button - Buscar RUC'))

WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Button - Siguiente'))

//Step_2
WebUI.setText(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Input - Nombres Apellidos'), 
    NombreApellido)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Tipo Documento - CE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Input - Nro Documento'), NroDocumento)

WebUI.setText(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Input - Correo'), Correo)

WebUI.setText(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Input - Celular'), Celular)

WebUI.setText(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Input - Cargo'), Cargo)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/BackOffice/Rol - Aerolinea'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/Perfil - Administrador'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/Clients/Perfil - TrackCarga non-backoffice'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Código Aerolínea - XTL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Código Aerolínea - ACL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Proceso - Facturación'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/All users/Proceso - Proceso_2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('Module Usuarios/Create Users Form/Form Step 2/FileUpload - Cargar PDF'), GlobalVariable.FileUpload)

WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Button - Guardar Usuario'))

WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Button - Entendido'))

//Filters present
WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Filters/Filter - Input - Empresa'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Filters/Filter - Input - Usuario'), 2)

WebUI.verifyElementPresent(findTestObject('Module Usuarios/Filters/Filter - Input - cbo_rol'), 2)

WebUI.verifyElementPresent(findTestObject('Module Usuarios/Filters/Filter - Input - cbo_profile backoffice'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Filters/Filter - Input - cbo_activated BackOffice'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Filters/Button - Applicar Filtros'), 2)

WebUI.setText(findTestObject('Object Repository/Module Usuarios/Filters/Filter - Input - Empresa'), RUC)

WebUI.setText(findTestObject('Object Repository/Module Usuarios/Filters/Filter - Input - Usuario'), NombreApellido)

WebUI.click(findTestObject('Object Repository/Module Usuarios/Filters/Button - Applicar Filtros'))

//Table of users
WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Table/Table - Users'), 2)

SearchResult = WebUI.getText(findTestObject('Module Usuarios/Table/Label - User Email'))

WebUI.verifyEqual(Correo, SearchResult)

System.out.println('User was created successfully.')

