package org.example;

import org.example.builder.Weapon;
import org.example.singleton.*;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

       // Counter counter = Counter.getInstance();


        /*Enum based eager singleton  */
        /*CountEnum counter = CountEnum.INSTANCE;
        System.out.println(counter.getCount());
        counter.increment();
        counter.increment();
        System.out.println(counter.getCount()); */

        /*Database database = Database.getInstance();
        database.addNumber(1);
        database.addNumber(2);
        database.addNumber(3);
        System.out.println(database.getNumbers().size()); //should return 3
         */

        StringBuilder stringBuilder = new StringBuilder().append("hello").append("world");
        System.out.println(stringBuilder);

        Weapon ak47 = new Weapon.Builder()
                .withType("Gun")
                .withName("AK-47")
                .withPerks(new ArrayList<>())
                .withDamage(10)
                .withDurability(100000)
                .build();
        System.out.println(ak47.getDamage());

        //Engine engine = Engine.getInstance();
       // engine.turnEngineOn();
       // System.out.println(engine.getEnginestate());

        //Computer computer = Computer.getInstance();
       // System.out.println(computer.getComputerState());


    }
    //Exercise: Create a singleton class called Engine
    //it should have the boolean field called engine

    //exercise: create a lazy double checked singleton called computer
    //it should have a boolean field called startup
}