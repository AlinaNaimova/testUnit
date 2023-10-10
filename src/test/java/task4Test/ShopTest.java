package task4Test;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import task4.Product;
import task4.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;


    @Before
    public void setUp() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", 250.0));
        products.add(new Product("Product 2", 200.0));
        products.add(new Product("Product 3", 430.0));
        shop = new Shop(products);
    }

    @Test
    public void testGetProducts() {
        assertEquals(3, shop.getProducts().size());
        assertEquals("Product 1", shop.getProducts().get(0).getName());
        assertEquals(250.0, shop.getProducts().get(0).getPrice(), 0.001);
        assertEquals("Product 2", shop.getProducts().get(1).getName());
        assertEquals(200.0, shop.getProducts().get(1).getPrice(), 0.001);
        assertEquals("Product 3", shop.getProducts().get(2).getName());
        assertEquals(430.0, shop.getProducts().get(2).getPrice(), 0.001);
    }

    @Test
    public void testGetMostExpensiveProduct() {
        assertEquals("Product 3", shop.getMostExpensiveProduct().getName());
        assertEquals(430.0, shop.getMostExpensiveProduct().getPrice(), 0.001);
    }

    @Test
    public void testSortProductsByPrice() {
        shop.sortProductsByPrice();
        assertEquals("Product 2", shop.getProducts().get(0).getName());
        assertEquals("Product 1", shop.getProducts().get(1).getName());
        assertEquals("Product 3", shop.getProducts().get(2).getName());
    }

}
