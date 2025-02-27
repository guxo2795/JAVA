package java의정석.chap6_ex;

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x, int y) {
        return Math.sqrt((x-this.x)*(x-this.x) + (y-this.y)*(y-this.y));
    }
}

public class ex6_6 {
    static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt(Math.pow(x1-x, 2) + Math.pow(y1-y, 2));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));

        MyPoint p = new MyPoint(1,1);
        System.out.println(p.getDistance(2,2));
    }
}
