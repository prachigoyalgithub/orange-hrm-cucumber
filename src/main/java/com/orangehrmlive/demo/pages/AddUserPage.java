package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddUserPage extends Utility {

    private static final Logger log = LogManager.getLogger(AddUserPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']")
    WebElement verifyAddUserText;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
    WebElement selectUserRole;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement enterEmployeeName;

    @CacheLookup
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
    WebElement enterTheUserName;

    // By enterTheUserName = By.xpath("//input[@class='oxd-input oxd-input--focus']");

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']")
    WebElement selectStatus;

    @CacheLookup
    @FindBy(xpath = "//div[@class ='oxd-select-dropdown --position-bottom')]")
    WebElement selectAdmin;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Disabled')]")
    WebElement selectDisable;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//font[contains(text(),'Save')]")
    WebElement clickOnSaveButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-form-actions']")
    WebElement choseAdmin;


    public void selectUserRole(String role) {
        Reporter.log("Select role : " + selectUserRole.toString() + "<br>");
        selectByVisibleTextFromDropDown(selectAdmin, role);
    }

    public void putEmployeeNameInTheEmployeeNameField(String employeename) {
        Reporter.log("Enter Employee Name : " + enterEmployeeName.toString() + "<br>");
        sendTextToElement(enterEmployeeName, employeename);
    }

    public void putUserNameInTheUserNameField(String empUserName) {
        Reporter.log("Enter Employee User Name : " + enterTheUserName.toString() + "<br>");
        sendTextToElement(enterEmployeeName, empUserName);
    }

    public void selectUserStatus(String statusValue) {
        Reporter.log("Select Status : " + selectStatus.toString() + "<br>");

        selectByVisibleTextFromDropDown(selectStatus, statusValue);
    }

    public void enterPasswordInThePasswordField(String passWord) {
        Reporter.log("Enter password" + selectDisable.toString() + "<br>");
        sendTextToElement(selectDisable, passWord);
    }

    public void enterConfirmationPassword(String confirmationPassWord) {
        Reporter.log("Enter confirmation password" + confirmPassword.toString() + "<br>");
        sendTextToElement(confirmPassword, confirmationPassWord);
    }


    public void clickOnTheSaveButton() {
        Reporter.log("Click on the save Button : " + choseAdmin.toString() + "<br>");
        clickOnElement(choseAdmin);

    }
}