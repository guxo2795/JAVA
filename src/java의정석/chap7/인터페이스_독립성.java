package java의정석.chap7;

class A {
    // A가 B에 의존
    // C를 사용하려면 클래스A도 수정해야하고 main도 수정해야함.
    // => interface를 이용해서 껍데기와 알맹이를 분리 => 독립적인 프로그래밍.

//    public void method(B b) {
//        b.method();
//    }

    public void method(I i) { // 인터페이스 I를 구현한 놈들만 들어와.
        i.method();
    }
}

interface I {
    public abstract void method();
}

class B implements I {
    public void method() {
        System.out.println("B클래스의 메서드");
    }
}

class C implements I {
    public void method() {
        System.out.println("C클래스의 메서드");
    }
}


public class 인터페이스_독립성 {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B());
        a.method(new C());
    }
}
