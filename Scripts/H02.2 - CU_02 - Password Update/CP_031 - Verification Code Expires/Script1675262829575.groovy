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

import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ServerURL)

WebUI.click(findTestObject('Object Repository/Login Page/Label - Forgot Password'))

//Enter email for verification code
WebUI.setText(findTestObject('Login Page/Forgot Password/Input - Ingresa Correo'), Email)

WebUI.click(findTestObject('Object Repository/Login Page/Forgot Password/Button - Enviar Código'))

WebUI.click(findTestObject('Object Repository/Login Page/Forgot Password/Button - Entendido'))

//Open another tab
WebUI.callTestCase(findTestCase('Calls/Call - Open Tab'), [('Path') : Outlook], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Draft objects/Draft - Outlook Avatar'))

WebUI.click(findTestObject('Object Repository/Draft objects/Draft - Progrez account'))

/*
WebUI.setText(findTestObject('Object Repository/Login Page/Forgot Password/Outlook - Email'), Email)

WebUI.click(findTestObject('Object Repository/Login Page/Forgot Password/Outlook - Button Next'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Login Page/Forgot Password/Outlook - Password'), 'Netze5-syfxaf-vecgir')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Login Page/Forgot Password/Outlook - Button Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Login Page/Forgot Password/Outlook - Login Si'))
*/

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Login Page/Forgot Password/Label - Email Código de Verificación'), 5)

WebUI.click(findTestObject('Object Repository/Login Page/Forgot Password/Label - Email Código de Verificación'))

CódigoVerificación = WebUI.getText(findTestObject('Login Page/Forgot Password/Label - Código Verificación Recibido' //Getting the code
        ))

System.out.println(CódigoVerificación)

WebUI.delay(360)

//Going back to TALMA
String currentPage = WebUI.getUrl()

int currentTab = WebUI.getWindowIndex()

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('window.open();')

WebUI.switchToWindowIndex(currentTab-1)

//
WebUI.setText(findTestObject('Object Repository/Login Page/Forgot Password/Input - Código Verificación'), CódigoVerificación)

WebUI.setText(findTestObject('Object Repository/Login Page/Forgot Password/Input - Nueva Contraseña 1'), NewPassword)

WebUI.setText(findTestObject('Object Repository/Login Page/Forgot Password/Input - Nueva Contraseña 2'), NewPassword)

WebUI.click(findTestObject('Object Repository/Login Page/Forgot Password/Icon - Show Password'))

WebUI.click(findTestObject('Object Repository/Login Page/Forgot Password/Icon - Hide Password 1'))

WebUI.click(findTestObject('Object Repository/Login Page/Forgot Password/Button - Continuar Contraseña'))

WebUI.closeBrowser()
