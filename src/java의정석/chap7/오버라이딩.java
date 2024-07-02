package java의정석.chap7;

public class 오버라이딩 {
    public static void main(String[] args) {
        PointTest p = new PointTest();
        Point3D p3 = new Point3D(1,2,3);

        System.out.println(p.getLocation());
        System.out.println(p3.getLocation());
    }
}

class PointTest {
    int x = 10;
    int y = 20;

    PointTest() {}

    PointTest(int x, int y) {
        // super();
        // 생성자 첫 줄에서 다른 생성자를 호출하지 않았음. ex) PointTest();
        // 자동으로 super(); 삽입 -> Object();
        this.x = x;
        this.y = y;
    }

    protected String getLocation() {
        return "x :" + x + ", y :" + y;
    }
}

class Point3D extends PointTest{
    int z = 30;

    Point3D() {
        this(100,200,300);
    }

    Point3D(int x, int y, int z) {
        super(x,y); // 부모의 생성자인 PointTest(int x, int y) 호출
        this.z = z;
    }

    // 부모의 getLocation()을 오버라이딩 (덮어씀)
    protected String getLocation() {
        return super.getLocation() + ", z : " + this.z;
    }
}