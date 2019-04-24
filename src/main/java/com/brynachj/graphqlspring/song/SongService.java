package com.brynachj.graphqlspring.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService {

    @Autowired
    SongRepository songRepository;

    public Iterable<Song> getSongs() {
        return songRepository.findAll();
    }
}
