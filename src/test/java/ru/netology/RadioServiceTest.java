package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {
    @Test
    public void setNextRadioStationLessZero() {
        Radio radio = new Radio();
        radio.setNextStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStationMoreNine() {
        Radio radio = new Radio();
        radio.setNextStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStationMoreZero() {
        Radio radio = new Radio();
        radio.setNextStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextRadioStationZero() {
        Radio radio = new Radio();
        radio.setNextStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setNextRadioStationLessNine() {
        Radio radio = new Radio();
        radio.setNextStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationLessZero() {
        Radio radio = new Radio();
        radio.setPrevStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationZero() {
        Radio radio = new Radio();
        radio.setPrevStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationMoreNine() {
        Radio radio = new Radio();
        radio.setPrevStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationMoreZero() {
        Radio radio = new Radio();
        radio.setPrevStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevRadioStationLessNine() {
        Radio radio = new Radio();
        radio.setPrevStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMoreOneHundred() {
        Radio radio = new Radio();
        radio.setVolume(101);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
        ;
    }

    @Test
    public void setVolumeLessZero() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMoreZero() {
        Radio radio = new Radio();
        radio.setVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeLessOneHundred() {
        Radio radio = new Radio();
        radio.setVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}