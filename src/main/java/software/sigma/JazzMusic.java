package software.sigma;

import org.springframework.stereotype.Component;

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

    @Override
    public String toString() {
        return "JazzMusic{" +
                "songList=" + songList +
                '}';
    }
}
