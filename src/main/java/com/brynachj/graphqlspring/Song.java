package com.brynachj.graphqlspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="songs")
public class Song {

    @Id
    private Long id;
    private String name;
    @ManyToOne(optional = false)
    private Artist artist;
//    private Genre genre;
}
