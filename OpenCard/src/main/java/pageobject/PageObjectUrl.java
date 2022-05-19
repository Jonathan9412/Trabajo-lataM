package pageobject;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://demo.opencart.com/admin/index.php?route=common/dashboard")
public class PageObjectUrl  extends PageObject {
    @FindBy (xpath ="input-username")
    public WebElementFacade user ;
    @FindBy (xpath ="input-password")
    public WebElementFacade pass ;
    @FindBy (xpath ="btn btn-primary")
    public WebElementFacade btn_sing_in ;

//////////////////proceso numero 2
    @FindBy (xpath ="//strong[contains(text(),'Catalog')]")
    public WebElementFacade btn_sing_in_catalog ;

    @FindBy (xpath ="//strong[contains(text(),'Categories')]")
    public WebElementFacade btn_sing_in_Categories ;

    @FindBy (xpath ="//strong[contains(text(),'Add New')")
    public WebElementFacade btn_sing_in_Add;

    @FindBy (xpath ="//strong[contains(text(),'Category Name')]")
    public WebElementFacade Category_Name ;

    @FindBy (xpath ="///strong[contains(text(),'Save')")
    public WebElementFacade Save ;

    /////////////////////proceso numero 3
    @FindBy (xpath ="//strong[contains(text(),' Sales')]")
    public WebElementFacade btn_sing_in_Sales;

    @FindBy (xpath ="//strong[contains(text(),'Returns')]")
    public WebElementFacade btn_sing_in_Returns ;

    @FindBy (xpath ="//strong[contains(text(),'Return ID')")
    public WebElementFacade Category_Return_ID;

    @FindBy (xpath ="//strong[contains(text(),'Order ID')]")
    public WebElementFacade Category_Order_ID;

    @FindBy (xpath ="///strong[contains(text(),' Filter')")
    public WebElementFacade  Filter ;

    //mensaje de verificación
    @FindBy (xpath ="//li[contains(text(), 'Menu')]")
    public WebElementFacade lbl_Menu ;
}
