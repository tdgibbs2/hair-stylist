/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hairstylistsystem;

/**
 *
 * @author calebcampbell
 */
public class profile {

    final double ID_NUMBER;
    String SYSTEM_ID_NUMBER;
    String firstName;
    String lastName;
    final String MONTH;
    final String DAY;
    final String YEAR;
    final String BIRTHDAY;
    final String USERNAME;
    String Password;
    boolean BAN;
    boolean BanReview;
    Reviews reviews;

    public profile(String firstName, String lastName, String MONTH, String DAY, String YEAR, String USERNAME, String Password, String IDNUM_ASSIGNMENT) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.MONTH = MONTH;
        this.DAY = DAY;
        this.YEAR = YEAR;
        this.USERNAME = USERNAME;
        this.Password = Password;
        this.BIRTHDAY = this.MONTH + " / " + this.DAY + " / " + this.YEAR;
        ID_NUMBER = (Math.random() * 2100000);
        BAN = false;
        BanReview = false;
        reviews = new Reviews();

        if (Integer.parseInt(IDNUM_ASSIGNMENT) == 0) { //0 means ID NUMBER is a CustomerProfile.
            SYSTEM_ID_NUMBER = "0 - " + Double.toString(ID_NUMBER);

        } else if (Integer.parseInt(IDNUM_ASSIGNMENT) == 1) { //1 means ID NUMBER is a ProviderProfile
            SYSTEM_ID_NUMBER = "1 - " + Double.toString(ID_NUMBER);
        } else {

        }
    }

    void openReviews() {

    }

    String getfirstName() {
        return firstName;
    }

    String getlastName() {
        return lastName;
    }

    void setfirstName(String fn) {
        firstName = fn;

    }

    void setlastName(String ln) {
        lastName = ln;

    }

    double getID_NUMBER() {

        return ID_NUMBER;
    }

    void setPassword(String PSSWD) {
        Password = PSSWD;

    }

    String getBIRTHDAY() {
        return BIRTHDAY;
    }

    String getUSERNAME() {

        return USERNAME;
    }

}
