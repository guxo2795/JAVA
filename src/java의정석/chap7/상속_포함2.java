package java의정석.chap7;

public class 상속_포함2 {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0); // 첫번째 카드
        // 참조변수의 출력은 toString()이 자동으로 호출되어 참조변수를 문자열로 대치한 후 처리
        System.out.println(c);


        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }
}

// 카드 덱(Deck)은 카드(Card)를 포함한다. => 포함관계
class Deck {
    final int CARD_NUM = 52; // 한 덱의 카드 개수
    Card cardArr[] = new Card[CARD_NUM];

    Deck() {
        int i = 0;

        for(int k = Card.KIND_MAX; k > 0; k--)
            for(int n = 1; n < Card.NUM_MAX; n++)
                cardArr[i++] = new Card(k, n);
    }

    Card pick(int index) { // 지정된 위치(index)에 있는 카드 하나를 꺼냄
        return cardArr[index];
    }

    Card pick() {
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for(int i = 0; i < cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);

            Card tmp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = tmp;
        }
    }
}

class Card{
    static final int KIND_MAX = 4; // 카드 무늬
    static final int NUM_MAX = 13; // 무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // toString()은 모든 클래스의 최상위계층인 Object에 선언되어있음.
    // 모든 상속계층도의 최상위에는 Object가 존재함. => toString(), equals(Object o)같은 메서드를
    // 따로 정의하지 않아도 사용가능한 이유.
    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK"; // 숫자 10은 X

        return "kind : " + kinds[this.kind] + ", number : " +numbers.charAt(this.number);
    }
}
