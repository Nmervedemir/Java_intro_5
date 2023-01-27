package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework16 {
    public static void main(String[] args) {
        System.out.println(" ======== Task-1 ======== ");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        System.out.println(" ======== Task-2 ======== ");
        Map<String, Integer> list = new TreeMap<>();
        list.put("Apple", 3);
        list.put("Mango", 1);
        System.out.println(calculateTotalPrice1(list));

        System.out.println(" ======== Task-3 ======== ");
        Map<String, Integer> item = new TreeMap<>();
        item.put("Apple", 3);
        item.put("Mango", 5);
        System.out.println(calculateTotalPrice2(item));
    }

    public static Map<Integer, String> parseData(String str) {
        String[] cities = str.replaceAll("[{}]", " ").trim().split(" ");
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < cities.length; i++) {
            map.put(Integer.parseInt(cities[i]), cities[i + 1]);
            i++;
        }
        return map;
    }

    public static double calculateTotalPrice1(Map<String, Integer> map) {
        Map<String, Double> shoppingItem = new HashMap<>();
        shoppingItem.put("Apple", 2.00);
        shoppingItem.put("Orange", 3.29);
        shoppingItem.put("Mango", 4.99);
        shoppingItem.put("Pineapple", 5.25);

        double amount = 0.00;
        for (String m : map.keySet()) {
            amount += map.get(m) * shoppingItem.get(m);
        }
        return amount;
    }

    public static double calculateTotalPrice2(Map<String, Integer> item) {
        Map<String, Double> shoppingItem = new HashMap<>();
        shoppingItem.put("Apple", 2.00);
        shoppingItem.put("Orange", 3.29);
        shoppingItem.put("Mango", 4.99);
        double amount = 0.00;

        for (String m : item.keySet()) {
            if(item.get("Mango")>3) item.put("Mango", item.get("Mango")-1);
            if(item.get("Apple")% 2==1) amount+=(item.get("Apple")*.25);
            amount += shoppingItem.get(m) * item.get(m);
        }
        return amount;
    }
}
