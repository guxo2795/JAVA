package java의정석;

class Data {
    int x;
}

public class 기본형매개변수_참조형매개변수 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);
        System.out.println();

        // 기본형 매개변수(read only)
        primitive_Change(d.x);
        System.out.println("After primitive_Change(d.x)");
        System.out.println("main() : x = " + d.x);
        System.out.println();

        // 참조형 매개변수(read & write)
        reference_Change(d);
        System.out.println("After primitive_Change(d.x)");
        System.out.println("main() : x = " + d.x);
        System.out.println();

        // 배열 또한 참조변수를 통해 데이터가 저장된 공간에 접근하기 때문에 변경 가능
        int[] arr = {10};
        System.out.println("main() : arr = " + arr[0]);
        arr_Change(arr);
        System.out.println("After arr_Change(arr)");
        System.out.println("main() : arr = " + arr[0]);
        System.out.println();

        // 반환타입이 참조형
        Data d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static void primitive_Change(int x) {
        x = 1000;
        System.out.println("change() : x = " + x);
    }

    static void reference_Change(Data d) {
        d.x = 1000;
        System.out.println("reference_Change() : x = " + d.x);
    }

    static void arr_Change(int[] arr) {
        arr[0] = 1000;
        System.out.println("arr_Change() : arr = " + arr[0]);
    }

    static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp;
    }
}
