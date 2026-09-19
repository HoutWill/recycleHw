package com.example.pt16;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.pt16.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime() );

            v.setPadding(systemBars.left,
                    systemBars.top,
                    systemBars.right,
                    systemBars.bottom);
            return insets;
        });

        binding.rootLayout.setOnClickListener(v -> {
            hideKeyboard();
        });

        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvHello.setText("Hello Android");
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        binding.cbJava.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull CompoundButton buttonView, boolean isChecked) {
                var message = isChecked ? "Java is checked" : "Java is unchecked";
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

        binding.containerRadioButton.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull RadioGroup group, int checkedId) {
                var message = "";
                if (checkedId == R.id.rdMale) {
                    message = "You are a male.";
                } else {
                    message = "You are a female";
                }
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });

        binding.btnSubmit.setOnClickListener(view -> {
            hideKeyboard();
            var message = "";
            /*
            if (binding.cbJava.isChecked()) {
                message += "Java ";
            }

            if (binding.cbKotlin.isChecked()) {
                message += " Kotlin";
            }

            if (binding.cbCsharp.isChecked()) {
                message += " C#\n";
            }

            var selectedGender = binding.containerRadioButton.getCheckedRadioButtonId();
            if (selectedGender == R.id.rdMale) {
                message += "You are a males";
            } else {
                message += "You are a female";
            }
            */

            message += "Username: " + binding.etUsername.getText().toString();
            message += "\nPassword: " + binding.etPwd.getText().toString();

            Snackbar.make(binding.getRoot(), message, Snackbar.LENGTH_INDEFINITE)
                    .setAction("OK", v -> {

                    }).show();
        });

        addTextInputListener();
    }

    private void validateButtonSubmit() {
        if (binding.etUsername.getText().toString().isEmpty() || binding.etPwd.getText().toString().isEmpty()) {
            binding.btnSubmit.setEnabled(false);
        } else {
            binding.btnSubmit.setEnabled(true);
        }
    }

    private void addTextInputListener() {
        TextWatcher handleTextChange = new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                validateButtonSubmit();
            }
        };

        binding.etUsername.addTextChangedListener(handleTextChange);

        binding.etPwd.addTextChangedListener(handleTextChange);
    }

    // Inside your Activity
    private void hideKeyboard() {
        // Find the currently focused view, so we can grab the correct window token from it.
        View view = this.getCurrentFocus();

        // If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(this);
        }

        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}

class Test implements TextWatcher {

    @Override
    public void afterTextChanged(Editable s) {

    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }
}