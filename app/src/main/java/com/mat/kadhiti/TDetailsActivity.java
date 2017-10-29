package com.mat.kadhiti;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TDetailsActivity extends AppCompatActivity {


    TextView tvName;
    TextView tvCategory;
    TextView tvSize;
    
    Button bAdd;
    Button bBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tdetails);

        tvName = (TextView) findViewById(R.id.name);
        tvCategory = (TextView) findViewById(R.id.category);
        tvSize = (TextView) findViewById(R.id.size);
        
        bAdd = (Button) findViewById(R.id.bAdd);
        bBack = (Button) findViewById(R.id.bBack);


        tvName.setText(getIntent().getStringExtra("name"));
        
        
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TDetailsActivity.this, "Successfully Added", Toast.LENGTH_SHORT).show();
            }
        });

        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
