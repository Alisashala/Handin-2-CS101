import Inheritance1.Laptop;
import Inheritance1.SmartPhone;
import Interface2.SportsCar;
import Override1.NewSchoolRap;
import Override1.OldSchoolRap;
import Override1.RapSong;

public class Main {

    public static void main(String[] args) {

// 1 - Inheritance: In the main method create a laptop and a SmartPhone

        SmartPhone smartPhone = new SmartPhone("Iphone 12", 128, 89, 2);
        smartPhone.wasBought();
        smartPhone.howManyCameras();

        Laptop laptop = new Laptop("ASUS Vivobook", 256, 100, "black");
        laptop.information();
        laptop.colorOfLaptop();

// Interface 2:
        SportsCar AudiTT = new SportsCar("Audi", 750000.00, 2018);
        SportsCar BMWm3 = new SportsCar("BMW", 600000.00, 2019);
        System.out.println(AudiTT);
        System.out.println(BMWm3);


// 5 - Override: In the Main class, create an instance of each class and call the play method on each

        RapSong oldSchool = new OldSchoolRap();
        oldSchool.playRap();

        RapSong newSchool = new NewSchoolRap();
        newSchool.playRap();
    }
}