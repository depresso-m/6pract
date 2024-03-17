package com.example.mobile6;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        // Закрываем выдвижное меню при запуске приложения, если оно было открыто
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_kfc) {
            Intent intent = new Intent(this, FastFoodActivity.class);
            intent.putExtra(FastFoodActivity.EXTRA_FASTFOOD, "KFC");
            intent.putExtra(FastFoodActivity.EXTRA_IMAGE, R.drawable.kfc_logo);
            startActivity(intent);
        } else if (id == R.id.nav_mcdonalds) {
            Intent intent = new Intent(this, FastFoodActivity.class);
            intent.putExtra(FastFoodActivity.EXTRA_FASTFOOD, "McDonald's");
            intent.putExtra(FastFoodActivity.EXTRA_IMAGE, R.drawable.mcdonalds_logo);
            startActivity(intent);
        } else if (id == R.id.nav_burgerking) {
            Intent intent = new Intent(this, FastFoodActivity.class);
            intent.putExtra(FastFoodActivity.EXTRA_FASTFOOD, "Burger King");
            intent.putExtra(FastFoodActivity.EXTRA_IMAGE, R.drawable.burger_king_logo);
            startActivity(intent);
        } else if (id == R.id.nav_second_activity) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
