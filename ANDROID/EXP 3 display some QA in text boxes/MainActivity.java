package com.example.qa;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showAns(View view){
        TextView t1=findViewById(R.id.textView3);
        TextView t2=findViewById(R.id.textView4);
        t1.setVisibility(View.VISIBLE);
        t2.setVisibility(View.VISIBLE);
    }
}
