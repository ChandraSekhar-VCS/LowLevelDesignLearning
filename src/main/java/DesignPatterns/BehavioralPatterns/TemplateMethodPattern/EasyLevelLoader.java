package DesignPatterns.BehavioralPatterns.TemplateMethodPattern;

public class EasyLevelLoader extends GameLevelLoader{
    @Override
    public void loadAssets() {
        System.out.println("Loading assets...Game Level EASY");
    }
    @Override
    public void initializeEnvironment() {
        System.out.println("Initializing the Game, Level EASY");
    }
    @Override
    public void spawnEnemies() {
        System.out.println("Spawning Enemies...Enemy level Basic");
    }
    @Override
    public void displayStartScreen() {
        System.out.println("Lets Play, Level Easy with Basic Enemies, Click to begin");
    }
}
