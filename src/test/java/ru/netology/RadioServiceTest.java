package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {
    @Test
    public void setNextRadioStationInOne() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStation(){
        Radio radio = new Radio();
        radio.setNextStation(2);
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void setNextStationMoreNine(){
        Radio radio = new Radio();
        radio.setNextStation(9);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setNextRadioStationMoreNine() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStationLessZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStation() {
        Radio radio = new Radio();
        radio.setPrevRadioStation(9);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStationInZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setPrevRadioStationMinOne() {
        Radio radio = new Radio();
        radio.setPrevRadioStation(-1);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNextMaxVolumeMore100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNextMaxVolumeLessZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void setNextVolumeLevel() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNextVolumeLevelLessZero() {
        Radio radio = new Radio();
        radio.setMaxVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void setMaxVolumeMore100() {
        Radio radio = new Radio();
        radio.setMaxVolume(101);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setMinVolume() {
        Radio radio = new Radio();
        radio.setMinVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void setMinVolumeMore100() {
        Radio radio = new Radio();
        radio.setMinVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void setMinVolumeMoreInZero() {
        Radio radio = new Radio();
        radio.setMinVolume(4);
        int expected = 4;
        int actual= radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);

    }
}