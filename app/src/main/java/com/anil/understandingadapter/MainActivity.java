package com.anil.understandingadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anil.understandingadapter.Adapter.CustomContactAdapter;
import com.anil.understandingadapter.Model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contact> list = new ArrayList<>();
    private RecyclerView recyclerView;
    private CustomContactAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        adapter = new CustomContactAdapter(list);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));

        recyclerView.setAdapter(adapter);
        prepareData();
    }
    private void prepareData(){
        Contact contact = null;
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);

        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);
        contact = new Contact("Dhruvam","9467884671","22/12/1995");
        list.add(contact);

        adapter.notifyDataSetChanged();
    }
}
