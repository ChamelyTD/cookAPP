


package com.example.cookapp;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.cookapp.R;

public class MainActivity extends AppCompatActivity {
    Button Select_items;
    Button Order_now;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);




        Select_items = findViewById(R.id.btn_Select_items);
        Order_now = findViewById(R.id.btn_Order_now);

        Select_items.setOnClickListener(v->{
            Toast.makeText(this, "Item selected", Toast.LENGTH_SHORT).show();
        });

        Order_now.setOnClickListener(v->{
            Toast.makeText(this, "Item ordered", Toast.LENGTH_SHORT).show();
        });





    }
}