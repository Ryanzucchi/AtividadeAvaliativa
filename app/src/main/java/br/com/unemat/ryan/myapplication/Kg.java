package br.com.unemat.ryan.myapplication;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class Kg extends AppCompatActivity {

    private ListView listaCreches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kidengardens);

        listaCreches = findViewById(R.id.list_view_creches);

        // Lista de creches
        List<String> creches = Arrays.asList(
                "Creche A - Rua A - Bairro A - número 0 - cidade A - Estado A",
                "Creche B - Rua B - Bairro B - número 1 - cidade B - Estado B",
                "Creche C - Rua C - Bairro C - número 2 - cidade C - Estado C"
        );

        // Configura o adapter
        CrecheAdapter adapter = new CrecheAdapter(this, creches);
        listaCreches.setAdapter(adapter);
    }
}
