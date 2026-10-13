package com.example.pt16;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pt16.adapters.MovieAdapter;
import com.example.pt16.databinding.FragmentMovieBinding;
import com.example.pt16.models.MovieModel;

public class MovieFragment extends Fragment {

    FragmentMovieBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMovieBinding.inflate(inflater, container, false);
        binding.movieRC.setLayoutManager(new LinearLayoutManager(container.getContext()));

        var adapter = new MovieAdapter(MovieModel.generateData());
        binding.movieRC.setAdapter(adapter);

        return binding.getRoot();
    }
}
