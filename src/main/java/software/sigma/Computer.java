package software.sigma;

public class Computer {
    private final int ID;
    private final MusicPlayer musicPlayer;

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
