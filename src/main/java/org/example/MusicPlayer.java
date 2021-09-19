package org.example;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music)
    {
        this.music = music;
    }

    public void makeMusic() {
        System.out.println("Played: " + music.getSong());
    }
}
