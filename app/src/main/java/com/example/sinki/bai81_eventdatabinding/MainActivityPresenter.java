package com.example.sinki.bai81_eventdatabinding;

import com.example.sinki.model.TemperatureData;

/**
 * Created by Sinki on 9/15/2017.
 */

public class MainActivityPresenter {
    private MainActivityContract.View view;
    public MainActivityPresenter(MainActivityContract.View view)
    {
        this.view = view;
    }
    public void onShowData(TemperatureData temperatureData)
    {
        this.view.showData(temperatureData);
    }
}
