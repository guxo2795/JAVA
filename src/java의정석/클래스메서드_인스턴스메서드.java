package java의정석;

public class 클래스메서드_인스턴스메서드 {
    public static void main(String[] args) {
        MemberCall m1 = new MemberCall();
        m1.instanceMethod1();
        System.out.println();
        m1.instanceMethod2();
    }
}

class MemberCall {
    int iv = 10; // 인스턴스 변수
    static int cv = 20; // 클래스 변수

    int iv2 = cv;
//    static int cv2 = iv; // 에러. 클래스변수는 인스턴스변수를 사용할 수 없음.
    static int cv2 = new MemberCall().iv; // 객체를 생성해야 사용할 수 있음.

    // 클래스메서드 - 변수호출
    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv); // 에러. 클래스메서드에서는 인스턴스변수를 사용할 수 없음.
        MemberCall c = new MemberCall();
        System.out.println(c.iv); // 객체를 생성한 후 사용 가능
    }

    // 인스턴스메서드 - 변수호출
    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    // 클래스메서드 - 메서드호출
    static void staticMethod2() {
        staticMethod1();
//        intanceMethod1(); // 에러. 클래스메서드에서는 인스턴스메서드를 호출할 수 없음.
        MemberCall c =new MemberCall();
        c.instanceMethod1();
    }

    // 인스턴스메서드 - 메서드호출
    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }


}
