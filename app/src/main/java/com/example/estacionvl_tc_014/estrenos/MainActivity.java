package com.example.estacionvl_tc_014.estrenos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView List;
    String peliculas[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List=(ListView) findViewById(R.id.list);
        List.setOnItemClickListener(this);
        peliculas=getResources().getStringArray(R.array.peliculas);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(this,"Selecionaste"+peliculas[position],Toast.LENGTH_SHORT ).show();
    }
}
