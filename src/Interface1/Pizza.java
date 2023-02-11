package Interface1;
//a Pizza class
public class Pizza implements FastFood {
    private String name;
    private double calories;

    public Pizza (String name, double calories) {
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
