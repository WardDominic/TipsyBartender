package com.example.thetipsybartender;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class cocktails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocktails);

        package com.example.test.searchview; //Used from:https://www.javatpoint.com/android-searchview

        class MainActivity extends AppCompatActivity {
            SearchView searchView;
            ListView listView;
            ArrayList<String> list;
            ArrayAdapter<String > adapter;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                searchView = (SearchView) findViewById(R.id.searchView);
                listView = (ListView) findViewById(R.id.lv1);

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
                            Toast.makeText(MainActivity.this, "No Match found", Toast.LENGTH_LONG).show();
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
    }
}