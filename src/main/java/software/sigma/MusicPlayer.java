package software.sigma;

import java.util.LinkedList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new LinkedList<>();

    private String name;
    private int volume;

    public MusicPlayer() {

    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
