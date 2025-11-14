package org.example.principles.H_DependencyInversionPrinciple.Solution.manager;

import org.example.principles.H_DependencyInversionPrinciple.Solution.adjustment.Adjustment;
import org.example.principles.H_DependencyInversionPrinciple.Solution.logging.Logger;
import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Playlist;
import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Song;
import org.example.principles.H_DependencyInversionPrinciple.Solution.player.AudioPlayer;
import org.example.principles.H_DependencyInversionPrinciple.Solution.printer.Printer;
import org.example.principles.H_DependencyInversionPrinciple.Solution.source.AudioSource;

import java.util.List;

public class MusicPlayer {
    private AudioSource audioSource;
    private final AudioPlayer audioPlayer;
    private final Adjustment adjustment;
    private final Printer printer;
    private final Logger logger;

    private Playlist currentPlaylist;

    public MusicPlayer(AudioSource audioSource, AudioPlayer audioPlayer, Adjustment adjustment, Printer printer, Logger logger) {
        this.audioSource = audioSource;
        this.audioPlayer = audioPlayer;
        this.adjustment = adjustment;
        this.printer = printer;
        this.logger = logger;
        this.audioPlayer.setAudioSource(audioSource);
    }

    public void changeSource(AudioSource newAudioSource) {
        this.audioSource = newAudioSource;
        this.audioPlayer.setAudioSource(audioSource);
        logger.log("MusicPlayer changed audio source to: " + newAudioSource.getClass().getSimpleName());
    }

    public void playSong(String sourcePath) {
        logger.log("MusicPlayer requested to play: " + sourcePath);
        audioPlayer.play(sourcePath);
    }

    public void pauseSong() {
        audioPlayer.pause();
    }

    public void stopSong() {
        audioPlayer.stop();
    }

    public Song getCurrentSong() {
        return audioPlayer.getCurrentSong();
    }

    public String getCurrentSongName() {
        Song song = getCurrentSong();
        if (song == null) {
            return "No current song.";
        }
        return song.getSongName();
    }

    public void loadPlaylist(String sourcePath) {
        this.currentPlaylist = audioSource.loadPlaylist(sourcePath);
        logger.log("Playlist '" + currentPlaylist.getPlaylistName() + "' and set as current: ");
    }

    public Playlist getCurrentPlaylist() {
        return this.currentPlaylist;
    }

    public void printCurrentSong() {
        Song s = audioPlayer.getCurrentSong();
        if (s != null) {
            printer.printSong(s);
        }
        else {
            logger.log("No current song to print.");
        }
    }

    public void printCurrentPlaylist() {
        if (currentPlaylist != null) {
            printer.printPlaylist(currentPlaylist);
        }
        else {
            logger.log("No playlist loaded.");
        }
    }

    public void printUserPlaylistName(List<Playlist> playlists) {
        printer.printUserPlaylistName(playlists);
    }

    public void printFavouritesPlaylist(Playlist favouritesPlaylist) {
        printer.printPlaylist(favouritesPlaylist);
    }

    public void setBass(int value) {
        adjustment.setBass(value);
        logger.log("Bass set to: " + value);
    }

    public int getBass() {
        return adjustment.getBass();
    }

    public void setTreble(int value) {
        adjustment.setTreble(value);
        logger.log("Treble set to: " + value);
    }

    public int getTreble() {
        return adjustment.getTreble();
    }

    public void setBalance(Adjustment.Balance balance) {
        adjustment.setBalance(balance);
        logger.log("Balance set to: " + balance);
    }

    public Adjustment.Balance getBalance() {
        return adjustment.getBalance();
    }

    public void setCenterpoint(boolean enabled) {
        adjustment.setCenterpoint(enabled);
        logger.log("Centerpoint set to: " + enabled);
    }

    public boolean isCenterpointEnabled() {
        return adjustment.isCenterpointEnabled();
    }

    public String getAdjustmentName() {
        return adjustment.getClass().getSimpleName();
    }

    public AudioSource getCurrentSource() {
        return audioSource;
    }
}
