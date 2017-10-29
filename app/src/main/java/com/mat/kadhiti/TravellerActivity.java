package com.mat.kadhiti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TravellerActivity extends AppCompatActivity {

    List<Item> items = new ArrayList<>();
    List<String> itemNames = new ArrayList<>();
    ListView listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traveller);
        listItems = (ListView) findViewById(R.id.items);

        Item i1 = new Item();
        i1.setName("first");


        Item i2 = new Item();
        i2.setName("second");


        items.add(i1);
        items.add(i2);

        for(Item i : items){
            itemNames.add(i.getName());
        }

        listItems.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , itemNames));

        listItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(TravellerActivity.this,TDetailsActivity.class);
                i.putExtra("name",listItems.getItemAtPosition(position).toString());
                startActivity(i);
            }
        });
    }
}
