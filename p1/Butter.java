package p1;

public class Butter extends BreadRecipe {
    public Butter(int flour, int water, int butter) {
        this.flour = flour;
        this.water = water;
        this.butter = butter;
    }

    private int butter;

    @Override
    public String toString() {
        return "\nflour:" + flour +
                "\nwater:" + water +
                "\nbutter:" + butter + "\n";
    }
}
