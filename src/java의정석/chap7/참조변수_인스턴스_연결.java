package java의정석.chap7;

public class 참조변수_인스턴스_연결 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();
        System.out.println("c.x = " + c.x);
        c.method();
        // 멤버변수가 조상클래스와 자식클래스에 중복으로 정의된 경우
        // 1. 멤버변수는 참조변수의 타입에 따라 달라진다.
        // 2. 메서드는 참조변수의 타입에 관계없이 실제 인스턴스의 타입에 따른다.
    }
}

class Parent {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    int x = 200;

    void method() {
        System.out.println("Child Method");
        System.out.println("x=" + x);
        System.out.println("super.x=" + super.x);
        System.out.println("this.x=" + this.x);
        // x와 this.x는 Child클래스의 인스턴스 변수 x를 뜻한다.
    }
}