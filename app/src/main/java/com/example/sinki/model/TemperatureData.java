package com.example.sinki.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.sinki.bai81_eventdatabinding.BR;

/**
 * Created by Sinki on 9/15/2017.
 */

public class TemperatureData extends BaseObservable {
    private String celsius;
    private String fahrenheit;

    public TemperatureData(String celsius, String fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public TemperatureData(String celsius) {
        this.celsius = celsius;
    }

    public TemperatureData() {
    }
    @Bindable
    public String getCelsius() {
        return celsius;
    }
    @Bindable
    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius);
    }
    @Bindable
    public String getFahrenheit() {
        return fahrenheit;
    }
    @Bindable
    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
}
