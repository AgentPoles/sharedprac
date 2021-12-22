package com.mycompany.myapp.sharedprac;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
SharedPreferences mySharedPreference;
    SharedPreferences.Editor myEditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySharedPreference = getSharedPreferences("customers_pin",MODE_PRIVATE);
        myEditor = mySharedPreference.edit();
        myEditor.putInt("baby",8926);
    }
}
