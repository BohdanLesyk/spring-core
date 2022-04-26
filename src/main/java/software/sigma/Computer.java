package software.sigma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int ID;
    private MusicPlayer musicPlayer;

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
                ", " + musicPlayer.playMusic() +
                '}';
    }
}
