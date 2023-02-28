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
WebUI.callTestCase(findTestCase('Calls/Call - Login Passes'), [('Email') : GlobalVariable.Usr_GHA_TrackCarga_Admin], FailureHandling.STOP_ON_FAILURE)

//Module Exportaciones...
//Search not found
WebUI.click(findTestObject('Object Repository/Module Exportaciones/Icon - Exportaciones'))

WebUI.click(findTestObject('Object Repository/Module Exportaciones/Module - Track Exportaciones'))

WebUI.click(findTestObject('Object Repository/Module Exportaciones/Filters/Button - Buscar'))

WebUI.waitForElementPresent(findTestObject('Module Exportaciones/Modal - Track No Encontrado'), 10)

WebUI.click(findTestObject('Module Exportaciones/Button - Entendido'))

//Search found
WebUI.callTestCase(findTestCase('Calls/Call - Filters Exportation'),
	[('Prefijo') : '',
		('GuiaMadre') : '',
		('GuiaHija') : '',
		('Inventario') : '',
		('FechaInicio') : '01/11/2022',
		('FechaFin') : '01/01/2023'], FailureHandling.STOP_ON_FAILURE)
