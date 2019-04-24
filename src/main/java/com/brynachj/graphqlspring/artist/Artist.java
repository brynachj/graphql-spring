package com.brynachj.graphqlspring.artist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="artists")
public class Artist{

    @Id
    private Long id;
    private String name;
//    private List<Album> albums;
//    private List<Single> singles;
}
