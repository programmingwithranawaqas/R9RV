package com.example.r9rv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvlist;
    LinearLayoutManager llm;

    GridLayoutManager glm;
    ArrayList<Contact> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvlist = findViewById(R.id.rvlist);
        llm = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, true);
        glm = new GridLayoutManager(this,1 ,GridLayoutManager.HORIZONTAL , false);
        rvlist.setLayoutManager(glm);

        data = new ArrayList<>();
        data.add(new Contact("Waqas", "03174930713", "plane"));
        data.add(new Contact("Ali", "03174000002", "plane"));
        data.add(new Contact("Hamza Shahid", "03174965412", "bus"));
        data.add(new Contact("Arslan", "03172111111", "plane"));
        data.add(new Contact("Mustafa", "03174444444", "train"));
        data.add(new Contact("Waqas", "03174930713", "plane"));
        data.add(new Contact("Ali", "03174000002", "plane"));
        data.add(new Contact("Hamza Shahid", "03174965412", "bus"));
        data.add(new Contact("Arslan", "03172111111", "plane"));
        data.add(new Contact("Mustafa", "03174444444", "train"));
        data.add(new Contact("Waqas", "03174930713", "plane"));
        data.add(new Contact("Ali", "03174000002", "plane"));
        data.add(new Contact("Hamza Shahid", "03174965412", "bus"));
        data.add(new Contact("Arslan", "03172111111", "plane"));
        data.add(new Contact("Mustafa", "03174444444", "train"));


        ContactAdapter ca = new ContactAdapter(data);
        rvlist.setAdapter(ca);



    }
}