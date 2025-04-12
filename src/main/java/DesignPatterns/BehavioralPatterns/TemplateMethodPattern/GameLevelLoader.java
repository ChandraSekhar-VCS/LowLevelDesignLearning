package DesignPatterns.BehavioralPatterns.TemplateMethodPattern;

public abstract class GameLevelLoader {
    public final void loadLevel(){
        loadAssets();
        initializeEnvironment();
        spawnEnemies();
        displayStartScreen();
    }
    abstract  void loadAssets();
    abstract void initializeEnvironment();
    abstract void spawnEnemies();
    abstract void displayStartScreen();
}
