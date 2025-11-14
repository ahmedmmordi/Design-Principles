package org.example.principles.H_DependencyInversionPrinciple.Solution.player;

import org.example.principles.H_DependencyInversionPrinciple.Solution.logging.Logger;
import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Song;
import org.example.principles.H_DependencyInversionPrinciple.Solution.source.AudioSource;

public class BasicAudioPlayer implements AudioPlayer {
    private final Logger logger;
    private AudioSource source;
    private Song currentSong;

    public BasicAudioPlayer(Logger logger, AudioSource source) {
        this.logger = logger;
        this.source = source;
        this.currentSong = null;
    }

    @Override
    public void setAudioSource(AudioSource source) {
        this.source = source;
        logger.log("Audio source set to: " + source.getClass().getSimpleName());
    }

    @Override
    public void play(String sourcePath) {
        if (source == null) {
            logger.log("Cannot play song. No audio source set.");
            return;
        }
        if (sourcePath == null) {
            logger.log("Cannot play song. The song source is NULL.");
            return;
        }
        Song song = source.loadSong(sourcePath);
        if (this.currentSong != null) {
            logger.log("Switching from '" + this.currentSong.getSongName() + "' to '" + song.getSongName() + "'");
            stop();
        }
        this.currentSong = song;
        logger.log("Started song: " + song.getSongName());
    }

    @Override
    public void pause() {
        if (this.currentSong == null) {
            logger.log("No song is currently playing to pause.");
            return;
        }
        logger.log("Paused song: " + this.currentSong.getSongName());
    }

    @Override
    public void stop() {
        if (this.currentSong == null) {
            logger.log("No song is currently playing to stop.");
            return;
        }
        logger.log("Stopped song: " + this.currentSong.getSongName());
        currentSong = null;
    }

    @Override
    public Song getCurrentSong() {
        if (currentSong == null) {
            logger.log("No song is currently playing.");
            return null;
        }
        return currentSong;
    }
}
