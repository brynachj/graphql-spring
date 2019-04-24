package com.brynachj.graphqlspring;

import com.brynachj.graphqlspring.song.Song;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Single extends Song {

    private Integer chartPosition;
}
