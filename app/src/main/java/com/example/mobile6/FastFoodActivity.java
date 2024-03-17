package com.example.mobile6;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FastFoodActivity extends AppCompatActivity {

    public static final String EXTRA_FASTFOOD = "extra_fastfood";
    public static final String EXTRA_IMAGE = "extra_image";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastfood);

        Intent intent = getIntent();
        String fastFoodName = intent.getStringExtra(EXTRA_FASTFOOD);
        int imageResource = intent.getIntExtra(EXTRA_IMAGE, 0);

        TextView textView = findViewById(R.id.text_view_fast_food); // Убедитесь, что здесь используется правильный идентификатор
        ImageView imageView = findViewById(R.id.image_view_fast_food); // Убедитесь, что здесь используется правильный идентификатор

        textView.setText(fastFoodName);
        imageView.setImageResource(imageResource);
    }
}
