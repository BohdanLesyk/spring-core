package software.sigma;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class)) {
            MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

            System.out.println(musicPlayer.getName());
            System.out.println(musicPlayer.getVolume());

            ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
            ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

            System.out.println(classicalMusic1 == classicalMusic2);
        }
    }
}
