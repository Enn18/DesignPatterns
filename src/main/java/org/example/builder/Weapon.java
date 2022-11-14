package org.example.builder;

import java.util.ArrayList;
import java.util.List;

public class Weapon {
    private String type;
    private String name;
    private int damage;
    private long durability;
    private List<String> perks = new ArrayList<>()

    private Weapon(String type, String name, int damage, int durability, List<String> perks) {
        this.type = type;
        this.name = name;
        this.damage = damage;
        this.durability = durability;
        this.perks = perks;

    }
}
