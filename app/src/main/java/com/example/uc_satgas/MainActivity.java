package com.example.uc_satgas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.customview.widget.Openable;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration
                .Builder(R.id.satgas, R.id.profile)
                .build();
        navController = Navigation.findNavController(this, R.id.fragmentContainer);

        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            if (destination.getId() == R.id.satgas || destination.getId() == R.id.profile) {
                navView.setVisibility(View.VISIBLE);
            } else {
                navView.setVisibility(View.GONE);
            }
        });

        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }
    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(navController, (Openable) null);
    }
}