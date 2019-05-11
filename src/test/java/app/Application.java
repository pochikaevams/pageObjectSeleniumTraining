package app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CartPage;
import pages.ItemPage;
import pages.MainPage;

public class Application {

    private WebDriver driver;
    private MainPage mainPage;
    private ItemPage itemPage;
    private CartPage cartPage;

    public Application() {
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        itemPage = new ItemPage(driver);
        cartPage = new CartPage(driver);
    }

    public void quit() {
        driver.quit();
    }

    public void cartItemsAddAndRemove() {
        for(int i = 1; i < 4; i++) {
            mainPage.open();
            mainPage.items.get(0).click();
            if(!itemPage.optionsList.isEmpty()){
                itemPage.option.click();
                itemPage.optionsOption.click();
            }
            itemPage.addToCartButton.click();
            String text = Integer.toString(i);
            itemPage.checkQuantity(text);
        }
        itemPage.checkoutButton.click();
        cartPage.removeItems();
    }
}
