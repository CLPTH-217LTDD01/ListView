package com.example.quocc.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvSong = (ListView) findViewById(R.id.lvSong);
        ArrayList<Song> alSong = new ArrayList<>();

        Song song1 = new Song(R.drawable.so_far_away, "So Far Away", "Martin Garix, David Guetta, Jamie Scott, Romy Dya", 12999, 6499, 23);
        Song song2 = new Song(R.drawable.the_river, "The River", "Axel Johansson", 9639, 4819, 17);
        Song song3 = new Song(R.drawable.all_falls_down, "All Falls Down", "Axel Johansson", 18438, 9219, 17);
        Song song4 = new Song(R.drawable.panama, "Panama", "Matteo", 7752, 3876, 12);
        Song song5 = new Song(R.drawable.wolves, "Wolves", "Selena Gomez, Marshmello", 13380, 6690, 12);
        Song song6 = new Song(R.drawable.the_spectre, "The Spectre", "Alan Walker", 66146, 33073, 12);
        Song song7 = new Song(R.drawable.how_long, "How Long", "Charlie Puth", 28419, 14209, 12);
        Song song8 = new Song(R.drawable.for_you, "For You", "Liam Payne, Rita Ora", 9753, 4876, 12);
        Song song9 = new Song(R.drawable.real_friends, "Real Friends", "Camila Cabello", 5432, 2543, 12);
        Song song10 = new Song(R.drawable.the_middle, "The Middle", "Zedd, Maren Morris, Grey", 562, 231, 12);

        alSong.add(song1);
        alSong.add(song2);
        alSong.add(song3);
        alSong.add(song4);
        alSong.add(song5);
        alSong.add(song6);
        alSong.add(song7);
        alSong.add(song8);
        alSong.add(song9);
        alSong.add(song10);
        SongAdapter songAdapter = new SongAdapter(this, R.layout.row_song, alSong);
        lvSong.setAdapter(songAdapter);
    }
}
