package com.geektech.recycler_view_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    TextView contact;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        contact=itemView.findViewById(R.id.contact);
    }

    public void bind(String contact){
        this.contact.setText(contact);
    }
}
