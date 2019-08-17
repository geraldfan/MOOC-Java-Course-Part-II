
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gerald
 */
public class ShoppingBasket {

    private Map<String, Purchase> purchases = new HashMap<String, Purchase>();

    public ShoppingBasket() {
    }

    public void add(String product, int price) {
        if (purchases.containsKey(product)) {
            purchases.get(product).increaseAmount();;
        } else {
            Purchase purchase = new Purchase(product, 1, price);
            purchases.put(product, purchase);
        }
    }

    public int price() {
        int totalPrice = 0;
        for (Purchase p : purchases.values()) {
            totalPrice += p.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Purchase p : purchases.values()) {
            System.out.println(p);
        }
    }
}
