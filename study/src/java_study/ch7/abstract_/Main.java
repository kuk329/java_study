package java_study.ch7.abstract_;

public class Main {
    public static void main(String[] args) {
       // Player p = new Player(); // 불가능 (에러)
        Player p = new Player() {
            @Override
            void play(int pos) {
                System.out.println("연주 시작 "+pos+"분");
            }

            @Override
            void stop() {
                System.out.println("연주 종료");

            }
        };
        p.play(10);
        p.stop();
        AudioPlayer ap = new AudioPlayer();
        ap.play(20);
        ap.stop();
    }
}
