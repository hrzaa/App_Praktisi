package com.example.app_praktisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button harezaButton, dewaButton, rofiqButton, dinarButton;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        harezaButton = findViewById(R.id.harezaButton);
        harezaButton.setOnClickListener(this);

        dewaButton = findViewById(R.id.dewaButton);
        dewaButton.setOnClickListener(this);
        
        dinarButton = findViewById(R.id.dinarButton);
        dinarButton.setOnClickListener(this);

        rofiqButton = findViewById(R.id.rofiqButton);
        rofiqButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.harezaButton:
                Intent intent = new Intent(this, HarezaActivity.class);
                startActivity(intent);
                break;

            case R.id.dewaButton:
                Intent intentt = new Intent(this, DewaActivity.class);
                startActivity(intentt);
                break;

            case R.id.dinarButton:
                Intent intent2 = new Intent(this, DinarActivity.class);
                startActivity(intent2);
                break;

            case R.id.rofiqButton:
                Intent intentttt = new Intent(this,RopiqActivity.class);
                startActivity(intentttt);
                break;
        }


    }
}