
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gerald
 */
public class Storehouse {

    private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> stocks = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (stocks.containsKey(product) && stocks.get(product) != 0) {
            int oldStock = stocks.get(product);
            if (oldStock > 0) {
                oldStock--;
            }
            stocks.replace(product, oldStock);
            return true;
        } else {
            return false;
        }
    }

    public Set<String> products() {
        return stocks.keySet();
    }
}
