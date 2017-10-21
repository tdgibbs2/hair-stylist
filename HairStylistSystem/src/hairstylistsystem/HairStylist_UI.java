package hairstylistsystem;

import hairstylistsystem.profile.Profile;

import java.util.Scanner;

public class HairStylist_UI {

    Scanner StartDecision = new Scanner(System.in);

    private Profile[] profiles;

    public HairStylist_UI() {
        profiles = new Profile[20];

    }

    void DisplayWelcomeScreen() {
        System.out.println("WELCOME! What would you like to do? ");
        System.out.println("Press 1 to LOGIN");
        System.out.println("Press 2 to CREATE AN ACCOUNT");

    }

    void ProfileLogin() {

    }

    void CreateAccount() {

    }
    
    void openReviews(){
    profiles[0].reviews.
    }

    public void StartSystem() {
        DisplayWelcomeScreen();
        
    }

}
