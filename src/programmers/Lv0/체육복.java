package programmers.Lv0;

public class 체육복 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};

        // 도난을 당하지 않은 학생 수
        int answer = n - lost.length;

        // 여벌 체육복이 있으면 빌려줄 수 있음
        // 근데 여벌 체육복을 들고 온 학생도 도난은 당할 수 있음(하나만)

        // 여벌 체육복을 들고온 학생(reserve)이 도난(lost)을 당한 경우
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    // 도난을 당했지만 여벌 체육복이 있음
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        // 여벌 체육복을 들고온 학생이 도난을 당한 학생에게 빌려주는 경우
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                // 도난을 당한 학생의 번호 좌우만 빌려줄 수 있음 ex) 2번 학생 도난, 1번 3번 학생이 여유가 있을 경우
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
