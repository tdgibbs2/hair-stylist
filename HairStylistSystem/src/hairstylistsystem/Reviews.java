package hairstylistsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Reviews {

    ListIterator<String> itr;
    private List<String> REVIEW = new ArrayList<>();

    public Reviews() {

    }

    public void addReview(String RV) {

        REVIEW.add(RV);
    }

    public void printReviews() {
        int tracker = 1;
        while (true) {
            if (itr.hasNext()) {
                System.out.print("Review " + tracker + itr.next());
                tracker++;
                
                
            } else {
                break;
            }
        }
    }

}
