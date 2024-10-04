package com.example.sharedpreferencesapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextAge;
    private TextView textViewDisplay;
    private Button buttonSave;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextAge = findViewById(R.id.editTextAge);
        textViewDisplay = findViewById(R.id.textViewDisplay);
        buttonSave = findViewById(R.id.buttonSave);

        sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);
        loadSavedData();

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
    }

    private void saveData() {
        String username = editTextUsername.getText().toString();
        String age = editTextAge.getText().toString();

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("username", username);
        editor.putString("age", age);
        editor.apply();

        loadSavedData(); // Refresh the displayed data
    }

    private void loadSavedData() {
        String savedUsername = sharedPreferences.getString("username", "No Username");
        String savedAge = sharedPreferences.getString("age", "No Age");
        textViewDisplay.setText("Username: " + savedUsername + "\nAge: " + savedAge);
    }
}
