package hairstylistsystem;

import hairstylistsystem.profile.Profile;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class HairStylist_UI {

    Scanner StartDecision = new Scanner(System.in);

    private profile[] profiles;

    public HairStylist_UI() {
        //profiles = new profile[20];
        List<profile> profiles = new ArrayList<>();

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

    void addToReviews() {
        
    }

    void openReviews() {
        profiles[0].reviews.printReviews();
    }

    public void StartSystem() {
        DisplayWelcomeScreen();

    }

}
