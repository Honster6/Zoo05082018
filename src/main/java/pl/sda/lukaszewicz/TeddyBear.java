package pl.sda.lukaszewicz;

public class TeddyBear extends Animal {
    public TeddyBear() {
        super(1, "Jestem Maskotką");
    }

    @Override
    public void eat(){
        throw new IDontEatException();
        }
}
