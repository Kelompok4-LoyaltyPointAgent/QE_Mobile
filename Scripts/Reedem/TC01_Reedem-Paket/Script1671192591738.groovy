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

Mobile.startApplication('loyalty_point_agentcom.example.loyalty_point_agentv1.0.0 (1).apk', true)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/android.widget.ButtonLewati (1)'), 5)

Mobile.tap(findTestObject('Login/android.view.ViewMasuk (1)'), 0)

Mobile.tap(findTestObject('Login/android.widget.EditText - Ex. examplegmail.com'), 0)

Mobile.setText(findTestObject('Login/android.widget.EditText - Ex. examplegmail.com'), 'DD321@gmail.com', 0)

Mobile.tap(findTestObject('Login/android.widget.EditText - Ex. Password'), 0)

Mobile.setText(findTestObject('Login/android.widget.EditText - Ex. Password'), 'DD321', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Login/android.widget.ButtonMasuk (1)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/android.widget.ButtonMasuk (1)'), 0)

Mobile.tap(findTestObject('Transaksi/android.widget.ImageViewaPakaet'), 0)

Mobile.tap(findTestObject('Transaksi/android.widget.EditTextNomor'), 0)

Mobile.setText(findTestObject('Transaksi/android.widget.EditTextNomor'), '08787460946', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Transaksi/android.widget.ButtonProvider'), 0)

Mobile.tap(findTestObject('Transaksi/android.view.ViewTsel'), 0)

Mobile.tapAtPosition(327, 1367)