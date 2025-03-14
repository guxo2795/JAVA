package java의정석.chap7;

abstract class Unit2 {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface Fightable {
    public abstract void move(int x, int y);
    void attack(Fightable f); // public abstract 생략
}

class Fighter extends Unit2 implements Fightable {

    // 오버라이딩 규칙 : 조상보다 접근제어자가 좁으면 안된다.
    // 인터페이스의 메서드는 예외없이 public abstract (생략가능)
    // 인터페이스의 상수는 예외없이 public static final (생략가능)
    public void move(int x, int y) {
        System.out.println("["+x+","+y+"]로 이동");
    }

    // 매개변수타입이 인터페이스
    // Fightable 인터페이스를 구현한 클래스의 인스턴스만 가능하다는 뜻.
    // 인터페이스를 구현한다 = implements
    public void attack(Fightable f) {
        System.out.println(f+"를 공격");
    }

    // 반환타입이 인터페이스
    // Fightable 인터페이스를 구현한 클래스(Fighter클래스)의 인스턴스를 반환한다는 뜻.
    Fightable getFightable() {
//        Fighter f = new Fighter();
//        return (Fightable) f;
        Fightable f = (Fightable)new Fighter();
        return f;
    }
}

public class 인터페이스 {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        Fightable f2 = f.getFightable();

        Unit2 u = new Fighter();
        u.move(100,200);
//        u.attack(new Fighter()); // Unit2에는 attack()메서드가 없어서 호출 불가
        u.stop();

        Fightable f3 = new Fighter();
        f3.move(100,200);
        f3.attack(new Fighter());
//        f.stop(); // Fightable에는 stop()메서드가 없어서 호출 불가
    }
}
