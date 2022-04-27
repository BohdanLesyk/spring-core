package software.sigma;

import org.springframework.beans.factory.annotation.Value;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private Music classicalMusic;
    private Music rockMusic;
    private Music jazzMusic;

    public MusicPlayer(Music classicalMusic, Music rockMusic, Music jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }


    public String playMusic() {
        StringBuilder builder = new StringBuilder("Playing: " + classicalMusic.getSong());
        builder.append(", " + rockMusic.getSong());
        builder.append(", " + jazzMusic.getSong() + "!");

        return builder.toString();
    }
}