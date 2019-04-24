package com.brynachj.graphqlspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Song {

    private Long id;
    private String name;
    private Artist artist;
    private Genre genre;
}
