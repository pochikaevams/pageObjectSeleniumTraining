package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(name="remove_cart_item")
    public WebElement removeItemButton;

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void removeItems() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("remove_cart_item")));
        List<WebElement> itemProducts = driver.findElements(By.cssSelector("[style=\"text-align: center;\"]"));
        for(int i = itemProducts.size(); i > 0; i--){
            removeItemButton.click();
            wait.until(ExpectedConditions.stalenessOf(itemProducts.get(0)));
        }
    }
}
