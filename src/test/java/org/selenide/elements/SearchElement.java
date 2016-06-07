package org.selenide.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.selenide.elements.interfaces.IPerformsSearch;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by dshynkarenko on 6/3/2016.
 */
public class SearchElement implements IPerformsSearch {

    private SelenideElement searchBox = $(By.xpath("//igov-search//form/input"));
    private SelenideElement searchStat = $(By.xpath("//span[@class=\"icon-e-service-on\"]"));

    public SearchElement()
    {

    }

    public void performSearch (String searchText){

        searchBox.val(searchText).pressEnter();

    }

    public boolean isSearchResultValid (String neededText)
    {
        if (searchStat.shouldHave(Condition.text(neededText)) != null)
            return true;
        return false;
    }
}
