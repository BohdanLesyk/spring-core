package software.sigma;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

            System.out.println("Music player name is \"" + musicPlayer.getName() + "\"");
            System.out.println("Music player volume is \"" + musicPlayer.getVolume() + "\"");

            musicPlayer.playMusic();
        }
    }
}
