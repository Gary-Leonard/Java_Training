package com.qa;


import com.qa.data.InMemoryDAO;
import com.qa.data.Song;
import com.qa.data.SongDAO;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Song song1 = new Song(1, "Frog Prince","Keane",261, LocalDate.of(2006,6,12));
        Song song2 = new Song(2, "Song2","Blur",122, LocalDate.of(1997,4,7));
        Song song3 = new Song(3, "Monkey Wrench","Foo Fighters",231, LocalDate.of(1997,4,28));


        Song[] data = new Song[] { song1, song2, song3 };
        SongDAO dao = new InMemoryDAO(data);

        for (Song song : dao.readAll()) {
            System.out.println(song);
        }
        System.out.println("SONG WITH ID 2: ");
        System.out.println(dao.readById(2));

        System.out.println("Saving new song");
        Song song4 = new Song(4, "Hells Bells", "ACDC", 300,
                LocalDate.now());
        dao.save(song4);

        System.out.println("READ ALL SONGS:");
        for (Song song : dao.readAll()) {
            System.out.println(song);
        }

    }
}
