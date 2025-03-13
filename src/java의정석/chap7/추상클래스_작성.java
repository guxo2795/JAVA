package java의정석.chap7;

abstract class Unit {
    int x,y;
    abstract void move(int x, int y);
    void stop() {}
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }
    void stimPack() {}
}

class Tank extends Unit{
    void move(int x, int y) {
        System.out.println("Tank[x=" + x + ",y" + y + "]");
    }

}

class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship[x" + ",y" + y + "]");
    }
}



public class 추상클래스_작성 {
    public static void main(String[] args) {
//        Unit[] group = { new Marine(), new Tank(), new Dropship() };
        Unit[] group = new Unit[3];
//        Object[] group2 = new Object[3]; // 에러
        // Object 리모컨에는 move버튼이 없음!

        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new Dropship();

        group[0].move(100, 200); // Marine객체의 move
        group[1].move(100, 200); // Tank객체의 move
        group[2].move(100, 200); // Dropship객체의 move
    }

}
