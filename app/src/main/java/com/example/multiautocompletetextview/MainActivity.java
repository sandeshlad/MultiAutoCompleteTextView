package com.example.multiautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

        MultiAutoCompleteTextView multiAutoCompleteTextView;
        String stringlang []={"Android","Java","JQuery","HtTML","PHP","Python","CSS","COBOL"};
        ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        multiAutoCompleteTextView=findViewById(R.id.lang);
        arrayAdapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,stringlang);
        multiAutoCompleteTextView.setAdapter(arrayAdapter);
        multiAutoCompleteTextView.setThreshold(1);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
