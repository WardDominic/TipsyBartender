package com.example.thetipsybartender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    Button mojitoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mojitoButton = (Button)findViewById(R.id.mojito);



        mojitoButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)  {
                Intent i = new Intent(MainActivity.this, Mojito002.class);
                startActivity(i);
            }
        });
    }
}