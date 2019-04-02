package arnab.myfirstday;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Arinab on 12/21/2016.
 */

public class colorWheel  {
    private String mColors[] = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getcolor(){

        String color;
        int colorInt;
        Random randomGenerator=new Random();
        int randomNumber=randomGenerator.nextInt(mColors.length);
        color=mColors[randomNumber];
        colorInt= Color.parseColor(color);
        return colorInt;
    }
}
