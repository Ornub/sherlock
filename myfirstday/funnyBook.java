package arnab.myfirstday;

import java.util.Random;

/**
 * Created by Arnab on 12/21/2016.
 */

public class funnyBook {
    private String mfacts[]={ "Excellent Elementary,",
            "You know my methods, Watson",
            "When you have eliminated the impossible, whatever...",
            "The lowest and vilest alleys in London do not present...",
            "London, that great cesspool into which all the loungers..",
            "the curious incident of the dog in the night-time...",
            "They were the footprints of a gigantic hound!",
            "i am one of them..",
            "the game is onn",
            "i am married to my job"
    };

    public String getnum(){
        String fact="";

        Random randomGenerator=new Random();
        int randomNumber=randomGenerator.nextInt(mfacts.length);
        fact=mfacts[randomNumber];
        return fact;
    }
}
