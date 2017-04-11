package dataStructure;

import java.util.HashMap;

/**
 * Created by brijesh on 11/4/17.
 */
public class RestaurantMenu {
    public static void main(String[] args) {
        HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();
        restaurantMenu.put("Paneer Pizza", 300);
        restaurantMenu.put("Matar Paneer", 100);
        restaurantMenu.put("Naan", 40);

        System.out.println(restaurantMenu.size());

        for (String item: restaurantMenu.keySet()) {
            System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " Rupees" );
        }
    }
}
