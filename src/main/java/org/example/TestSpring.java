package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        RockMusic rockMusic = context.getBean("MusicBean", RockMusic.class);
        System.out.println(rockMusic.getSong());
//        rockMusic.getSong();
//        MusicPlayer musicPlayer = context.getBean("MusicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer1 = context.getBean("MusicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.getName());
//        musicPlayer.makeMusic();
//        musicPlayer1.setVolume(3);
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(musicPlayer1.getVolume());
        context.close();
    }
}
