package com.brynachj.graphqlspring;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private ArtistService artistService;

    public List<Artist> getArtists() {
        return artistService.getAllArtists();
    }
}
