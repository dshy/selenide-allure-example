package pages;

import org.selenide.elements.SearchElement;

/**
 * Created by dshynkarenko on 6/3/2016.
 */
public class MainPage extends AbstractPage {

    private SearchElement searchfield = new SearchElement();

    public MainPage() {

    }

    public void performSearch(String keyword){

        searchfield.performSearch(keyword);

    }

    public boolean isSearchResultValid(String searchedText){

        return searchfield.isSearchResultValid(searchedText);

    }
}
