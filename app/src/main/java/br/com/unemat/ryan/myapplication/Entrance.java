package br.com.unemat.ryan.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Entrance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrance);

        // Acha os botões pelo ID
        Button btnLogin = findViewById(R.id.btn_login);
        Button btnCadastrar = findViewById(R.id.btn_cadastrar);
        TextView btnAdmin = findViewById(R.id.btn_admin);

        // Botão de login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entrance.this, EntryLoginActivity.class);
                startActivity(intent);
            }
        });

        // Botão de cadastro
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entrance.this, AccountCreateActivity.class);
                startActivity(intent);
            }
        });

            // Botão de cadastro
        btnAdmin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Entrance.this, EntryLoginAdmActivity.class);
                    startActivity(intent);
                }
        });
    }
}
