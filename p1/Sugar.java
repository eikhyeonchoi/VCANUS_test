package p1;

import p1.BreadRecipe;

public class Sugar extends BreadRecipe {
    public Sugar(int flour, int water, int sugar) {
        this.flour = flour;
        this.water = water;
        this.sugar = sugar;
    }

    private int sugar;

    @Override
    public String toString() {
        return "\nflour:" + flour +
                "\nwater:" + water +
                "\nsugar:" + sugar + "\n";
    }
}
