package ui;


import org.testng.annotations.Test;
import ui.baseuitest.BaseUiTest;


public class BrokenLinks_ImagesTest extends BaseUiTest {

    @Test
    public void validLinkTest() {
        navigate.toBrokenLinks_Images();
        brokenLinks_images.getBrokenLinks();
        brokenLinks_images.getBrokenImage();

        }
    }
