package software.sigma;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.LinkedList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
//            Music music = context.getBean("rockMusicBean", RockMusic.class);  OR
            Music rockMusic = context.getBean("rockMusic", Music.class);
            Music classicalMusic = context.getBean("classicalMusic", Music.class);
            Music jazzMusic = context.getBean("jazzMusic", Music.class);

            List<Music> musicList = new LinkedList<>();
            musicList.add(rockMusic);
            musicList.add(classicalMusic);
            musicList.add(jazzMusic);

            MusicPlayer musicPlayer = new MusicPlayer();
            musicPlayer.setMusicList(musicList);

            musicPlayer.playMusic();
        }
    }
}
