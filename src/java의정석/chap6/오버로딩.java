package java의정석.chap6;

public class 오버로딩 {
    public static void main(String[] args) {
        Mymath3 mm = new Mymath3();
        System.out.println("mm.add(3, 3) 결과: "+ mm.add(3,3));
        System.out.println("mm.add(3L, 3) 결과: "+ mm.add(3L,3));
        System.out.println("mm.add(3, 3L) 결과: "+ mm.add(3,3L));
        System.out.println("mm.add(3L, 3L) 결과: "+ mm.add(3L,3L));

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과: " + mm.add(a));
        System.out.println();


        String[] strArr = { "100" , "200" , "300"};
        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
        System.out.println("["+concatenate(",", new String[0]) +"]");
        System.out.println("["+concatenate(",")+"]");
    }

    static String concatenate(String delim, String... args) {
        String result = "";

        for(String str : args) {
            result += str + delim;
        }
        return result;
    }
}

class Mymath3 {
    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a+b;
    }
    long add(int a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a+b;
    }
    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a+b;
    }
    long add(long a, long b) {
        System.out.print("long add(long a, long b) - ");
        return a+b;
    }

    int add(int[] a) {
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for(int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

}
