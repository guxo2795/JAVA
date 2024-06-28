package java의정석.chap6;

class Card {
    // 인스턴스 변수 : 인스턴스마다 고유한 상태, 값을 유지해야할 경우
    // 인스턴스를 생성할 때 만들어짐.
    String kind;
    int number;

    // 클래스 변수(static) : 모든 인스턴스가 공통적인 상태, 값을 유지해야할 경우
    // 클래스가 메모리에 loading될 때 생성.
    static int width = 100;
    static int height = 250;
}

public class 클래스변수_인스턴스변수 {
    public static void main(String[] args) {
        // 클래스 변수는 인스턴스 생성 없이 사용 가능
        // 단, 인스턴스 생성 없이 사용할 경우 '클래스명.클래스변수' 형식 사용
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
        System.out.println();

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1, " + c1.kind + ", " + c1.number + ", " + c1.width + ", " + c1.height);
        System.out.println("c2, " + c2.kind + ", " + c2.number + ", " + c2.width + ", " + c2.height);
        System.out.println();

        // 클래스 변수 값 변경
        // 클래스 변수는 서로 값을 공유하기 때문에, 한 인스턴스에서 클래스변수 값을 변경할 경우 모든 인스턴스에 영향.
        c1.width = 50;
        c1.height = 80;

        // 클래스 변수를 사용할때 c1, c2를 사용해도 되지만 인스턴스 변수로 오해할 수 있기 때문에
        // '클래스명.클래스변수' 형태를 사용하는 것이 좋다.
        System.out.println("c1, " + c1.kind + ", " + c1.number + ", " + Card.width + ", " + Card.height);
        System.out.println("c2, " + c2.kind + ", " + c2.number + ", " + c2.width + ", " + c2.height);
        System.out.println();

    }
}
