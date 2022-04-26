package software.sigma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.LinkedList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList = new LinkedList<>();

//    @Autowired
    private Music music;

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private JazzMusic jazzMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, JazzMusic jazzMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.jazzMusic = jazzMusic;
    }

    private String name;
    private int volume;

    public MusicPlayer() {

    }

//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public void playMusic(List<Music> musicList) {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

//    public void playMusic() {
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
//        System.out.println("Playing: " + jazzMusic.getSong());
//    }

//    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
//    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong();
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
