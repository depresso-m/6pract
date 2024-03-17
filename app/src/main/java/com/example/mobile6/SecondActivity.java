package com.example.mobile6;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private BottomNavigationView bottomNavigationView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = findViewById(R.id.textView);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.action_item1) {
                    getSupportActionBar().setTitle("Item 1");
                    textView.setText("Инкапсуляция. Вся информация, которая нужна для работы конкретного объекта, должна храниться внутри этого объекта.");
                } else if (item.getItemId() == R.id.action_item2) {
                    getSupportActionBar().setTitle("Item 2");
                    textView.setText("Наследование. Разработчик создаёт класс с определёнными свойствами, подкласс на его основе, который берёт свойства класса и добавляет свои, и объект подкласса, который также копирует его свойства и добавляет свои.");
                } else if (item.getItemId() == R.id.action_item3) {
                    getSupportActionBar().setTitle("Item 3");
                    textView.setText("Полиморфизм. Один и тот же метод может работать по-разному в зависимости от объекта, где он вызван, и данных, которые ему передали.");
                }
                return true;
            }
        });
    }
}
