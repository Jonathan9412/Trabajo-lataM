package step;


import net.bytebuddy.matcher.ElementMatcher;
import net.thucydides.core.annotations.Step;
import pageobject.PageObjectUrl;


import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matcher.*;

public class TaskActionCatalog {
    private PageObjectUrl pageObjectUrl;

    @Step
    public void  singIn() {

        pageObjectUrl.user.sendKeys("demo");
        pageObjectUrl.pass.sendKeys("demo");
        pageObjectUrl.btn_sing_in.click();
        pageObjectUrl.btn_sing_in_catalog.click();
        pageObjectUrl.btn_sing_in_Categories.click();
        pageObjectUrl.btn_sing_in_Add.click();
        pageObjectUrl.Category_Name.sendKeys("Robots");
        pageObjectUrl.Save.click();



    }

    @Step
    public void verificar(){
        assertThat (pageObjectUrl.lbl_Menu.isCurrentlyVisible(), is(true));
    }

    private void assertThat(boolean currentlyVisible, ElementMatcher.Junction<Object> objectJunction) {
    }
}