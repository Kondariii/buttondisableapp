package com.example.buttondisableapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
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
            Toast.makeText(MainActivity.this, "Duży przycisk został wyłączony", Toast.LENGTH_SHORT).show();
        });

        buttonEnable.setOnClickListener(v -> {
            buttonDisable.setEnabled(true);
            Toast.makeText(MainActivity.this, "Duży przycisk został aktywowany", Toast.LENGTH_SHORT).show();
        });
    }
}
