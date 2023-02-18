package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {

    //    Page Objelerini bu sinifda buluruz
    //    Wir finden Seitenobjekte (WebElement) in dieser Klasse
    //    We find page objects (WebElement) in this Class

    //    1.Step -> Constructor:  We Create Constructor

    public OpenSourcePage(){
//        PageFactory seleniumdan gelen ve bu sayfa elementlerini baslangic degeri vermek icin kullanilir
//        PageFactory comes from Selenium and is used to initialize this WebElement
//        PageFactory stammt von Selenium und wird verwendet, um diese WebElement zu initialisieren

//        Bu sekilde Sayfa objeleri cagrildiginda null pointer exception alinmaz
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //    2.Step -> CREATE PAGE OBJECTS (WebElement)

    //    PAGE OBJELERINI OLUSTUR
    //    Until now by JUnit  => public WebElement username = Driver.getDriver().findElement(By.name("username"));

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;
}


