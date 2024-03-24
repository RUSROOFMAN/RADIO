package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {
    @Test
    public void shouldSetCurrentStationTestManual() {
        Radio rad = new Radio(20, 0, 19, 100, 0);
        Assertions.assertEquals(20, rad.getQuantityRadioStance());
        Assertions.assertEquals(0, rad.getMinStation());
        Assertions.assertEquals(19, rad.getMaxStation());
        Assertions.assertEquals(100, rad.getMaxVolume());
        Assertions.assertEquals(0, rad.getMinVolume());
    }

    @Test
    public void shouldSetCurrentStationTestAuto() {
        Radio rad = new Radio();
        Assertions.assertEquals(10, rad.getQuantityRadioStance());
        Assertions.assertEquals(0, rad.getMinStation());
        Assertions.assertEquals(9, rad.getMaxStation());
        Assertions.assertEquals(100, rad.getMaxVolume());
        Assertions.assertEquals(0, rad.getMinVolume());
    }
    @Test
    public void shouldSetCurrentStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(5);
        int expected = 5;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationIfMore() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentStationIfLess() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(99);
        int expected = 99;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeIfMore() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeIfLess() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationAfterMax() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.setNextStationAfterMax();
        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationAfterMaxIf() {
        Radio rad = new Radio();
        rad.setCurrentStation(1);
        rad.setNextStationAfterMax();
        int expected = 2;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(2);
        rad.setPrevStation();
        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationIf() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.setPrevStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(50);
        rad.setIncreaseVolume();
        int expected = 51;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeIf() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.setIncreaseVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(57);
        rad.setDecreaseVolume();
        int expected = 56;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeIF() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.setDecreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}