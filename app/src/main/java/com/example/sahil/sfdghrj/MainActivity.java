package com.example.sahil.sfdghrj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView =findViewById(R.id.recyler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Pogo> lists=new ArrayList<>();
        lists.add(new Pogo("Ram","xfdgfg","gasdf",R.drawable.logo));
        lists.add(new Pogo("Ram","xfdgfg","gasdf",R.drawable.php));
        lists.add(new Pogo("Ram","xfdgfg","gasdf",R.drawable.logo));
        lists.add(new Pogo("Ram","xfdgfg","gasdf",R.drawable.php));
        lists.add(new Pogo("Ram","xfdgfg","gasdf",R.drawable.logo));
        lists.add(new Pogo("Ram","xfdgfg","gasdf",R.drawable.php));
        lists.add(new Pogo("Ram","xfdgfg","gasdf",R.drawable.logo));

        ListAdapter adapter=new ListAdapter(lists,this);
        recyclerView.setAdapter(adapter);

    }
}
