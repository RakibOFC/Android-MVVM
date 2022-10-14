package com.rakibofc.androidmvvm.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.rakibofc.androidmvvm.databinding.ActivityMainBinding;
import com.rakibofc.androidmvvm.viewmodels.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        mainViewModel.startTimer();

        mainViewModel.getLiveData().observe(this, mainData -> {
            binding.tvDroidInfo.setText(mainData.getDroidInfo());
            binding.tvCurrentDate.setText(mainData.getCrrDate());
        });

        binding.btnToggle.setOnClickListener(v -> {
            // Update android information
            mainViewModel.droidInfo(binding.tvDroidInfo.getText().toString());
        });
    }
}