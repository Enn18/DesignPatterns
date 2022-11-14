package org.example.singleton;

import java.util.ArrayList;
import java.util.List;
//Lazy singleton
//This Type of singleton is created when it is first called, afterwards
//the same type of singleton is used for the rest of the applications lifetime
public class Database {
    private static Database instance;
    private List<Integer> numbers = new ArrayList<>();

    private Database() {}

    public void addNumber (int number) {
        numbers.add(number);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
    public static Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
