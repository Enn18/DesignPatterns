package org.example.singleton;

public class Engine {
    private static Engine Instance = new Engine();
    private boolean isEngineWorking = true;

    private Engine() {}

    public void turnEngineOn() {
        isEngineWorking = true;
    }

    public boolean getEnginestate() {
        return isEngineWorking;
    }

    public static Engine getInstance() {
        return Instance;
    }
}
