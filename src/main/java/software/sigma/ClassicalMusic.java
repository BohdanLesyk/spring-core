package software.sigma;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
    private final List<String> songList;

    public ClassicalMusic(List<String> songList) {
        this.songList = songList;

        songList.add("MOZART - Eine Kleine Nachtmusik, K. 525: I. Allegro");
        songList.add("VIVALDI - The Four Seasons, Concerto No. 1 \"Spring\": I. Allegro");
        songList.add("LISZT - Consolations, S. 172: No. 3, Lento placido");
    }

    @Override
    public String getSong() {
        return songList.get(new Random().nextInt(songList.size()));
    }

    @Override
    public String toString() {
        return "ClassicalMusic{" +
                "songList=" + songList +
                '}';
    }
}
