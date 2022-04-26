package software.sigma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
//    @Autowired
//    @Qualifier("classicalMusic")
//    private Music music;

    private Music classicalMusic;
    private Music rockMusic;

    private Music jazzMusic;

    public enum musicStyles {
        CLASSICAL, JAZZ, ROCK;

        private static final List<musicStyles> VALUES = Collections.unmodifiableList(Arrays.asList(values()));

        public static musicStyles randomMusicStyle()  {
            return VALUES.get(new Random().nextInt(VALUES.size()));
        }
    }

    public MusicPlayer() { }

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("jazzMusic") Music jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
    }

    public String playMusic(musicStyles style) {
        switch (style) {
            case CLASSICAL:
                return "Playing: \"" + classicalMusic.getSong() + "\", which style is " + style;
            case JAZZ:
                return "Playing: \"" + jazzMusic.getSong() + "\", which style is " + style;
            case ROCK:
                return "Playing: \"" + rockMusic.getSong() + "\", which style is " + style;
            default:
                return "Wrong parameter has passed";
        }
    }
}
