package com.brynachj.graphqlspring;

public enum Genre {

    ROCK("rock"),
    HIP_HOP("hip-hop"),
    JAZZ("jazz"),
    CLASSICAL("classical"),
    POP("pop"),
    ROCK_N_ROLL("rock'n'roll"),
    MOTOWN("motown"),
    COUNTRY("country"),
    FOLK("folk"),
    MUSICAL_THEATRE("musical theatre"),
    EDM("EDM"),
    DISCO("disco"),
    REGGAE("reggae"),
    NEO_SOUL("neo-soul"),
    NEW_WAVE("new wave"),
    NORTHERN_SOUL("northern soul"),
    FUNK("funk"),
    PUNK("punk"),
    PROG_ROCK("prog-rock"),
    BOSSA_NOVA("bossa-nova"),
    OST("original sound-track"),
    SAMBA("samba"),
    GRUNGE("grunge");

    private final String value;

    Genre(String value) {
        this.value = value;
    }
}
