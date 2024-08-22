package edu.unisabana.dyas.patterns.utils;

// Interfaz para el reproductor de audio, según el tipo de audio
public interface AudioPlayer {
    void play(String audioType, String fileName);
    void stop();
}