package tests;

import org.junit.jupiter.api.Test;

public class addItemsToCartTest extends TestBase {

    @Test
    public void cartItemsTest() {
        app.cartItemsAddAndRemove();
    }
}
