package Interface1;

//create a Sandwich class
public class Sandwich implements FastFood {
    private String name;
    private double calories;

    public Sandwich (String name, double calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return this.name;
    }

    public double getCalories() {
        return this.calories;
    }

    @Override
    public void cook() {
        System.out.println("I'm cooking " + this.name + ". it has " + this.calories + " calories");;
    }

    @Override
    public void eat() {
        System.out.println("I'm eating " + this.name);
    }
}
