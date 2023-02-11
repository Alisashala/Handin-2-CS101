package Interface1;

//create a Sandwich class
public class Sandwich implements FastFood {
    private String name;
    private double calories;

    public Sandwich (String name, double calories) {
        this.name = name;
        this.calories = calories;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getCalories() {
        return this.calories;
    }
}