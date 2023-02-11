package Interface1;
// And a class you decide that implements the FastFood interface.
public class Nuggets implements FastFood{
    private String name;
    private double calories;

    public Nuggets (String name, double calories) {
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
