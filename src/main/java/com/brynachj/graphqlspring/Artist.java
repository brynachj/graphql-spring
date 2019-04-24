package com.brynachj.graphqlspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="artists")
public class Artist{

    @Id
    private String id;
    private String name;
//    private List<Album> albums;
//    private List<Single> singles;
}
