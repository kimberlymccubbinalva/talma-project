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
WebUI.callTestCase(findTestCase('Calls/Call - Login Passes'), [('Email') : GlobalVariable.Usr_Aerolinea_TrackCarga_Admin], 
    FailureHandling.STOP_ON_FAILURE)

//Module Exportaciones
WebUI.click(findTestObject('Object Repository/Module Exportaciones/Icon - Exportaciones'))

WebUI.click(findTestObject('Object Repository/Module Exportaciones/Module - Track Exportaciones'))

//Module Users - Manage not admin users
//Start of validation
WebUI.click(findTestObject('Object Repository/Module Usuarios/Module - Usuarios'))

//Filters present
WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Filters/Filter - Input - Usuario'), 2)

WebUI.verifyElementPresent(findTestObject('Module Usuarios/Filters/Filter - Input - cbo_profile clients'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Filters/Button - Applicar Filtros'), 2)

//Table of users
WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Table/Table - Users'), 2)

//Create User
WebUI.click(findTestObject('Object Repository/Module Usuarios/Table/Button - New User'))

//Step_1
WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Button - Siguiente'))

//Step_2
WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Input - Nombres Apellidos'), 
    2)

WebUI.verifyElementPresent(findTestObject('Module Usuarios/Create Users Form/Form Step 2/Input - cbo_document_type'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Input - Nro Documento'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Input - Correo'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Input - Celular'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Input - Cargo'), 
    2)

WebUI.verifyElementPresent(findTestObject('Module Usuarios/Create Users Form/Form Step 2/Input - cbo_profile clients'), 
    2)

WebUI.verifyElementPresent(findTestObject('Module Usuarios/Create Users Form/Form Step 2/Input - Código Aerolínea'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Button - Guardar Usuario'), 
    2)

WebUI.click(findTestObject('Module Usuarios/Create Users Form/Button - Close Modal'))

//Avatar 2 letters
//Start of validation
WebUI.verifyElementPresent(findTestObject('Object Repository/Customer Dashboard/Identifier - AA (Aerolinea Track Admin)'), 
    2)

WebUI.click(findTestObject('Object Repository/Customer Dashboard/Identifier - AA (Aerolinea Track Admin)'))

WebUI.click(findTestObject('Customer Dashboard/Label - Logout'))

WebUI.click(findTestObject('Customer Dashboard/Logout modal/Button - Logout'))

//Update Avatar
//Start of validation
WebUI.closeBrowser()

