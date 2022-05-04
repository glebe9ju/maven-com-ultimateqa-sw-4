package com.ultimateqa.pages;

import com.ultimateqa.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeBack = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By emailField = By.id("user[email]");
    By passwordField =  By.id("user[password]");
    By signInButton = By.xpath("//input[@value='Sign in']");
//    By invalidEmailOrPassword = By.className("//li[@class='form-error__list-item']");
    By invalidEmailOrPassword = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public String getWelcomeText(){
        return getTextFromElement(welcomeBack);
    }
    public void enterEmailId(String email){
        sendTextToElement(emailField,email);

    }
    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }
    public void clickOnLogingButton(){
        clickOnElement(signInButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(invalidEmailOrPassword);

    }

}
