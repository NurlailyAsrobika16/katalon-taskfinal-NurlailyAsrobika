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

// Tambah delay lebih lama agar app fully loaded
WebUI.delay(7)

Mobile.tap(findTestObject('screen/Skip_button'), 10)

Mobile.waitForElementPresent(findTestObject("HomePage/Add_Task_button"), 10)
Mobile.delay(2)
Mobile.tap(findTestObject("HomePage/Add_Task_button"), 0)

Mobile.delay(2)

if ((taskTitle != null) && (taskTitle != '')) {
    Mobile.setText(findTestObject('Task_Page/tasktitle_textField'), taskTitle, 0)

    println('Task title diset: ' + taskTitle)
} else {
    println('Task title kosong, tidak diset')
}

Mobile.waitForElementPresent(findTestObject("Task_Page/taskdone_textField"), 10)
Mobile.delay(1)
Mobile.setText(findTestObject("Task_Page/taskdone_textField"), taskDone, 0)

Mobile.tap(findTestObject('Task_Page/testPicker/SetDate/SetDate_textField'), 0)

Mobile.tap(findTestObject('Task_Page/testPicker/SetDate/30Apr_calender'), 0)

Mobile.tap(findTestObject('Task_Page/testPicker/SetDate/SetDate_Oke_button'), 0)

Mobile.tap(findTestObject('Task_Page/testPicker/SetTime/SetTime_textField'), 0)

Mobile.tapAtPosition(767, 1346)

Mobile.tapAtPosition(545, 1436)

Mobile.tap(findTestObject('Task_Page/testPicker/SetTime/AM_clock'), 0)

Mobile.tap(findTestObject('Task_Page/testPicker/SetTime/SetTime_Oke_button'), 0)

Mobile.tap(findTestObject('Task_Page/category_dropDown'), 0)

switch (category) {
    case 'Banking':
        Mobile.tap(findTestObject('Task_Page/Banking_dropdown'), 0)

        break
    case 'Business':
        Mobile.tap(findTestObject('Task_Page/Business_dropdown'), 0)

        break
    case 'Insurance':
        Mobile.tap(findTestObject('Task_Page/Insurance_dropdown'), 0)

        break
    case 'Shopping':
        Mobile.tap(findTestObject('Task_Page/Shopping_dropdown'), 0)

        break
    default:
        Mobile.tap(findTestObject('Task_Page/Personal_dropdown'), 0)

        break
}

Mobile.tap(findTestObject('Task_Page/Save_button'), 0)

Mobile.verifyElementText(findTestObject('HomePage/TaskDoneDynamic_verify'), taskDone)

