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
WebUI.callTestCase(findTestCase('Calls/Call - Login Passes'), [('Email') : GlobalVariable.Usr_Aerolinea_Admin], FailureHandling.STOP_ON_FAILURE)

//Module Users - Manage not admin users
WebUI.click(findTestObject('Object Repository/Module Usuarios/Module - Usuarios'))

//Filter
WebUI.callTestCase(findTestCase('Test Cases/Calls/Module Users/BackOffice/Filter - Usuarios Track Activos'), [:], FailureHandling.STOP_ON_FAILURE)

//Edit users
WebUI.click(findTestObject('Object Repository/Module Usuarios/Table/Icon - More Options'))

WebUI.click(findTestObject('Object Repository/Module Usuarios/Table/Icon - Editar Usuario'))

WebUI.click(findTestObject('Module Usuarios/Edit Users/Button - Guardar y Continuar'))

WebUI.clearText(findTestObject('Module Usuarios/Create Users Form/Form Step 2/Input - Cargo'))

WebUI.sendKeys(findTestObject('Module Usuarios/Create Users Form/Form Step 2/Input - Cargo'), Keys.chord(Keys.CONTROL, 'A', 
        Keys.DELETE))

NewCargo = 'CARGO EDITADO'

WebUI.setText(findTestObject('Module Usuarios/Create Users Form/Form Step 2/Input - Cargo'), NewCargo)

WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Button - Guardar Usuario'))

WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 2/Button - Entendido'))

//See user
//WebUI.click(findTestObject('Object Repository/Module Usuarios/Table/Icon - More Options'))
WebUI.click(findTestObject('Object Repository/Module Usuarios/Table/Icon - Ver Usuario'))

WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Form Step 1/Button - Siguiente'))

WebUI.verifyElementAttributeValue(findTestObject('Module Usuarios/Create Users Form/Form Step 2/Input - Cargo'), 'value', 
    NewCargo, 5)

System.out.println('User was edited successfully.')

WebUI.click(findTestObject('Object Repository/Module Usuarios/Create Users Form/Button - Close Modal'))

WebUI.closeBrowser()

