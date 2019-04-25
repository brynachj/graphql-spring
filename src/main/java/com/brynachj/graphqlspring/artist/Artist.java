package com.brynachj.graphqlspring.artist;

import com.brynachj.graphqlspring.song.Song;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="artists")
public class Artist {

    @Id
    private Long id;
    private String name;
//    private List<Album> albums;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "artist", cascade = CascadeType.ALL)
    private List<Song> singles;
}
