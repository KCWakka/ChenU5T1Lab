public class Dice {
    private int sides;
    private int rollCount;
    private int rollValue;

    public Dice (int diceSides) {
        sides = diceSides;
        rollCount = 0;
        rollValue = 0;
    }
    public int getSides () {
        return sides;
    }

    public int getRollCount () {
        return rollCount;
    }

    public int getRollValue () {
        return rollValue;
    }
    public void setSides (int sides) {
        this.sides = sides;
    }

    public void roll() {
        rollCount++;
        rollValue = (int) (Math.random() * sides) + 1;
    }
}
