package software.sigma;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
//            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//            musicPlayer.playMusic();

            Computer computer = context.getBean("computer", Computer.class);
            System.out.println(computer);
        }
    }
}
