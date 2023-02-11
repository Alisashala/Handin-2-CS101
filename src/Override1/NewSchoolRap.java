package Override1;

//Define a class called Override1.NewSchoolRap that extends Override1.RapSong and overrides the play method to print "Playing new school rap"
public class NewSchoolRap extends RapSong {
    @Override
    public void playRap() {
        System.out.println("Playing new school rap");
    }
}