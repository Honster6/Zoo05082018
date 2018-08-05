package pl.sda.lukaszewicz;

public class KillAttack extends Animal implements AttackStrategy {


    @Override
    public void attack(Animal attacker, Animal defender) {
        System.out.println(attacker + " zaatakował " + defender);
    }
}
