package software.sigma;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            ClassicalMusic classicalMusic = context.getBean("classicalMusicBean", ClassicalMusic.class);

            System.out.println(classicalMusic.getSong());
        }
    }
}
