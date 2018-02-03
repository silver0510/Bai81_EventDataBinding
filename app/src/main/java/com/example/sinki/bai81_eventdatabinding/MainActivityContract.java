package com.example.sinki.bai81_eventdatabinding;

import com.example.sinki.model.TemperatureData;

/**
 * Created by Sinki on 9/15/2017.
 */

public interface MainActivityContract {
    public interface Presenter
    {
        void onShowDat(TemperatureData temperatureData);
    }
    public interface View
    {
        void showData(TemperatureData temperatureData);
    }
}
