package java의정석.chap7;

abstract class Player { // 추상 클래스 = 미완성 클래스
    abstract void play(int pos); // 추상 메서드 = 미완성 메서드
    abstract void stop(); // 추상 메서드 = 선언부만 있고 구현부{}가 없는 메서드
}

// 추상 클래스는상속을 통해 완성해야 객체 생성가능
class AudioPlayer extends Player {
    @Override
    void play(int pos) {
        System.out.println(pos + "위치부터 play합니다.");
    }

    @Override
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}

public class 추상클래스 {
    public static void main(String[] args) {
//        Player p = new Player(); // 추상 클래스의 객체 생성 -> 에러
        AudioPlayer ap = new AudioPlayer(); // 가능
        Player ap2 = new AudioPlayer(); // 다형성
        // 선언부는 리모컨임,

        ap.play(100);
        ap.stop();
        ap2.play(200);
        ap.stop();
    }

}
