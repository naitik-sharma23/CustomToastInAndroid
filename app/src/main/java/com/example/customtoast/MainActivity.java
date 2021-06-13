/*
What is Toast ?
An android Toast is a small message displayed on the screen,similar to a tool tip or other similar
popup notification.
A toast is displayed on top of the of the main content of an activity,and only remains visible
for short time period
*/
package com.example.customtoast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;

public class MainActivity extends AppCompatActivity {
  //declaring variables
    private Button mdefault;
    private Button mUserBuilt;
    private Button mCustomMore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialising the xml views in variable
        mdefault = findViewById(R.id.default_Button);
        mUserBuilt= findViewById(R.id.Custom_Toast);
        mCustomMore= findViewById(R.id.Custom_ToastMore);

        //default toast
        mdefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //method 1
//                Toast.makeText(getApplicationContext(),"This is a default toast",Toast.LENGTH_LONG).show();
              //method 2
                Toast.makeText(MainActivity.this, "This is a default Toast", Toast.LENGTH_SHORT).show();
            }
        });
    }
// user built in library custom toast
    public void UserBuiltcustomToast(View v){ StyleableToast.makeText(this,"This a user-built in Custom Toast",R.style.exm).show(); }
// in built toast to modify just change the R.style.
    public void moreToast(View v){ StyleableToast.makeText(this," this in inbuilt toast,explore more by yourself in styleable library",R.style.Animation_Design_BottomSheetDialog).show(); }
}