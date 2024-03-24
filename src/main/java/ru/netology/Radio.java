package ru.netology;

public class Radio {

    private int countStation = 20;
    private int minStation = 0;
    private int maxStation = 9;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation = getCurrentStation();
    private int currentVolume;

    public Radio(int countStation) {
        this.countStation = countStation;

    }
    public Radio() {
        countStation = 10;
    }
    public int getMinStation() {
        return minStation;
    }

    public int getCountStation() {
        return countStation;
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getMaxStation() {
        return maxStation;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextStationAfterMax() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void setPrevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    public void setIncreaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void setDecreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}