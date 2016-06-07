package tests.smoke;

import com.codeborne.selenide.Screenshots;
import com.google.common.io.Files;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Title;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

  private String appUrl = "http://igov.org.ua";
  private MainPage testpage = new MainPage();

  @DataProvider(name = "Search")
  public Object[][] dataforSearch(){

      return new Object[][] {{"пасспорт"},{"справка"}};

  }


  @Title("Search Test")
  @Test(dataProvider = "Search")
  public void userCanSearchByKeyword(String keyword) {
    open(appUrl);
    testpage.performSearch(keyword);
    Assert.assertTrue(testpage.isSearchResultValid("18"));


    //$(By.name("q")).val("selenide").pressEnter();
    //$$("#ires .g").shouldHave(size(10));
    //$("#ires .g").shouldHave(text("selenide.org"));
  }

    @AfterSuite
    public void tearDown() throws IOException {
        screenshot();
    }

    @Attachment(type = "image/png")
    public byte[] screenshot() throws IOException {
        File screenshot = Screenshots.getLastScreenshot();
        return Files.toByteArray(screenshot);
    }
}
