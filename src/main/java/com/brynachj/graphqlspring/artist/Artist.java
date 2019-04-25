package com.brynachj.graphqlspring.artist;

import com.brynachj.graphqlspring.song.Song;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    @OneToMany
    private List<Song> singles;
}
