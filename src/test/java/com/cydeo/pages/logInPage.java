package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.propertiesReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInPage {

    public logInPage() {
        PageFactory.initElements(Driver.getDrv(),this);
    }

    @FindBy(id ="user")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passWordInput;

    @FindBy(id = "submit-form")
    public WebElement LoginBtn;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public  WebElement AlertForInvalidData;

    @FindBy(xpath = "//a[@class = 'toggle-password']")
    public  WebElement EyeIcon;

    @FindBy(xpath = "//a[@id = 'lost-password']")
    public  WebElement ForgetPassBtn;


    public void LogInByDefaultData(){
        Driver.getDrv().get( propertiesReader.getProperty("url") );
        userNameInput.sendKeys(propertiesReader.getProperty("defaultUserName"));
        passWordInput.sendKeys(propertiesReader.getProperty("defaultPassWord"));
        LoginBtn.click();
    }
}
