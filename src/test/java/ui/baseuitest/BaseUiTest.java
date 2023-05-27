package ui.baseuitest;

import com.codeborne.selenide.Configuration;
import com.winter.pages.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariOptions;
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
    public UploadDownloadPage uploadDownloadPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public BrowserWindowsPage browserWindowsPage;
    public AlertsPage alertsPage;


    @BeforeClass
    public void setUp() {
        textBoxPage = new TextBoxPage();
        checkBoxPage = new CheckBoxPage();
        radioButtonPage = new RadioButtonPage();
        webTablesPage = new WebTablesPage();
        buttonsPage = new ButtonsPage();
        linksPage = new LinksPage();
        brokenLinks_images = new BrokenLinks_Images();
        uploadDownloadPage = new UploadDownloadPage();
        dynamicPropertiesPage = new DynamicPropertiesPage();
        browserWindowsPage = new BrowserWindowsPage();
        alertsPage = new AlertsPage();
        navigate = new Navigate();


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        Configuration.browserCapabilities = desiredCapabilities;

        Configuration.reportsFolder = "target/screenshots";

//        Configuration.holdBrowserOpen = true;
//        SafariOptions safariOptions = new SafariOptions();
//        safariOptions.setCapability("safariInitialWindowRect", "{0, 0, 1600, 1200}");
//
//        Configuration.browser = "safari";

        open("https://demoqa.com/");
    }

    @BeforeClass
    public void setUpBrowser(){

    }

    @AfterClass
    public void tearDown() {

    }
}
