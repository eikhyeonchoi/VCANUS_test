package p1;

public class BreadFactory {
    public static Bread getBread(String breadType, int flour, int water, int etc) {
        BreadRecipe recipe;
        switch (breadType) {
            case "cream":
                recipe = new Cream(flour, water, etc);
                break;
            case "sugar":
                recipe = new Sugar(flour, water, etc);
                break;
            default:
                recipe = new Butter(flour, water, etc);
                break;
        }

        return new Bread(breadType, recipe);
    }
}
