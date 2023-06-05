package com.example.r9rv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.Holder> {

    ArrayList<Contact> contacts;

    public ContactAdapter(ArrayList<Contact> data)
    {
        contacts = data;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater li = LayoutInflater.from(parent.getContext());
        View v = li.inflate(R.layout.single_contact_item_design, parent, false);

        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.tvNameHolder.setText(contacts.get(position).getName());
        holder.tvNumberHolder.setText(contacts.get(position).getNumber());

        if(contacts.get(position).getPreference().equals("plane"))
        {
            holder.ivHolder.setImageResource(R.drawable.plane);
        }
        else if(contacts.get(position).getPreference().equals("bus"))
        {
            holder.ivHolder.setImageResource(R.drawable.bus);
        }
        else if(contacts.get(position).getPreference().equals("train"))
        {
            holder.ivHolder.setImageResource(R.drawable.train);
        }

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class Holder extends RecyclerView.ViewHolder
    {
        ImageView ivHolder;
        TextView tvNameHolder, tvNumberHolder;
        public Holder(@NonNull View itemView) {
            super(itemView);
            ivHolder = itemView.findViewById(R.id.ivHolder);
            tvNameHolder = itemView.findViewById(R.id.tvNameHolder);
            tvNumberHolder = itemView.findViewById(R.id.tvNumberHolder);

            tvNameHolder.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(itemView.getContext(), tvNameHolder.getText(), Toast.LENGTH_SHORT).show();
                }
            });

            tvNumberHolder.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(itemView.getContext(), tvNumberHolder.getText(), Toast.LENGTH_SHORT).show();
                }
            });

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(itemView.getContext(), "clicked", Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}
