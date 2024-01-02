package programmers;

import java.util.ArrayList;
import java.util.Arrays;


public class 모의고사완전탐색 {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};

        int[][] su = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] cnt = new int[3];

        for(int i = 0; i < answers.length; i++) {
            if (su[0][i%5] == answers[i]) {
                cnt[0]++;
            }
            if (su[1][i%8] == answers[i]) {
                cnt[1]++;
            }
            if (su[2][i%10] == answers[i]) {
                cnt[2]++;
            }
        }

        int max = Arrays.stream(cnt).max().getAsInt();

        ArrayList<Integer> max_su = new ArrayList<Integer>();
        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] == max) {
                max_su.add(i+1);
            }
        }

        int[] answer = new int[max_su.size()];
        for(int i = 0; i < max_su.size(); i++) {
            answer[i] = max_su.get(i);
        }

    }
}
