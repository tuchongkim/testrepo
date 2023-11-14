package testcase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*

<애피타이저>
양송이수프(6,000), 타파스(5,500), 시저샐러드(8,000)

<메인>
티본스테이크(55,000), 바비큐립(54,000), 해산물파스타(35,000), 크리스마스파스타(25,000)

<디저트>
초코케이크(15,000), 아이스크림(5,000)

<음료>
제로콜라(3,000), 레드와인(60,000), 샴페인(25,000)


 */

public class WoowaMenu {
    private final HashMap<String, Integer> menuPrice = new HashMap<>();

    public WoowaMenu() {
        menuPrice.put("양송이수프", 6000);
        menuPrice.put("타파스", 5500);
        menuPrice.put("시저샐러드", 8000);

        menuPrice.put("티본스테이크", 55000);
        menuPrice.put("바비큐립", 54000);
        menuPrice.put("해산물파스타", 35000);
        menuPrice.put("크리스마스파스타", 25000);

        menuPrice.put("초코케이크", 15000);
        menuPrice.put("아이스크림", 5000);

        menuPrice.put("제로콜라", 3000);
        menuPrice.put("레드와인", 60000);
        menuPrice.put("샴페인", 25000);
    }

    public List<String> getMenuNames() {
        return  new ArrayList<>(menuPrice.keySet());
    }

    public List<Integer> getMenuPrices() {
        return new ArrayList<>(menuPrice.values());
    }

    public Integer getPrice(String menuName) {
        return menuPrice.get(menuName);
    }

    public boolean isValidMenu(String menuName) {
        return menuPrice.containsKey(menuName);
    }
}
