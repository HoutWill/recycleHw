package com.example.pt16;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.pt16.databinding.FragmentFirstBinding;

import org.jspecify.annotations.Nullable;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(requireContext().getApplicationContext(), "F1 onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(requireContext().getApplicationContext(), "F1 onViewCreated", Toast.LENGTH_SHORT).show();
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        binding.btn.setOnClickListener(v -> {
            binding.tvHello.setText("Hello Fragment!!!");

            var action = FirstFragmentDirections.actionFirstToSecond(10);

            Navigation.findNavController(binding.getRoot())
                    .navigate(action);
        });
        return binding.getRoot();
    }
}