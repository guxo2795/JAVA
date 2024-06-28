package java의정석;

class Data1 {
    int value;
}

class Data2 {
    int value;

    // 생성자 추가
    Data2(int x) {
        value = x;
    }

    // 위에 이미 생성자를 정의 했으므로 기본생성자를 직접 추가해줘야함.
    Data2() {}
}

// 매개변수를 사용한 생성자
class Car {
    String color;
    String gearType;
    int door;

    Car() {}

    Car(String color) {
        // 생성자에서 다른 생성자 호출 - this
        this(color, "auto", 4);
    }

    Car(String color, String gearType, int door) {
        // this는 인스턴스 자신을 가리키는 '참조변수', 인스턴스의 주소가 저장되어있음.
        // this()는 생성자
        // this와 this()는 비슷하게 생겼을 뿐 전혀 다른 것.
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    // 인스턴스 복사
    Car(Car c) {
//        color = c.color;
//        gearType = c.gearType;
//        door = c.door;
        this(c.color, c.gearType, c.door);
    }
}

public class 생성자 {
    public static void main(String[] args) {
        Data1 d1 = new Data1(); // 컴파일러가 제공하는 기본생성자 사용
//        Data2 d2 = new Data2();
        // 생성자 Data2(int x)가 이미 정의되어있으므로 컴파일러가 기본생성자를 추가해주지 않음
        Data2 d2 = new Data2(10);


        // 인스턴스 생성 후 초기화
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        // 인스턴스 생성과 동시에 초기화 -> 매개변수가 있는 생성자 이용
        Car c2 = new Car("black", "auto", 4);

        // 인스턴스 복사
        Car c3 = new Car(c2);

        c2.door = 6;

        // c3는 c2를 복사했으므로 서로 같은 상태를 갖지만, 서로 독립적인 메모리공간을 가짐.
        // c2의 값을 변경해도 c3에 영향을 미치지 않음.
        System.out.println("c2.door = " + c2.door);
        System.out.println("c3.door = " + c3.door);


    }

}
