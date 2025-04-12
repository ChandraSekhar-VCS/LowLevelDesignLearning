package DesignPatterns.BehavioralPatterns.TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {
        GameLevelLoader easyGame = new EasyLevelLoader();
        GameLevelLoader hardGame = new HardLevelLoader();
        easyGame.loadLevel();
        System.out.println("----------");
        hardGame.loadLevel();
    }
}
