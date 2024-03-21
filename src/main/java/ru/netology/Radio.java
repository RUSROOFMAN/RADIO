package ru.netology;

public class Radio {

    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() { //get VOLUME
        return currentVolume;
    }

    public int getCurrentStation() { //get STATION
        return currentStation;
    }

    public void setNextStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 0) {
            currentStation = newCurrentStation;
        }
        if (newCurrentStation < 9) {
            newCurrentStation = currentStation;
        }
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        }
        currentStation = newCurrentStation;
    }

    public void setPrevStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 0) {
            currentStation = newCurrentStation;
        }
        if (newCurrentStation < 9) {
            newCurrentStation = currentStation;
        }
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        }
        currentStation = newCurrentStation;
    }

    public void setVolume(int newSetVolume) {
        if (newSetVolume > 100) {
            newSetVolume = 100;
        }
        if (newSetVolume < 0) {
            newSetVolume = 0;
        }
        if (newSetVolume > 0) {
            currentVolume = newSetVolume;
        }
        if (newSetVolume < 100) {
            currentStation = newSetVolume;
        }
    }
}