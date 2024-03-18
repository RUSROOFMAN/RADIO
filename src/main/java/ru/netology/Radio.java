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
        currentStation = newCurrentVolume;
    }

    public void setNextStation(int newSetNextStation) {               //Увелич.станции
        if (newSetNextStation < 9)

            currentStation = newSetNextStation + 1;
        else {
            currentStation = 0;
        }
    }

    public void setPrevRadioStation(int newSetPrevRadioStation) {       //Уменьш.станции
        if (newSetPrevRadioStation > 0) {

            currentStation = newSetPrevRadioStation - 1;
        } else {
            currentStation = newSetPrevRadioStation = 9;
        }
    }

    public void setMaxVolume(int newSetMaxVolume) {
        if (newSetMaxVolume > 100) {
            newSetMaxVolume = 100;
        }
        if (newSetMaxVolume > 0) {                    // максимум звук
            currentVolume = newSetMaxVolume;
        }
    }

    public void setMinVolume(int newSetMinVolume) {
        if (newSetMinVolume > 100) {
            return;
        }
        if (newSetMinVolume > 0) {
            currentVolume = newSetMinVolume;         //минимум звук
        }
    }
}