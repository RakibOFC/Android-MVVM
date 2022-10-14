package com.rakibofc.androidmvvm.model;

public class MainData {

    private String droidInfo;
    private String crrDate;

    public MainData(String droidInfo, String crrDate) {
        this.droidInfo = droidInfo;
        this.crrDate = crrDate;
    }

    public String getDroidInfo() {
        return droidInfo;
    }

    public void setDroidInfo(String droidInfo) {
        this.droidInfo = droidInfo;
    }

    public String getCrrDate() {
        return crrDate;
    }

    public void setCrrDate(String crrDate) {
        this.crrDate = crrDate;
    }
}
