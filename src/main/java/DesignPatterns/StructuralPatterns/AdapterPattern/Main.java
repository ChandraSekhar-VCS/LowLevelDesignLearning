package DesignPatterns.StructuralPatterns.AdapterPattern;

import java.util.Scanner;

/**
 * Main class that acts as the client
 * uses AudioPlayer to play different audio files
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the audio file: ");
        String fileName = sc.nextLine();
        System.out.print("Enter the audio type: ");
        String audioType = sc.nextLine();
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(audioType, fileName);
    }
}
