package com.example.calci;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sum(View view) {
        EditText n1=findViewById(R.id.editTextNumber2);
        EditText n2=findViewById(R.id.editTextNumber);
        TextView t1=findViewById(R.id.textView);
        t1.setText("Sum is :"+(Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString())));
        t1.setVisibility(View.VISIBLE);
    }
    public void diff(View view) {
        EditText n1=findViewById(R.id.editTextNumber2);
        EditText n2=findViewById(R.id.editTextNumber);
        TextView t1=findViewById(R.id.textView);
        t1.setText("Difference is :"+(Integer.parseInt(n1.getText().toString())-Integer.parseInt(n2.getText().toString())));
        t1.setVisibility(View.VISIBLE);
    }
    public void prod(View view) {
        EditText n1=findViewById(R.id.editTextNumber2);
        EditText n2=findViewById(R.id.editTextNumber);
        TextView t1=findViewById(R.id.textView);
        t1.setText("Product is :"+(Integer.parseInt(n1.getText().toString())*Integer.parseInt(n2.getText().toString())));
        t1.setVisibility(View.VISIBLE);
    }
    public void quotient(View view) {
        EditText n1=findViewById(R.id.editTextNumber2);
        EditText n2=findViewById(R.id.editTextNumber);
        TextView t1=findViewById(R.id.textView);
        t1.setText("Division is :"+(Double.parseDouble(n1.getText().toString())/Double.parseDouble(n2.getText().toString())));
        t1.setVisibility(View.VISIBLE);
    }
}
