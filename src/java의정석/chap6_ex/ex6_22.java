package java의정석.chap6_ex;

public class ex6_22 {

    public static boolean isNumber(String str) {
        if(str == null || str.isEmpty()) {
            return false;
        }

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
