package com.example.layout_flater;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ScrollView scroolview;
    Button aboutbangladesh,aboutworld;
    LayoutInflater layoutInflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        scroolview=findViewById(R.id.scroolview);
        aboutbangladesh=findViewById(R.id.aboutbangladesh);
        aboutworld=findViewById(R.id.aboutworld);
        layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        aboutbangladesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scroolview.removeAllViews();

                layoutInflater.inflate(R.layout.layout_new2,scroolview);





            }
        });

        aboutworld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                scroolview.removeAllViews();
                layoutInflater.inflate(R.layout.layout_new3,scroolview);




            }
        });







    }
}