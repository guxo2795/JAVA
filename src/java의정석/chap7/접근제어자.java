package java의정석.chap7;

public class 접근제어자 {
    public static void main(String[] args) {
        Time t = new Time(12,35,30);
        System.out.println(t); // t.toString()과 같음
//        t.hour = 13;
        // hour은 private이므로 접근불가
        // 메서드를 통해서 접근해야함.
        t.setHour(25);
        System.out.println(t);
        t.setHour(t.getHour()+1);
        System.out.println(t);
    }
}

class Time {
    // 접근제어자를 private으로 함으로써 외부에서 직접적으로 접근하지 못하게 함.
    private int hour, minute, second;

    Time(int hour, int minute, int second) {
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // getter, setter
    public int getHour() { return hour; }
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }

    public int getMinute() { return minute; }
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }
    public int getSecond() { return second; }
    public void setSecond(int second) {
        if (second < 0 || second > 59) return;
        this.second = second;
    }

    public String toString() {
        return hour+":"+minute+":"+second;
    }
}

// class앞에 final을 붙이는 이유
// 자손클래스의 인스턴스를 생성할 때 조상클래스의 생성자를 호출해야만 함.
// => 생성자가 private인 클래스는 자손클래스에서 호출 할 수 없음.
// 다른 클래스의 조상이 될 수 없음 = 상속할 수 없는 클래스임을 알리기 위해서
final class Singleton {

    // 생성자에 접근제어자를 사용함으로써 인스턴스의 생성을 제한할 수 있음.
    // getInstance()에서 사용될 수 있도록, 인스턴스가 미리 생성되어야 하므로 static
    private static Singleton s = new Singleton();
    private Singleton() {}

    // 외부에서 사용할 수 있도록 pulbic
    // 인스턴스를 생성하지 않고도 호출할 수 있어야 하므로 static
    public static Singleton getInstance() {
        if(s == null) {
            s = new Singleton();
        }
        return s;
    }
}

// abstract = 미완성
abstract class AbstractTest { // 추상클래스(추상 메서드를 포함한 클래스)
    abstract void move(); // 추상메서드(구현부x)
}

