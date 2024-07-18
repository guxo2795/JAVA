package java의정석.chap7;

public class Instanceof {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        // 참조변수 instanceof 타입
        // 어떤 타입에 대한 instanceof연산의 결과가 true라는 것은 검사한 타입으로 형변환이 가능하다는 뜻.

        if(fe instanceof FireEngine) {
            System.out.println("This is a FireEngine instance.");
        }
        if(fe instanceof Car) {
            System.out.println("This is a Car instance");
        }
        if(fe instanceof Object) {
            System.out.println("This is an Object instance");
        }
        System.out.println(fe.getClass().getName());

        // FireEngine 클래스는 Object클래스와 Car클래스의 자손 클래스이므로 조상의 멤버들을 상속받았기 때문에,
        // FireEngine인스턴스는 Object인스턴스와 Car인스턴스를 포함하고 있는 셈.
    }
}
