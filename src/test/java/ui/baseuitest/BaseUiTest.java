package ui.baseuitest;

import com.codeborne.selenide.Configuration;
import com.winter.pages.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;


public abstract class BaseUiTest {


    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public Navigate navigate;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;
    public ButtonsPage buttonsPage;
    public LinksPage linksPage;
    public BrokenLinks_Images brokenLinks_images;


    @BeforeClass
    public void setUp() {
        textBoxPage = new TextBoxPage();
        checkBoxPage = new CheckBoxPage();
        radioButtonPage = new RadioButtonPage();
        webTablesPage = new WebTablesPage();
        buttonsPage = new ButtonsPage();
        linksPage = new LinksPage();
        brokenLinks_images = new BrokenLinks_Images();

        navigate = new Navigate();


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

        Configuration.holdBrowserOpen = true;

        Configuration.browserCapabilities = desiredCapabilities;
        open("https://demoqa.com/");
    }

    @BeforeClass
    public void setUpBrowser(){


    }

    @AfterClass
    public void tearDown() {

    }
}
