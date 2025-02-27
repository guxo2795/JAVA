package java의정석.chap6_ex;

class SutdaCard {
    int num; // 카드의 숫자 1~10
    boolean isKwang; // 광이면 true, 아니면 false

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    String info() {
        return num + (isKwang ? "K" : "");
    }

}

public class ex6_1 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3,false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info()); // 3
        System.out.println(card2.info()); // 1K
    }
}
