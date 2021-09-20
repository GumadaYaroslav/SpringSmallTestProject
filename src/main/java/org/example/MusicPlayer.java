package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MusicPlayer {


    private ClassicMusic classicMusic;
    private RockMusic rockMusic;
    private String name;
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public MusicPlayer(ClassicMusic music, RockMusic rockMusic)
    {
        this.classicMusic = music;
        this.rockMusic = rockMusic;
    }

    public MusicPlayer() {}
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String makeMusic() {
        System.out.println("Played: " + classicMusic.getSong());
        System.out.println("Played: " + rockMusic.getSong());
        return "Played: " + rockMusic.getSong();
    }
}
