package 백준.단계별.단계6_심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 너의평점은 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalScore = 0.0;
        double weightSum = 0.0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            switch (grade){
                case "A+" :
                    totalScore += score;
                    weightSum += score*4.5;
                    break;
                case "A0" :
                    totalScore += score;
                    weightSum += score*4.0;
                    break;
                case "B+" :
                    totalScore += score;
                    weightSum += score*3.5;
                    break;
                case "B0" :
                    totalScore += score;
                    weightSum += score*3.0;
                    break;
                case "C+" :
                    totalScore += score;
                    weightSum += score*2.5;
                    break;
                case "C0" :
                    totalScore += score;
                    weightSum += score*2.0;
                    break;
                case "D+" :
                    totalScore += score;
                    weightSum += score*1.5;
                    break;
                case "D0" :
                    totalScore += score;
                    weightSum += score;
                    break;
                case "F" :
                    totalScore += score;
                    break;
                case "P" :
                    break;
            }
        }

        if(totalScore > 0) {
            double avg = weightSum / totalScore;
            System.out.printf("%.6f\n", avg);
        }


    }
}
