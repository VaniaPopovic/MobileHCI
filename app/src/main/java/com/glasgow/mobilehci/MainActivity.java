package com.glasgow.mobilehci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    boolean hi = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Button button = findViewById(R.id.mybutton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(hi)button.setText("HELLO");
                else button.setText("hasan");
                hi=!hi;
            }
        });
    }
}
