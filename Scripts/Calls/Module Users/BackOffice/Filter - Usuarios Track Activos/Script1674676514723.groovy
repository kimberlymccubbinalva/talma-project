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

WebUI.click(findTestObject('Module Usuarios/Filters/Filter - Input - cbo_rol'))

WebUI.click(findTestObject('Module Usuarios/Create Users Form/Form Step 2/Option - Rol Aerolinea'))

WebUI.delay(3)

WebUI.click(findTestObject('Module Usuarios/Filters/Filter - Input - cbo_profile backoffice'))

WebUI.click(findTestObject('Module Usuarios/Create Users Form/Form Step 2/Option - Perfil Track de Carga Expo'))

WebUI.click(findTestObject('Module Usuarios/Filters/Filter - Input - cbo_activated BackOffice'))

WebUI.click(findTestObject('Module Usuarios/Filters/Option - Estado Activo'))

WebUI.click(findTestObject('Module Usuarios/Filters/Button - Applicar Filtros'))

