package com.brynachj.graphqlspring;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private ArtistService artistService;

    @Autowired
    private SongService songService;

    public Iterable<Artist> getArtists() {
        return artistService.getAllArtists();
    }

    public Iterable<Song> getSongs() {
        return songService.getSongs();
    }
}
