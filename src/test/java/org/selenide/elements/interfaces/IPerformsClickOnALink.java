package org.selenide.elements.interfaces;

/**
 * Created by dshynkarenko on 6/6/2016.
 */
public interface IPerformsClickOnALink {

        public void clickOn(int index);
        public void clickOn(String text);
        public int getLinkCount();
    }


