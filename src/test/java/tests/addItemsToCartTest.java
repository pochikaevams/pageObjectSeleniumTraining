package tests;


import org.junit.Test;

public class addItemsToCartTest extends TestBase {

    @Test
    public void cartItemsTest() {
        app.cartItemsAddAndRemove();
    }
}
