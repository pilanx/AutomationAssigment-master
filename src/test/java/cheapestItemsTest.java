import pages.homePage;
import pages.resultPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import utils.FileUtil;

import java.io.IOException;
import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.open;

public class cheapestItemsTest extends baseTest {
    pages.homePage homePage = new homePage();
    pages.resultPage resultPage = new resultPage();
    FileUtil writer = new FileUtil();

    @Test
    void cheapestItemsTest() throws IOException {
        ArrayList<String> links = new ArrayList<String>();
        open(Configuration.baseUrl);
        homePage.searchBar().val("wireless headphones QC 35 version 2");
        homePage.searchButton().click();
        resultPage.sortMenu().click();
        resultPage.sortLowToHigh().click();
        links.add(resultPage.itemLinks().get(3).getAttribute("href"));
        links.add(resultPage.itemLinks().get(4).getAttribute("href"));
        links.add(resultPage.itemLinks().get(5).getAttribute("href"));
        writer.saveUrls(links);
    }
}
