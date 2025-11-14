package org.example.principles.H_DependencyInversionPrinciple.Solution;

import org.example.principles.H_DependencyInversionPrinciple.Solution.adjustment.BasicAdjustment;
import org.example.principles.H_DependencyInversionPrinciple.Solution.logging.ConsoleLogger;
import org.example.principles.H_DependencyInversionPrinciple.Solution.logging.Logger;
import org.example.principles.H_DependencyInversionPrinciple.Solution.manager.MusicPlayer;
import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Song;
import org.example.principles.H_DependencyInversionPrinciple.Solution.model.User;
import org.example.principles.H_DependencyInversionPrinciple.Solution.player.AudioPlayer;
import org.example.principles.H_DependencyInversionPrinciple.Solution.player.BasicAudioPlayer;
import org.example.principles.H_DependencyInversionPrinciple.Solution.printer.ConsolePrinter;
import org.example.principles.H_DependencyInversionPrinciple.Solution.source.AudioSource;
import org.example.principles.H_DependencyInversionPrinciple.Solution.source.FileAudioSource;
import org.example.principles.H_DependencyInversionPrinciple.Solution.source.StreamAudioSource;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        AudioSource audioSource = new FileAudioSource(logger);
        AudioPlayer audioPlayer = new BasicAudioPlayer(logger, audioSource);
        MusicPlayer musicPlayer = new MusicPlayer(audioSource, audioPlayer, new BasicAdjustment(), new ConsolePrinter(), logger);

        System.out.println("*********************");

        musicPlayer.loadPlaylist("/home/ahmed/music/myPlaylist");
        musicPlayer.printCurrentPlaylist();

        musicPlayer.playSong("/home/ahmed/music/song1.mp3");
        musicPlayer.printCurrentSong();
        logger.log("Current Song: " + (musicPlayer.getCurrentSong() != null ? musicPlayer.getCurrentSongName() : "No current song"));
        System.out.println("*********************");

        musicPlayer.pauseSong();
        musicPlayer.playSong(null);

        audioSource = new StreamAudioSource(logger);
        musicPlayer.changeSource(audioSource);

        musicPlayer.playSong("https://stream.com/some_track");
        musicPlayer.printCurrentSong();
        System.out.println("*********************");

        musicPlayer.setBass(4);
        musicPlayer.setTreble(-2);
        musicPlayer.setBalance(BasicAdjustment.Balance.LEFT);
        musicPlayer.setCenterpoint(true);

        logger.log("Current Adjustment: " + musicPlayer.getAdjustmentName());
        logger.log("Current bass: " + musicPlayer.getBass());
        logger.log("Current treble: " + musicPlayer.getTreble());
        logger.log("Current balance: " + musicPlayer.getBalance());
        logger.log("Centerpoint enabled: " + musicPlayer.isCenterpointEnabled());

        musicPlayer.stopSong();
        System.out.println("*********************");

        Song s1 = new Song("Lecture 4", "David");
        Song s2 = new Song("Lecture 5", "Albert", "https://youtube.com/sdfiuhgi5h423");
        Song s3 = new Song("Mentoring Session", "Mostafa Saad");

        musicPlayer.getCurrentPlaylist().addSong(s1);

        User user = new User("Ahmed", logger);
        user.addSongToFavourites(musicPlayer.getCurrentPlaylist().findSongById(1));
        user.addSongToFavourites(s2);
        user.addSongToFavourites(s3);
        // user.addSongToFavourites(s3); // Will throw an exception: Song 'Mentoring Session' is already marked as favourite
        user.addUserPlaylist(musicPlayer.getCurrentPlaylist());
        musicPlayer.printCurrentPlaylist();
        musicPlayer.getCurrentPlaylist().addSong(s3);

        musicPlayer.printCurrentPlaylist();

        musicPlayer.printFavouritesPlaylist(user.getUserFavourites());
        user.removeSongFromFavourites(s2);
        musicPlayer.printFavouritesPlaylist(user.getUserFavourites());
        System.out.println("*********************");

        logger.log("Current Source: " + musicPlayer.getCurrentSource().getClass().getSimpleName());
        logger.log("Current Song: " + (musicPlayer.getCurrentSong() != null ? musicPlayer.getCurrentSongName() : "No current song"));
        musicPlayer.playSong("https://stream.com/some_track");
        logger.log("Current Song: " + (musicPlayer.getCurrentSong() != null ? musicPlayer.getCurrentSongName() : "No current song"));
        System.out.println("*********************");

        musicPlayer.printUserPlaylistName(user.getUserPlaylists());
        user.removePlaylist(musicPlayer.getCurrentPlaylist());
        musicPlayer.printUserPlaylistName(user.getUserPlaylists());
    }
}
