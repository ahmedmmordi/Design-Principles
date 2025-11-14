package org.example.principles.H_DependencyInversionPrinciple.Solution.source;

import org.example.principles.H_DependencyInversionPrinciple.Solution.logging.Logger;
import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Playlist;
import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Song;

public class FileAudioSource implements AudioSource {
    private final Logger logger;

    public FileAudioSource(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Song loadSong(String sourcePath) {
        // We just simulate
        Song song = new Song("Arabic Song", "Ahmed", sourcePath);
        logger.log("Loading song '" + song.getSongName() + "' from " + sourcePath);
        return song;
    }

    @Override
    public Playlist loadPlaylist(String sourcePath) {
        // We just simulate
        Playlist playlist = new Playlist("CS", sourcePath);
        logger.log("Loading playlist '" + playlist.getPlaylistName() + "' from " + sourcePath);
        playlist.addSong(new Song("Lecture 1", "Kimmich", sourcePath + "/lecture1.mp3"));
        playlist.addSong(new Song("Lecture 2", "Oliver", sourcePath + "/lecture2.mp3"));
        playlist.addSong(new Song("Lecture 3", "Louis", sourcePath + "/lecture3.mp3"));
        return playlist;
    }
}
