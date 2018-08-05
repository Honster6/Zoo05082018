package pl.sda.lukaszewicz;

import java.util.HashMap;
import java.util.Map;

public class Arena {
    private Map<String, Bear> fightingAnimals = new HashMap<>();


    public void chooseToFight(Bear bear) {
    bear.setArena(this);
    fightingAnimals.put(bear.getName(), bear);
    }
    public void attackByName (Bear attacker, String defender) {
        Bear bear = fightingAnimals.get(defender);
        attacker.attack(bear);

    }
}
