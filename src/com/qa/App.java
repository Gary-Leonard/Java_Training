package com.qa;


import com.qa.data.Song;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class App {

    public static void main(String[] args) {

        Song song1 = new Song(1, "Frog Prince","Keane",300, LocalDateTime.of(2006,6,12,0,0,0));
        Song song2 = new Song(2, "Song2","Blur",352, LocalDateTime.of(1997,6,8,0,0,0));
        Song song3 = new Song(3, "Monkey Wrench","Foo Fighters",280, LocalDateTime.of(1997,4,12,0,0,0));

        System.out.println(song1);
        System.out.println(song2);
        System.out.println(song3);


    }


}
