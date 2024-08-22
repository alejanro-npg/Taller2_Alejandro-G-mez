package edu.unisabana.dyas.patterns.utils;

public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    private AdvancedAudioPlayer advancedAudioPlayer;

    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }
    //Manda la información al audioAdvancePlayer según el tipo de audio
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedAudioPlayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advancedAudioPlayer.playVlc(fileName);
        } else {
            System.out.println("Invalid media type: " + audioType);
        }
    }

    @Override
    public void stop() {
        advancedAudioPlayer.stop();
    }
}
