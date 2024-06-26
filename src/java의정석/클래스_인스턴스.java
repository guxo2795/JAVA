package java의정석;

class Tv {
    // Tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    // Tv의 기능(메서드)
    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

public class 클래스_인스턴스 {
    public static void main(String[] args) {
        Tv t1 = new Tv(); // Tv인스턴스 생성
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t1.channel = 1;
        t2.channel = 2;

        System.out.println();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t2 = t1;
        // t1, t2는 참조변수이므로 인스턴스의 주소를 저장하고 있음.
        // t2가 가지고 있던 주소 값은 잃어버리게 되고, t1과 같은 인스턴스를 가리키게 된다.

        t1.channel = 7;

        System.out.println();
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

    }

}
