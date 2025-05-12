import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

import br.com.unemat.ryan.myapplication.ActivityMain;
import br.com.unemat.ryan.myapplication.Kg;
import br.com.unemat.ryan.myapplication.KidRegistry;
import br.com.unemat.ryan.myapplication.R;

public class NavMenu extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.menu.bottom_nav_menu); // Substitua com o layout correto

        bottomNavigationView = findViewById(R.id.dashbottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.nav_dashboard) {
                    // Vai para a ActivityMain
                    Intent intent = new Intent(NavMenu.this, ActivityMain.class);
                    startActivity(intent);
                    return true;
                } else if (id == R.id.nav_register) {
                    // Vai para KidRegistry
                    Intent intent = new Intent(NavMenu.this, KidRegistry.class);
                    startActivity(intent);
                    return true;
                } else if (id == R.id.nav_settings) {
                    // Vai para Kg
                    Intent intent = new Intent(NavMenu.this, Kg.class);
                    startActivity(intent);
                    return true;
                }

                return false;
            }
        });
    }
}
