package java의정석.chap6;

class BlockTest {
    // 2. 초기화 블럭
    // 모든 생성자에서 공통으로 수행돼야 하는 코드를 넣는데 사용

    // 클래스 초기화 블럭
    // 클래스가 메모리에 처음 로딩될 때 '한번'만 수행
    static {
        System.out.println("static { }");
    }

    // 인스턴스 초기화 블럭
    // 인스턴스 생성마다 수행
    {
        System.out.println("{ }");
    }

    public BlockTest() {
        System.out.println("생성자");
    }

}

class Product {
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }
}

public class 변수의_초기화 {
    public static void main(String[] args) {
        // 1. 명시적 초기화
        // 변수 선언과 동시에 초기화
        int door = 4;
        Car c = new Car();

        System.out.println("BlockTest bt = new BlockTest();");
        BlockTest bt = new BlockTest();

        System.out.println("BlockTest bt2 = new BlockTest();");
        BlockTest bt2 = new BlockTest();

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
        System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
        System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
        System.out.println("생성된 제품의 수 : " + Product.count);
    }
}
