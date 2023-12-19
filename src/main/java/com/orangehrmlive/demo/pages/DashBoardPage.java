package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;



    public class DashBoardPage extends Utility {

        private static final Logger log = LogManager.getLogger(DashBoardPage.class.getName());

        @CacheLookup
        @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
        WebElement verifyTheTextDashboard;

        public String getVerifyTheTextDashboard() {
            return getTextFromElement(verifyTheTextDashboard);

        }
    }
