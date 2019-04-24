package com.brynachj.graphqlspring.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    public Iterable<Artist> getAllArtists() {
        return artistRepository.findAll();
    }
}
