package com.example.activitylifecycle;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.activitylifecycle.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LifecycleDemo";
    private TextView lifecycleStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lifecycleStatus = findViewById(R.id.lifecycleStatus);
        updateLifecycleStatus("onCreate");
        Log.d(TAG, "onCreate called");
        Toast.makeText(this,"onCreate called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        updateLifecycleStatus("onStart");
        Log.d(TAG, "onStart called");
        Toast.makeText(this,"onStart called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateLifecycleStatus("onResume");
        Log.d(TAG, "onResume called");
        Toast.makeText(this,"onResume called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        updateLifecycleStatus("onPause");
        Log.d(TAG, "onPause called");
        Toast.makeText(this,"onPause called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        updateLifecycleStatus("onStop");
        Log.d(TAG, "onStop called");
        Toast.makeText(this,"onStop called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        updateLifecycleStatus("onRestart");
        Log.d(TAG, "onRestart called");
        Toast.makeText(this,"onRestart called",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        updateLifecycleStatus("onDestroy");
        Log.d(TAG, "onDestroy called");
        Toast.makeText(this,"onDestroy called",Toast.LENGTH_SHORT).show();
    }

    private void updateLifecycleStatus(String status) {
        lifecycleStatus.setText("Current Lifecycle State: " + status);
    }
}
