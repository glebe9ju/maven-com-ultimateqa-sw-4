package com.ultimateqa.pages;

import com.ultimateqa.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    //   //click on the ‘Sign In’ link
    By signInLink = By.xpath("//li[@class='header__nav-item header__nav-sign-in']");
    By welComeText = By.xpath("//h1[contains(text(),'Welcome Back!')]");

    public void clickOnLoginLink(){
        clickOnElement(signInLink);

    }
    public String getWelcomeText(){
        return getTextFromElement(welComeText);

    }
}
