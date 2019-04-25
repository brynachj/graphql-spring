package com.brynachj.graphqlspring;

import com.brynachj.graphqlspring.song.Song;
import com.brynachj.graphqlspring.song.SongService;
import com.brynachj.graphqlspring.artist.Artist;
import com.brynachj.graphqlspring.artist.ArtistService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

    public Iterable<Song> getArtistSingles(Long artistId) {
        Iterable<Song> songsByArtist = songService.getSongsByArtist(artistId);
        return StreamSupport.stream(songsByArtist.spliterator(), false)
                .filter(Song::isSingle).collect(Collectors.toList());
    }
}
