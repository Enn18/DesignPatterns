package org.example.singleton;

public class Computer {
    private static Computer instance;
    public static boolean startUp = false;

    private Computer() {
    }

    public void turnOnComputer() {
        startUp = true;
    }

    public boolean getComputerState() {
        return startUp;
    }

    public static Computer getInstance() {
        if (instance == null) {
            synchronized (Computer.class) {
                if (instance == null) {
                    instance = new Computer();
                }
            }
        }
        return instance;
    }
}

