package com.example.registrationform;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextAge, editTextAddress, editTextPhone, editTextDOB, editTextQualification, editTextJob;
    private Spinner spinnerGender;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTextAge);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextDOB = findViewById(R.id.editTextDOB);
        editTextQualification = findViewById(R.id.editTextQualification);
        editTextJob = findViewById(R.id.editTextJob);
        spinnerGender = findViewById(R.id.spinnerGender);
        Button buttonSubmit = findViewById(R.id.buttonSubmit);
        textViewResult = findViewById(R.id.textViewResult);

        // Set up the spinner for gender
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.gender_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGender.setAdapter(adapter);

        // Set the button click listener
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayData();
            }
        });
    }

    private void displayData() {
        String name = editTextName.getText().toString();
        String age = editTextAge.getText().toString();
        String gender = spinnerGender.getSelectedItem().toString();
        String address = editTextAddress.getText().toString();
        String phone = editTextPhone.getText().toString();
        String dob = editTextDOB.getText().toString();
        String qualification = editTextQualification.getText().toString();
        String job = editTextJob.getText().toString();

        String result = "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender + "\n" +
                "Address: " + address + "\n" +
                "Phone: " + phone + "\n" +
                "Date of Birth: " + dob + "\n" +
                "Qualification: " + qualification + "\n" +
                "Job: " + job;

        textViewResult.setText(result);
    }
}
