package p1;

public class Bread {
    public Bread(String breadType, BreadRecipe recipe) {
        this.breadType = breadType;
        this.recipe = recipe;
    }

    private String breadType;
    private BreadRecipe recipe;

    @Override
    public String toString() {
        return "breadType: " + breadType +
                "\nrecipe" + recipe;
    }
}
