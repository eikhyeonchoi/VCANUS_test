package p1;

public class Cream extends BreadRecipe {
    public Cream(int flour, int water, int cream) {
        this.flour = flour;
        this.water = water;
        this.cream = cream;
    }

    private int cream;

    @Override
    public String toString() {
        return "\nflour:" + flour +
                "\nwater:" + water +
                "\ncream:" + cream + "\n";
    }
}
