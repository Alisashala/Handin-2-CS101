package Override1;

//Now create a class called OldSchoolRap that extends RapSong and overrides the play method to print "Playing old school rap"
public class OldSchoolRap extends RapSong {
    @Override
    public void playRap() {
        System.out.println("Playing old school rap");
    }
}