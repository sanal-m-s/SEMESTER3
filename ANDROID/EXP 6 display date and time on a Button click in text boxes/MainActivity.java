package com.example.dateandtime;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView textViewDateTime;
    private Button buttonUpdateDateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        textViewDateTime = findViewById(R.id.text_view_date_time);
        buttonUpdateDateTime = findViewById(R.id.button_update_date_time);

        // Set click listener for the button
        buttonUpdateDateTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the current date and time
                String currentDateTime = getCurrentDateTime();
                // Update the TextView with the current date and time
                textViewDateTime.setText(currentDateTime);
            }
        });
    }

    private String getCurrentDateTime() {
        // Create a SimpleDateFormat object to format the date and time
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        // Get the current date and time
        Date now = new Date();
        // Return the formatted date and time as a string
        return sdf.format(now);
    }
}
