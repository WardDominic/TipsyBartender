package com.example.thetipsybartender;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View.OnClickListener;
import java.util.ArrayList;

public class cocktails extends AppCompatActivity{

    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    Button aperolButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.lv1);
        aperolButton = (Button)findViewById(R.id.aperol);

        aperolButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cocktails.this, AperolSpritz.class));
            }
        });

        list = new ArrayList<>();
        list.add("Aperol Spritz");
        list.add("Aviation");
        list.add("Bahía Breeze");
        list.add("City Rickey");
        list.add("Cuba Libre");
        list.add("Espresso Martini");
        list.add("Everybody's Irish");
        list.add("Mexican Firing Squad");
        list.add("Mint Julop");
        list.add("Mojito");
        list.add("Piña Colada");
        list.add("Zombie");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if (list.contains(query)) {
                    adapter.getFilter().filter(query);
                } else {
                    Toast.makeText(cocktails.this, "No Match found", Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //    adapter.getFilter().filter(newText);
                return false;
            }

        });
    }
}