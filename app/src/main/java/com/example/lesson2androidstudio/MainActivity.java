package com.example.lesson2androidstudio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String savedString;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit_text);
        if (savedInstanceState!=null){
            savedString= savedInstanceState.getString("saved_string");
        }

        Log.d("ololo","onStart " + savedString);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ololo","onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ololo","onStop");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("ololo","onSavedInstanceState");
        outState.putString("saved_string", editText.getText().toString());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ololo","onDestroy");
    }
}
