package software.sigma;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@Scope("prototype")
public class RockMusic implements Music {
    private final List<String> songList;

    public RockMusic(List<String> songList) {
        this.songList = songList;

        songList.add("Have you ever seen the rain?");
        songList.add("Hotel California");
        songList.add("Simple man");
    }

    @Override
    public String getSong() {
        return songList.get(new Random().nextInt(songList.size()));
    }

    @Override
    public String toString() {
        return "RockMusic{" +
                "songList=" + songList +
                '}';
    }
}
