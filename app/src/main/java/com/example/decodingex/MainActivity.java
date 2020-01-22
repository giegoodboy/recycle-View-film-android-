package com.example.decodingex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView roommovie;
    private ArrayList<movie> list = new ArrayList<>();

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }



    private String title = "Cue Movies";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        roommovie = findViewById(R.id.rv_heroes);
        roommovie.setHasFixedSize(true);

        list.addAll(datamovie.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        roommovie.setLayoutManager(new LinearLayoutManager(this));
        adapterlist adapterlist = new adapterlist(list);
        roommovie.setAdapter(adapterlist);
        roommovie.setAdapter(adapterlist);
        adapterlist.setOnItemClickCallback(new adapterlist.OnItemClickCallback() {

            @Override
            public void onItemClicked(movie movie) {
                Intent moveIntent1 = new Intent(MainActivity.this, aboutmovie.class);
                moveIntent1.putExtra(aboutmovie.ITEM_EXTRA, movie);
                startActivity(moveIntent1);
            }
        });
    }
}


