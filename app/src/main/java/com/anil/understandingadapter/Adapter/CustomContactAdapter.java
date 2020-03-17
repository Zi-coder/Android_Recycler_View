package com.anil.understandingadapter.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.anil.understandingadapter.Model.Contact;
import com.anil.understandingadapter.R;

import java.util.ArrayList;

/**
 * Created By Anil
 * on 17-03-2020 at 13:07
 */
public class CustomContactAdapter extends RecyclerView.Adapter<CustomContactAdapter.MyViewHolder> {
    private ArrayList<Contact> list = new ArrayList<>();

    public CustomContactAdapter(ArrayList<Contact> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_list_layout,parent,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    Contact contact = list.get(position);
    holder.name.setText(contact.getName());
    holder.number.setText(contact.getNumber());
    holder.date.setText(contact.getAddedOn());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name,number,date;
        public MyViewHolder(View itemView){
            super(itemView);
            name = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.number);
            date = itemView.findViewById(R.id.date);

        }

    }
}
