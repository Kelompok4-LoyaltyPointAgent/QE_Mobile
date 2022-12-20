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

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Ex. examplegmail.com'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Ex. examplegmail.com (1)'), 'DD321@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Ex. Password'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Ex. Password (1)'), 'DD@12345', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (2)'), 0)


Mobile.tap(findTestObject('Object Repository/Transaksi/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Transaksi/android.widget.EditText - Contoh  081234567890'), 0)

Mobile.setText(findTestObject('Object Repository/Transaksi/android.widget.EditText - Contoh  081234567890 (1)'), '087874699446', 
    0)

Mobile.tap(findTestObject('Object Repository/Transaksi/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Transaksi/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Transaksi/android.view.View (1)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Transaksi/android.view.View (2)'), 0)

Mobile.closeApplication()

