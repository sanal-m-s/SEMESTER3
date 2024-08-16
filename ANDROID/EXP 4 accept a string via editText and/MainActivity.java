package com.example.toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showDetails(View view){
        EditText t1=findViewById(R.id.Name);
        Toast.makeText(this,"Hello,nikitha jos"+t1.getText().toString(),Toast.LENGTH_LONG).show();
    }
}
