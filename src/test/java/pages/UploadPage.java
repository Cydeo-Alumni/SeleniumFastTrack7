package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class UploadPage {

    public UploadPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "file-upload")
    public WebElement chooseButton;

    @FindBy(id = "file-submit")
    public WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    public WebElement file;
}
