package pl.sda.lukaszewicz;

public class BlackBear extends Bear {

    public BlackBear() {
        super(new KillAttack(), 50, "Czarny");
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

