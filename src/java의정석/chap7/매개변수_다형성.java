package java의정석.chap7;

import java.util.Vector;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product() {
        price = 0;
        bonusPoint = 0;
    }
}

class Computer extends Product{
    Computer() { super(200); }
    public String toString() { return "Computer"; }
}
class Audio extends Product{
    Audio() { super(50); }
    public String toString() { return "Audio"; }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector(); // 동적으로 관리되는 객체 배열

    // 클래스별로(Computer, Audio) buy메서드를 만들지 않고 다형성을 적용하여 하나의 메서드로 처리
    // Computer클래스와 Audio클래스는 Product클래스의 자손이므로 Product p에 인스턴스를 제공하는 것이 가능.
    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "을/를 구입하였습니다.");
    }

    void refund(Product p) {
        if(item.remove(p)) { // remove에 성공하면 true
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하였습니다.");
        } else {
            System.out.println("반품에 실패하였습니다.");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if(item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        for (int i = 0; i < item.size(); i++) {
            Product p = (Product)item.get(i);
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class 매개변수_다형성 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Computer com = new Computer();
        Audio audio = new Audio();

        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();

        b.refund(com);
        b.summary();
    }
}
