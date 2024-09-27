package com.example.buttondisableapp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;import com.example.buttondisableapp.R;
public class MainActivity extends AppCompatActivity {
    private Button buttonDisable;
    private Button buttonEnable;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonDisable = findViewById(R.id.buttonDisable);
        buttonEnable = findViewById(R.id.buttonEnable);
        buttonDisable.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick (View v) {
                buttonDisable.setEnabled(false);
                Toast.makeText(MainActivity.this, "Przycisk został wyłączony", Toast.LENGTH_SHORT).show();
            }        });        buttonEnable.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View v) {
                    buttonDisable.setEnabled(true);
                }
            });
    }}