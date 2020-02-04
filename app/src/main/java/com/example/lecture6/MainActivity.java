package com.example.lecture6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ListView objectListView;
    private String [] Cities={"Islamabad", "Lahore", "Karachi", "Quetta", "Pesahwar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariable();
        creatingAdapter();
    }

    private void creatingAdapter (){
        ArrayAdapter<String>objectArrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, Cities);
        objectListView.setAdapter(objectArrayAdapter);
        objectListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int listPosition, long l) {


                Intent intent=new Intent(MainActivity.this, information.class);
                startActivity(intent);
            }
        });
    }
    private void initializeVariable(){
        objectListView=findViewById(R.id.listView);
    }
}
