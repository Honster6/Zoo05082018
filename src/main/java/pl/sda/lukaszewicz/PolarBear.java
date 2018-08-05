package pl.sda.lukaszewicz;

public class PolarBear extends Bear {

    public PolarBear() {
        super(new KillAttack(), 200, "Polar");
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


