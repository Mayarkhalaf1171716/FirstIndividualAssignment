package com.example.firstindividualassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private EditText edtName;
private EditText edtExperience;
private TextView textExperience;
private Spinner spnDegrees;
Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spnDegrees);
populatetSpinner();
        setupViews();
    }

    private void populatetSpinner() {
        ArrayList<String> data = new ArrayList<>();
        data.add("deplom");
        data.add("Bachalores");
        data.add("Master");
        data.add("Dactorate");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,data);
        spinner.setAdapter(adapter);
    }

    private void setupViews(){
        edtName = findViewById(R.id.edtName);
        edtExperience = findViewById(R.id.edtExperience);
        textExperience = findViewById(R.id.textExperience);
        spnDegrees = findViewById(R.id.spnDegrees);

    }
    public void AddexperienceOnclick(View view) {
        String experience = edtExperience.getText().toString();
        textExperience.setVisibility(View.VISIBLE);
    }

    public void btnDegree(View view) {
        Spinner spnDegrees = findViewById(R.id.spnDegrees);
        String str = spnDegrees.getSelectedItem().toString();
    }

    public void btnSendOnclick(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        String data1 = edtName.getText().toString();
        intent.putExtra("Name and id", data1);
        String data2 = edtExperience.getText().toString();
        intent.putExtra("Experience info",data2);
        startActivity(intent);
    }
}