package testcase;

public class _01_HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!!!");

        WoowaMenu woowaMenu = new WoowaMenu();
        System.out.println(woowaMenu.getMenuNames());
        System.out.println(woowaMenu.getMenuPrices());
        System.out.println(woowaMenu.getPrice("제로콜라"));
        System.out.println(woowaMenu.isValidMenu("안녕하세요"));
    }
}
