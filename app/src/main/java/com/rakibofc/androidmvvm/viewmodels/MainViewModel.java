package com.rakibofc.androidmvvm.viewmodels;

import android.os.Build;
import android.os.Handler;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.rakibofc.androidmvvm.model.MainData;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<MainData> mainLiveData;
    private final SimpleDateFormat dateFormat;
    private final long oneSecondInMillis = 1000;

    public MainViewModel() {

        mainLiveData = new MutableLiveData<>();
        dateFormat = new SimpleDateFormat("hh:mm:ss aa", Locale.ENGLISH);

        MainData mainData = new MainData("Android " + Build.VERSION.RELEASE, dateFormat.format(new Date()));
        this.mainLiveData.setValue(mainData);
    }

    public LiveData<MainData> getLiveData() {
        return mainLiveData;
    }

    public void droidInfo(String droidInfo) {
        MainData mainData = mainLiveData.getValue();

        if (mainData != null) {

            String text = droidInfo.startsWith("API") ? "Android " + Build.VERSION.RELEASE : "API " + Build.VERSION.SDK_INT;

            mainData.setDroidInfo(text);
            mainLiveData.setValue(mainData);
        }
    }

    private final Handler handler = new Handler();
    private final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            MainData mainData = mainLiveData.getValue();

            if (mainData != null) {
                mainData.setCrrDate(dateFormat.format(new Date()));
                mainLiveData.setValue(mainData);
            }
            handler.postDelayed(this, oneSecondInMillis);
        }
    };

    @Override
    protected void onCleared() {
        super.onCleared();
        handler.removeCallbacks(runnable);
    }

    public void startTimer() {
        handler.postDelayed(runnable, oneSecondInMillis);
    }
}
