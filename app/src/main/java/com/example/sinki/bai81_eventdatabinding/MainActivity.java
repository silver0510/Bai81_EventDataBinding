package com.example.sinki.bai81_eventdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.sinki.bai81_eventdatabinding.databinding.ActivityMainBinding;
import com.example.sinki.model.TemperatureData;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        MainActivityPresenter presenter = new MainActivityPresenter(MainActivity.this);
        TemperatureData temp = new TemperatureData("100");

        binding.setTemp(temp);
        binding.setPresenter(presenter);
    }

    @Override
    public void showData(TemperatureData temperatureData) {
        Toast.makeText(MainActivity.this,temperatureData.getCelsius(),Toast.LENGTH_SHORT).show();
    }
}
