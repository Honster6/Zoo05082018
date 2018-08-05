package pl.sda.lukaszewicz;

public class BrownBear extends Bear {

    public BrownBear() {
        super(new KillAttack(), 100, "Brunat");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }


}
