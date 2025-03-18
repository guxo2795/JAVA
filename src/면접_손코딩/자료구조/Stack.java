package 면접_손코딩.자료구조;

// FILO : 먼저 들어간 데이터가 가장 나중에 나오는 선입후출 선형 자료구조.
// 배열/연결리스트를 이용해서 구현 가능

public class Stack {
    int[] array;
    private int top;
    private int size;

    public Stack(int length) {
        this.array = new int[length];
        this.top = -1;
        this.size = length;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == size-1;
    }

    public void push(int data) {
        if(isFull()) {
            System.out.println("stack is full");
            return;
        }
        array[++top] = data;
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        return array[top--];
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        return array[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
