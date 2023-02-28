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
WebUI.callTestCase(findTestCase('Calls/Call - Login Passes'), [('Email') : GlobalVariable.Usr_Aerolinea_TrackCarga], FailureHandling.STOP_ON_FAILURE)

//Module Exportaciones
//Search not found
WebUI.click(findTestObject('Object Repository/Module Exportaciones/Icon - Exportaciones'))

WebUI.click(findTestObject('Object Repository/Module Exportaciones/Module - Track Exportaciones'))

//Search found
WebUI.callTestCase(findTestCase('Calls/Call - Filters Exportation'), 
	[('Prefijo') : '', 
		('GuiaMadre') : '', 
		('GuiaHija') : '000420327363', 
		('Inventario') : '', 
		('FechaInicio') : '', 
		('FechaFin') : ''], FailureHandling.STOP_ON_FAILURE)

//Results
//Validate table and headers appear
WebUI.verifyElementPresent(findTestObject('Object Repository/Module Exportaciones/Table - Results'), 2)

//See details
WebUI.click(findTestObject('Object Repository/Module Exportaciones/Exportation Results Table/Button - Detalle Exportación'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Module Exportaciones/Exportation Detail/Gif - Loading Expo Details'), 2)

WebUI.waitForElementPresent(findTestObject('Object Repository/Module Exportaciones/Exportation Detail/Button - Volver a Expo Dashboard'), 10)

//Milestones interaction
WebUI.click(findTestObject('Object Repository/Module Exportaciones/Exportation Detail/Hito 1 - Recepción'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Module Exportaciones/Exportation Detail/Hito 2 - Seguridad'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Module Exportaciones/Exportation Detail/Hito 3 - Almacenamiento'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Module Exportaciones/Exportation Detail/Hito 4 - Paletizado'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Module Exportaciones/Exportation Detail/Hito 4 - Despacho'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/Module Exportaciones/Exportation Detail/Hito 5 - Despacho'), FailureHandling.OPTIONAL)

WebUI.closeBrowser()