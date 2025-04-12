package DesignPatterns.BehavioralPatterns.TemplateMethodPattern;

public class HardLevelLoader extends GameLevelLoader{
    @Override
    public void loadAssets(){
        System.out.println("Loading assets...Game level HARD");
    }
    @Override
    public void initializeEnvironment() {
        System.out.println("Initializing environment, Level HARD");
    }
    @Override
    public void spawnEnemies() {
        System.out.println("Spawning enemies...Enemy level HARD");
    }
    @Override
    public void displayStartScreen() {
        System.out.println("Lets Play, Level HARD with Hard Enemies, Click to begin");
    }
}
