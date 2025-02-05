package 백준.단계별.단계13_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 나이순정렬_클래스객체 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Person[] p = new Person[N];

        for(int i = 0 ; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            p[i] = new Person(age, name);
        }

        Arrays.sort(p, (p1, p2) -> p1.age - p2.age);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            // 객체배열의 객체를 출력하면 해당 인덱스의 객체의 toString() 이 출력 됨
            sb.append(p[i]);
        }
        System.out.println(sb);
    }

    public static class Person {
        int age;
        String name;

        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + '\n';
        }
    }
}
