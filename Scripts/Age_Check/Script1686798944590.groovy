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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.watchyesnetwork.com/')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Age_Checker/Page_Watch  YES Network/button_DISMISS'))

WebUI.click(findTestObject('Object Repository/Age_Checker/Page_Watch  YES Network/button_SUBSCRIBE NOW'))

WebUI.setText(findTestObject('Object Repository/Age_Checker/Page_Watch  YES Network/input_Name_name'), 'Djay')

int RN

RN = ((Math.random() * 5000) as int)

WebUI.setText(findTestObject('Object Repository/Registration_NS/Page_Watch  YES Network/input_Email Address_email'), ('Djay+age' + RN) + '@amdocs.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Age_Checker/Page_Watch  YES Network/input_Password_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Age_Checker/Page_Watch  YES Network/div_Date of Birth'))

WebUI.setText(findTestObject('Object Repository/Registration_NS/Page_Watch  YES Network/input_Date of Birth_dob'), '2023/01/01')

WebUI.click(findTestObject('Object Repository/Age_Checker/Page_Watch  YES Network/div_Gender (optional)OptionalMaleFemaleOthe_c9c964'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Age_Checker/Page_Watch  YES Network/select_OptionalMaleFemaleOtherPrefer not to answer'), 
    'Male', true)

WebUI.click(findTestObject('Object Repository/Age_Checker/Page_Watch  YES Network/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Age_Checker/Page_Watch  YES Network/button_OK'))

WebUI.setText(findTestObject('Object Repository/Registration_NS/Page_Watch  YES Network/input_Date of Birth_dob'), '2000/01/01')

WebUI.click(findTestObject('Object Repository/Age_Checker/Page_Watch  YES Network/button_NEXT'))

WebUI.delay(3)

WebUI.closeBrowser()

