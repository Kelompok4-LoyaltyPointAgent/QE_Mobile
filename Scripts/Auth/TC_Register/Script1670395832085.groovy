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

Mobile.startApplication('F:\\2022\\QE_CapstoneProject\\Git\\QE_Mobile\\QE_Mobile\\app-release_2.apk', true)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Ex. Ahmad Krisdiantoro'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Ex. Ahmad Krisdiantoro (1)'), 'adriansah1234', 
    0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Ex. examplegmail.com'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Ex. examplegmail.com (1)'), 'adriansah1234@gmail.com', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Ex. Password'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Ex. Password (1)'), 'adriansah@12345', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button (1)'), 0)

Mobile.closeApplication()

