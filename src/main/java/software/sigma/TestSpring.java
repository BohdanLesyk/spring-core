package software.sigma;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Music music = context.getBean("musicBean", Music.class);
            MusicPlayer musicPlayer = new MusicPlayer(music);

            musicPlayer.playMusic();
        }
    }
}
