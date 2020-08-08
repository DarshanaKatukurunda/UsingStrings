package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i( tag:"Lifecycle" , msg: "OnCreate() invoked");

        TextView textView2;
        textView2 = findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);

        public void onStart()
        {
            super.onStart();
            Log.i("Lifecycle","OnStart() invoked");
        }
        public void onResume()
        {
            super.onResume();
            Log.i("Lifecycle","OnResume() invoked");
        }
        public void onPause()
        {
            super.onPause();
            Log.i("Lifecycle","OnResume() invoked");
        }
        public void onStop()
        {
            super.onStop();
            Log.i("Lifecycle","OnResume() invoked");
        }
        public void onDestroy()
        {
            super.onDestroy();
            Log.i("Lifecycle","OnResume() invoked");
        }
    }
}
