package java의정석.chap7;

public class 상속_포함 {
    public static void main(String[] args) {
        Point[] p = { new Point(100, 100),
            new Point(140,50),
            new Point(200,100)};

        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150, 150), 50);
        // Point p = new Point(150, 150);
        // Circle c = new Circle(p, 50);

        t.draw();
        c.draw();
    }
}

class Shape {
    String color = "black";
    void draw() {
        System.out.printf("[color=%s]%n", color);
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(0,0);
    }

    String getXY() {
        return "("+x+","+y+")";
    }
}

// 원은 도형이다 (o) ~은 ~이다. (is-a) => 상속관계
// 원은 점이다 (x) -> 원은 점을 가지고 있다. (o) -> ~은 ~을 가지고 있다. (has-a) => 포함관계
// 포함관계는 다른 클래스를 멤버변수로 선언하여 포함시키는 것.
// => 다른클래스(Point)를 Circle의 멤버변수로 선언하여 포함.
class Circle extends Shape {
    Point center;
    int r;

    Circle() {
        this(new Point(0, 0), 100);
    }

    Circle(Point p, int r) {
        this.center = p;
        this.r = r;
    }

    // 오버라이딩
    void draw() {
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }
}

// 삼각형은 도형이다. (o) => 상속관계
// 삼각형은 점을 가지고 있다. (o) => 포함관계
class Triangle extends Shape {
    Point[] p = new Point[3]; // 삼각형의 세 꼭짓점

    Triangle(Point[] p) {
        this.p = p;
    }

    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",
                p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }

}
