package com.brynachj.graphqlspring;

import com.brynachj.graphqlspring.song.Song;
import com.brynachj.graphqlspring.artist.Artist;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Album {

    private String id;
    private String title;
    private Artist artist;
    private List<Song> songs;
}
