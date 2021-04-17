package com.softvally.material_dropdown;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView editText;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> arrayAdapter;
    TextInputLayout inputLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Trying to set it via java code
     inputLayout = findViewById(R.id.textInputLayout);
        editText = findViewById(R.id.autocompletesText);
        arrayList = new ArrayList<>();
        arrayList.add("Laptop");
        arrayList.add("Pc");
        arrayList.add("Monitor");
        arrayList.add("Mouse");
        arrayList.add("Keyboard");
        arrayList.add("Laptop");
        arrayList.add("Pc");
        arrayList.add("Monitor");
        arrayList.add("Mouse");
        arrayList.add("Keyboard");
        arrayAdapter = new ArrayAdapter<>(getApplicationContext(), R.layout.text, arrayList);
        editText.setAdapter(arrayAdapter);
        editText.setThreshold(1);





      /*  String[] type = new String[] {"Bed-sitter", "Single", "1- Bedroom", "2- Bedroom","3- Bedroom"};

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        this,
                        R.layout.text,
                        type);

        AutoCompleteTextView editTextFilledExposedDropdown =
                findViewById(R.id.autocompletesText);
        editTextFilledExposedDropdown.setAdapter(adapter);


       */

    }
}