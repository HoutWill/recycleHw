package com.example.pt16;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pt16.adapters.PlanetAdapter;
import com.example.pt16.databinding.FragmentRecyclerViewBinding;
import com.example.pt16.models.PlanetModel;


public class RecyclerViewFragment extends Fragment {

    FragmentRecyclerViewBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRecyclerViewBinding.inflate(inflater, container, false);
        binding.planetRC.setLayoutManager(new LinearLayoutManager(container.getContext()));

        var adapter = new PlanetAdapter(PlanetModel.generateData());
        binding.planetRC.setAdapter(adapter);

        return binding.getRoot();
    }
}