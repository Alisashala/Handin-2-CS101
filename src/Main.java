import Inheritance1.Laptop;
import Inheritance1.SmartPhone;
import Interface1.FastFood;
import Interface1.Nuggets;
import Interface1.Pizza;
import Interface1.Sandwich;
import Interface2.SportsCar;
import Override1.NewSchoolRap;
import Override1.OldSchoolRap;
import Override1.RapSong;

public class Main {

    public static void main(String[] args) {

// Inheritance 1: In the main method create a laptop and a SmartPhone

        SmartPhone smartPhone = new SmartPhone("Iphone 12", 128, 89, 2);
        smartPhone.wasBought();
        smartPhone.howManyCameras();

        Laptop laptop = new Laptop("ASUS Vivobook", 256, 100, "black");
        laptop.information();
        laptop.colorOfLaptop();

// Interface 1: Add some different Fastfood objects to an array. Now iterate through that array and use some of the methods you have created above.

        FastFood [] fastFoodMenu = {
                new Sandwich("Chicken sandwich", 283),
                new Pizza("Pizza Margherita", 204.4),
                new Nuggets("Chicken Nuggets", 295.9)
        };

        for (int i = 0; i < fastFoodMenu.length; i++) {
            fastFoodMenu[i].cook();
            fastFoodMenu[i].eat();
        }

// Interface 2: Create a class that implements the following interface. Now create two objects using the class created

        SportsCar AudiTT = new SportsCar("Audi", 750000.00, 2018);
        SportsCar BMWm3 = new SportsCar("BMW", 600000.00, 2019);
        System.out.println(AudiTT);
        System.out.println(BMWm3);


//  Override: In the Main class, create an instance of each class and call the play method on each

        RapSong oldSchool = new OldSchoolRap();
        oldSchool.playRap();

        RapSong newSchool = new NewSchoolRap();
        newSchool.playRap();
    }
}