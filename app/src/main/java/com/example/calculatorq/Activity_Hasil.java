package com.example.calculatorq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Hasil extends AppCompatActivity {

    TextView result;
    Button buttonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        result = (TextView) findViewById(R.id.Result);
        buttonBack = (Button) findViewById(R.id.buttonBack);

        result.setText(getIntent().getStringExtra("result"));
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Hasil.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
