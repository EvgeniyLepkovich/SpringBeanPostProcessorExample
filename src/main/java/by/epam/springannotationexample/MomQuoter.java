package by.epam.springannotationexample;

/**
 * Created by Yayheniy_Lepkovich on 1/5/2017.
 */
public class MomQuoter implements Quoter {
    @RandomInt(min = 3, max = 5)
    private int repeat;
    private String message;

    public MomQuoter() {
        message = "Go home!!";
    }

    public void getQuote() {
        for(int i = 0; i < repeat; i++){
            System.out.println(message);
        }

    }
}
