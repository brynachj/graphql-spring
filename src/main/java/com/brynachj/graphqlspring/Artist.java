package com.brynachj.graphqlspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artist{

    private String id;
    private String title;
    private List<Album> albums;
    private List<Single> singles;
}
