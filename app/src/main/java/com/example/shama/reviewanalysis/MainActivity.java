package com.example.shama.reviewanalysis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private Button analyze;
    EditText review;
    TextView tv1,tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        analyze =(Button)findViewById(R.id.analyze);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        review =(EditText)findViewById(R.id.review);

        analyze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText("Your review is: \n"+review.getText().toString());
            }
        });


    }
}
