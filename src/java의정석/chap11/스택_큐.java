package java의정석.chap11;

// Stack = LIFO(Last In First Out)
// push = 저장, pop = 추출
// 배열을 사용하는게 합리적
// 스택은 인데스가 위에서부터 1로 시작
// 스택은 클래스가 있어서 Stack st = new Stack(); 가능 (객체 생성 o)

// Queue = FIFO(First In First Out)
// offer = 저장, poll = 추출
// LinkedList를 사용하는게 합리적
// Queue = 인터페이스 => 객체 생성x
// => 1. Queue를 직접 구현
// or 2. Queue를 구현한 클래스를 사용 ****
// Queue q = new LinkedList();

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 스택_큐 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack =");
        while(!st.isEmpty()) { // 비어있으면 true 반환
            System.out.println(st.pop());
        }
        System.out.println("= Queue = ");
        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
