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

WebUI.delay(7)

Mobile.tap(findTestObject('screen/Skip_button'), 10)

Mobile.tap(findTestObject('HomePage/Add_Task_button'), 10)

Mobile.delay(5)

if ((taskTitle != null) && (taskTitle != '')) {
    Mobile.setText(findTestObject('Task_Page/tasktitle_textField'), taskTitle, 0)

    println('Task title diset: ' + taskTitle)
} else {
    println('Task title kosong, tidak diset')
}

Mobile.delay(1)

Mobile.setText(findTestObject('Task_Page/taskdone_textField'), taskDone, 0)

Mobile.tap(findTestObject('Task_Page/Save_button'), 0)

Mobile.tap(findTestObject('Task_Page/ThreeDot_button'), 0)

Mobile.delay(2)

Mobile.tapAtPosition(675, 846)

Mobile.delay(2)

Mobile.tap(findTestObject('Task_Page/Delete_button'), 10)

Mobile.tap(findTestObject('HomePage/Add_Task_button'), 10)

Mobile.tap(findTestObject('Task_Page/BackToHome_button'), 10)

Mobile.verifyElementText(findTestObject('HomePage/NoTaskToShow_text'), NoTaskToShow)

