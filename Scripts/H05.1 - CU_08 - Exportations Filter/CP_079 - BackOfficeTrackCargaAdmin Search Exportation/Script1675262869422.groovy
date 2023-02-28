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
WebUI.callTestCase(findTestCase('Calls/Call - Login Passes'), [('Email') : GlobalVariable.Usr_BackOffice_TrackCarga_Admin], FailureHandling.STOP_ON_FAILURE)

//Module Exportaciones
//Search not found
WebUI.click(findTestObject('Object Repository/Module Exportaciones/Icon - Exportaciones'))

WebUI.click(findTestObject('Object Repository/Module Exportaciones/Module - Track Exportaciones'))

//Search found
WebUI.setText(findTestObject('Module Exportaciones/Filters/Input - Prefijo'), '020', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Module Exportaciones/Filters/Input - Nro Guía Madre'), '22328331', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Module Exportaciones/Filters/Button - Buscar'))

//Results
//Validate table and headers appear
WebUI.verifyElementPresent(findTestObject('Object Repository/Module Exportaciones/Table - Results'), 2)

//Look for another track
WebUI.click(findTestObject('Object Repository/Module Exportaciones/Button - Ver Filtros'))

WebUI.setText(findTestObject('Module Exportaciones/Filters/Input - Nro Guía Hija'), '000420327364', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Module Exportaciones/Filters/Button - Buscar'))

//Results
//Validate table and headers appear
WebUI.verifyElementPresent(findTestObject('Object Repository/Module Exportaciones/Table - Results'), 2)

//Look for another track
WebUI.click(findTestObject('Object Repository/Module Exportaciones/Button - Ver Filtros'))

WebUI.click(findTestObject('Module Exportaciones/Filters/Dropdown - Estado Inventario'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Module Exportaciones/Filters/Option - Estado Despachado'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Module Exportaciones/Filters/Calendar - Fecha Desde'), '01/01/2023', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Module Exportaciones/Filters/Calendar - Fecha Hasta'), '01/03/2023', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Module Exportaciones/Filters/Button - Buscar'))

//Results
//Validate table and headers appear
WebUI.verifyElementNotPresent(findTestObject('Module Exportaciones/Filters/Button - Limpiar'), 2)

WebUI.closeBrowser()