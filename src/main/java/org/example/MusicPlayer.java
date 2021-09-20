package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MusicPlayer {


    private Music music1;
    private Music music2;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
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
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicMusic") Music music2)
    {
        this.music1 = music1;
        this.music2 = music2;
    }

    public MusicPlayer() {}
//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String makeMusic() {
        System.out.println("Played: " + music1.getSong());
        System.out.println("Played: " + music2.getSong());
        return "Played: " + music1.getSong();
    }
}
