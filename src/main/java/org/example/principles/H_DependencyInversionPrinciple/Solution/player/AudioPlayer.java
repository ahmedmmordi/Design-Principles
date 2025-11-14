package org.example.principles.H_DependencyInversionPrinciple.Solution.player;

import org.example.principles.H_DependencyInversionPrinciple.Solution.model.Song;
import org.example.principles.H_DependencyInversionPrinciple.Solution.source.AudioSource;

public interface AudioPlayer {
    void setAudioSource(AudioSource source);
    void play(String sourcePath);
    void pause();
    void stop();
    Song getCurrentSong();
}
