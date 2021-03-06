package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ItemPage extends BasePage {

    @FindBy(name="options[Size]")
    public List<WebElement> optionsList;

    @FindBy(name="options[Size]")
    public WebElement option;

    @FindBy(css="option[value=\"Small\"]")
    public WebElement optionsOption;

    @FindBy(name="add_cart_product")
    public WebElement addToCartButton;

    @FindBy(xpath="//a[text() = 'Checkout »']")
    public WebElement checkoutButton;

    public ItemPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.navigate().to("http://localhost:8080/litecart/en/rubber-ducks-c-1/subcategory-c-2/yellow-duck-p-1");
    }

    public void checkQuantity(String text) {
        WebElement quantity = driver.findElement(By.className("quantity"));
        wait.until(ExpectedConditions.textToBePresentInElement(quantity, text));
    }
}
