package com.busyo.listex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        ListView listView = (ListView) findViewById(R.id.listview);
        ArrayList<Listviewitem> data = new ArrayList<>();
        Listviewitem lion = new Listviewitem(R.drawable.lion, "Lion");
        Listviewitem tiger = new Listviewitem(R.drawable.tiger, "Tiger");
        Listviewitem dog = new Listviewitem(R.drawable.dog, "Dog");
        Listviewitem cat = new Listviewitem(R.drawable.cat, "Cat");
        data.add(lion);
        data.add(tiger);
        data.add(dog);
        data.add(cat);
        ListviewAdapter adapter = new ListviewAdapter(this, R.layout.item, data);
        listView.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
