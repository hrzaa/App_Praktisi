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
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.harezaButton:
                Intent intent = new Intent(this, HarezaActivity.class);
                startActivity(intent);
                break;
        }

    }
}