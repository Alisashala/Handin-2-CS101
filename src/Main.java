public class Main {

    public static void main(String[] args) {

// 1 - Inheritance: In the main method create a Laptop and a SmartPhone

        SmartPhone smartPhone = new SmartPhone("Iphone 12", 128, 89, 2);
        smartPhone.wasBought();
        smartPhone.howManyCameras();

        Laptop laptop = new Laptop("ASUS Vivobook", 256, 100, "black");
        laptop.information();
        laptop.colorOfLaptop();

// 5 - Override: In the Main class, create an instance of each class and call the play method on each

        RapSong oldSchool = new OldSchoolRap();
        oldSchool.playRap();

        RapSong newSchool = new NewSchoolRap();
        newSchool.playRap();
    }
}