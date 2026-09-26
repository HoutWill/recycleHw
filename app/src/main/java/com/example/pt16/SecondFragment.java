package com.example.pt16;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        var view = inflater.inflate(R.layout.fragment_second, container, false);
        TextView tv = view.findViewById(R.id.textView);
        tv.setOnClickListener(v -> {
            Navigation.findNavController(view).popBackStack();
        });
        return view;
    }
}