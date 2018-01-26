package com.danielsanso.favyourneighbour12;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class logIn extends AppCompatActivity {
    Button button=null;
    FloatingActionButton buttonRegis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);



        button=(Button)findViewById(R.id.buttonLogIn);
        buttonRegis=(FloatingActionButton) findViewById(R.id.floatingActionButtonreg);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),Main.class);
                startActivity(intent);

            }
        });

        buttonRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),registerActivity.class);
                startActivity(intent);
            }
        });


    }
}
