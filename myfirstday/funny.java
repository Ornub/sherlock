package arnab.myfirstday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class funny extends AppCompatActivity {
    private funnyBook mFunnyBook=new funnyBook();
    private colorWheel mColorWheel=new colorWheel();

    //Declare our view variables
    private TextView mFunnyTextView;
    private Button mShowFunnyBotton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funny);

        //Assign the view from the layout files to the corresponding variables
        mFunnyTextView= (TextView) findViewById(R.id.textFunny);
        mShowFunnyBotton= (Button) findViewById(R.id.buttonFunny);
        mRelativeLayout= (RelativeLayout) findViewById(R.id.Relativefunny);

        View.OnClickListener listener= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //thebutton was clicked
                String fact=mFunnyBook.getnum();
                int color=mColorWheel.getcolor();

                mFunnyTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mShowFunnyBotton.setTextColor(color);

            }
        };

        mShowFunnyBotton.setOnClickListener(listener);

        Toast.makeText(this, "yeah our activity was created", Toast.LENGTH_SHORT).show();

    }
}
