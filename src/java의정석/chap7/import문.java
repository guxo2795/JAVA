package java의정석.chap7;

// import java.lang.*;
// java.lang패키지(System, String)는 매우 빈번히 사용하므로 모든 소스파일에 묵시적으로 선언되어있음.

import java.text.SimpleDateFormat;
import java.util.Date;

// static import문을 사용하면 클래스 이름을 생략할 수 있음.
import static java.lang.Math.*;
import static java.lang.System.out;

public class import문 {
    public static void main(String[] args) {
//        java.util.Date today = new java.util.Date();
        // java.util.Date를 import하지않으면 패키지명까지 써야 클래스를 사용할 수 있다.

        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");

        System.out.println("오늘 날짜는 " + date.format(today));
        System.out.println("현재 시간은 " + time.format(today));

        // System.out.println(Math.random());
        out.println(random());
    }
}
