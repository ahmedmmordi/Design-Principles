package org.example.principles.H_DependencyInversionPrinciple.Solution.source;

import org.example.principles.H_DependencyInversionPrinciple.Solution.logging.Logger;
import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Playlist;
import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Song;

public class StreamAudioSource implements AudioSource {
    private final Logger logger;

    public StreamAudioSource(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Song loadSong(String sourcePath) {
        // We just simulate
        Song song = new Song("English Song", "Flex", sourcePath);
        logger.log("Streaming song '" + song.getSongName() + "' from " + sourcePath);
        return song;
    }

    @Override
    public Playlist loadPlaylist(String sourcePath) {
        // We just simulate
        Playlist playlist = new Playlist("Mixes", sourcePath);
        logger.log("Streaming playlist '" + playlist.getPlaylistName() + "' from " + sourcePath);
        playlist.addSong(new Song("German Song", "Kimmich", sourcePath + "/german_song_stream"));
        playlist.addSong(new Song("English Song", "Oliver", sourcePath + "/english_song_stream"));
        playlist.addSong(new Song("French Song", "Louis", sourcePath + "/french_song_stream"));
        return playlist;
    }
}
