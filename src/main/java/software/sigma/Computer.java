package software.sigma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import software.sigma.MusicPlayer.musicStyles;

@Component
public class Computer {
    private final int ID;
    private final MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.ID = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ID=" + ID +
                ", musicPlayer=" + musicPlayer +
                ", " + musicPlayer.playMusic(musicStyles.randomMusicStyle()) +
                '}';
    }
}
