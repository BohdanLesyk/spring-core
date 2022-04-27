package software.sigma;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.List;
import java.util.Random;

@Component
public class JazzMusic implements Music {
    private final List<String> songList;

    public JazzMusic(List<String> songList) {
        this.songList = songList;

        songList.add("Miles Davis - So What");
        songList.add("Ella Fitzgerald & Duke Ellington: Take The A Train");
        songList.add("Louis Armstrong - What A Wonderful World");
    }

    @Override
    public String getSong() {
        return songList.get(new Random().nextInt(songList.size()));
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization!");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction!");
    }

    @Override
    public String toString() {
        return "JazzMusic{" +
                "songList=" + songList +
                '}';
    }
}
