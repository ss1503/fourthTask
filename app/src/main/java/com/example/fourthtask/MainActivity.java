package com.example.fourthtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCount;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCount = findViewById(R.id.btnClickCounter);
    }

    public void click(View view) {
        int lastDigit = 0;
        int checkCount = count;

        btnCount.setText("This is a click number: " + count);


        while(checkCount != 0){
            lastDigit = checkCount % 10;
            if(lastDigit == 7 || count % 7 == 0){
                btnCount.setText("Boom");
            }
            checkCount /= 10;
        }
        count++;
    }
}