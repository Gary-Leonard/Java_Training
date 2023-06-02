package com.qa;


import com.qa.data.Song;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Song song1 = new Song(1, "Frog Prince","Keane",261, LocalDate.of(2006,6,12));
        Song song2 = new Song(2, "Song2","Blur",122, LocalDate.of(1997,6,8));
        Song song3 = new Song(3, "Monkey Wrench","Foo Fighters",231, LocalDate.of(1997,4,12));

        System.out.println(song1);
        System.out.println(song2);
        System.out.println(song3);


    }
}
