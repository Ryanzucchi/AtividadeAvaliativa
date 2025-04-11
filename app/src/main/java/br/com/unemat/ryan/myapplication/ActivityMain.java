package br.com.unemat.ryan.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityMain extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button Teste = findViewById(R.id.Idteste); // Botão de upload

        Teste.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityMain.this, KidRegistry.class);
            startActivity(intent);
        });

    }
}