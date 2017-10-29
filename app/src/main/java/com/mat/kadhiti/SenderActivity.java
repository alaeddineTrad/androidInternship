package com.mat.kadhiti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SenderActivity extends AppCompatActivity {


    EditText etName;
    Spinner sCat;
    Spinner sSize;
    Button bAdd;
    Button bBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        etName = (EditText) findViewById(R.id.etName);

        sCat = (Spinner) findViewById(R.id.sCat);

        sSize = (Spinner) findViewById(R.id.sSize);

        bAdd = (Button) findViewById(R.id.bAdd);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.category_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sCat.setAdapter(adapter);

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SenderActivity.this, sCat.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
