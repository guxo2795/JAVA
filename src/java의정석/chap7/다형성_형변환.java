package java의정석.chap7;


class Car {
    String color;
    int door;
    void drive() {
        System.out.println("drive, Brrrr~");
    }
    void stop() {
        System.out.println("stop!!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!!");
    }
}

class Ambulance extends Car {
    void siren() {
        System.out.println("siren~~~~");
    }
}

public class 다형성_형변환 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
        Ambulance a = new Ambulance();

        Car c = new FireEngine(); // 조상타입의 참조변수로 자손타입의 인스턴스 참조o
        // 인스턴스의 일부 멤버만을 사용
//        FireEngine fe3 = new Car(); // 자손타입의 참조변수로 조상타입의 인스턴스 참조x
        // 참조변수 fe3가 사용할 수 있는 멤버 개수가 인스턴스 Car의 멤버개수보다 많아지므로 에러

        fe.water();
        car = fe; // (Car)fe, 업캐스팅(자손타입을 조상타입으로 변환), 형변환 생략가능
        // 참조변수 fe가 참조하고 있는 인스턴스를 참조변수 car가 참조하도록 함.
//        car.water(); Car타입의 참조변수로는 water()를 호출할 수 없음.

        fe2 = (FireEngine)car; // 다운캐스팅(조상타입을 자손타입으로 변환), 형변환 생략불가
        // 참조변수 car가 참조하고 있는 인스턴스를 참조변수 fe2가 참조하도록 함.
//        a = (FireEngine)fe;
        // FireEngine과 Ambulance는 Car의 자손이지만 둘은 서로 아무런 관계가 없음.
        fe2.water();

        Car car2 = new Car();
        FireEngine fe4 = null;
        car.drive();
        fe4 = (FireEngine)car2; // 컴파일o, 실행 시 에러 발생
        // 참조변수 car2가 참조하고 있는 인스턴스(조상)를 참조변수 fe4(자손)가 참조하도록 함
        // => 자손타입의 참조변수로 조상타입의 인스턴스로 참조x

    }
}