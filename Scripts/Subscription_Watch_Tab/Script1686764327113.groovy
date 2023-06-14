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

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/button_DISMISS'))

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/button_SUBSCRIBE NOW'))

WebUI.setText(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/input_Name_name'), 'djay')

int RN

RN = ((Math.random() * 5000) as int)

WebUI.setText(findTestObject('Object Repository/Registration_Subscribe/Page_Watch  YES Network/input_Email Address_email'), 
    ('Djay+test' + RN) + '@amdocs.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/input_Password_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/div_Date of Birth'))

WebUI.setText(findTestObject('Object Repository/Registration_Subscribe/Page_Watch  YES Network/input_Date of Birth_dob'),
	'2000/01/01')

WebUI.selectOptionByValue(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/select_OptionalMaleFemaleOtherPrefer not to answer'), 
    'Male', true)

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/button_NOT INTERESTED'))

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/button_YOUR FAVORITE TEAMS_Brooklyn-Nets'))

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/button_YOUR FAVORITE TEAMS_NewYork-Liberty'))

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/button_Ill do this later'))

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/span_MAYBE LATER'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/button_SUBSCRIBE NOW'))

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/button_SUBSCRIBE'))

WebUI.setText(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/input_Name on Card_nameOnCard'), 
    'djay')

WebUI.setText(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/input_Credit Card Number_cardNumber'), 
    '4242 4242 4242 4242')

WebUI.setText(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/input_Exp MMYY_expiryDate'), 
    '01/24')

WebUI.setEncryptedText(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/input_CVV_securityCode'), 
    'AbZbeXpnEm4=')

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/input_19.99_termsconditions'))

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/button_Subscribe Now (1)'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/button_CONTINUE'))

WebUI.delay(3)

WebUI.refresh()

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/h3_On Now'), 
    0)

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/img'))

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/div_Manage Subscription'))

WebUI.verifyElementText(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/button_CHANGE PLAN'), 
    'CHANGE PLAN')

WebUI.verifyElementText(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/div_MANAGE SUBSCRIPTION (1)'), 
    'MANAGE SUBSCRIPTION')

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/svg'))

WebUI.click(findTestObject('Object Repository/Watch_Screen_Subscribe/Page_Watch  YES Network/div_Log Out'))

WebUI.closeBrowser()

