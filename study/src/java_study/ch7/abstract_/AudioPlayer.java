package java_study.ch7.abstract_;

public class AudioPlayer extends Player{

    @Override
    void play(int pos) {
        System.out.println("audioPlayer start : "+pos+"m");

    }

    @Override
    void stop() {
        System.out.println("audioPlayer stop");

    }
}
