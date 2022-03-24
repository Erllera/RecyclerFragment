package com.geektech.recycler_view_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ContactFragment extends Fragment {

    ContactAdapter adapter;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler);

        ArrayList<String> contact = new ArrayList<>();
        contact.add("Эрлан");
        contact.add("Самат");
        contact.add("Бека");
        contact.add("Мурас");
        contact.add("Байэл");
        contact.add("Шергазы");
        contact.add("Нурик");
        contact.add("Майсал");
        contact.add("Айбек");
        contact.add("Жыргал");
        contact.add("Саша");

        adapter = new ContactAdapter(contact);
        recyclerView.setAdapter(adapter);
    }
}