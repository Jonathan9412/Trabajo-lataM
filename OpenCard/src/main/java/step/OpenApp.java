package step;

import net.thucydides.core.annotations.Step;
import pageobject.PageObjectUrl;

public class OpenApp {
    private PageObjectUrl pageObjectUrl;

    @Step
    public void  appUrl() {
        pageObjectUrl.open();
}

}