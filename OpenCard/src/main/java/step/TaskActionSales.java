package step;

import net.bytebuddy.matcher.ElementMatcher;
import net.thucydides.core.annotations.Step;
import pageobject.PageObjectUrl;

import static net.bytebuddy.matcher.ElementMatchers.is;

public class TaskActionSales {
    private PageObjectUrl pageObjectUrl;

    @Step
    public void  singIn() {

        pageObjectUrl.user.sendKeys("demo");
        pageObjectUrl.pass.sendKeys("demo");
        pageObjectUrl.btn_sing_in.click();
        pageObjectUrl.btn_sing_in_Sales.click();
        pageObjectUrl.btn_sing_in_Returns.click();
        pageObjectUrl.Category_Return_ID.sendKeys("38656");
        pageObjectUrl.Category_Order_ID.sendKeys("12345");
        pageObjectUrl.Filter.click();

    }

    @Step
    public void verificar(){
        assertThat (pageObjectUrl.lbl_Menu.isCurrentlyVisible(), is(true));
    }

    private void assertThat(boolean currentlyVisible, ElementMatcher.Junction<Object> objectJunction) {
    }
}