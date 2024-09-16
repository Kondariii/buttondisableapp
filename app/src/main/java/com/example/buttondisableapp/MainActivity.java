package com.example.buttondisableapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonDisable, buttonEnable;
    private TextView licznik;
    private int liczbaKlikniec = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonDisable = findViewById(R.id.buttonDisable);
        buttonEnable = findViewById(R.id.buttonEnable);
        licznik = findViewById(R.id.licznik);

        buttonDisable.setOnClickListener(v -> {
            liczbaKlikniec++;
            buttonDisable.setEnabled(false);
            licznik.setText("Liczba kliknięć: " + liczbaKlikniec);
        });

        buttonEnable.setOnClickListener(v -> {
            buttonDisable.setEnabled(true);
        });
    }
}
