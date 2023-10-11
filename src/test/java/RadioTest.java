import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class RadioTest {

    // для радио станции
    @Test
    void shouldSetCurrentRadioStationBackIfStationIsUnderMin () {
        Radio radio = new Radio(-1);
        radio.setCurrentRadioStation(radio.getAmountOfStation());
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationBackIfStationIsMoreThanMax () {
        Radio radio = new Radio(11);
        radio.setCurrentRadioStation(radio.getAmountOfStation());
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnPreviousRadioStationIfStationIsMin() {
        Radio radio = new Radio(0);
        radio.setCurrentRadioStation(radio.getAmountOfStation());
        radio.changeOnPreviousRadioStation();
        int expected = 10;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotChangeOnNextRadioStationIfStationIsMax() {
        Radio radio = new Radio(); 
        radio.setCurrentRadioStation(radio.getAmountOfStation());
        radio.changeOnNextRadioStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }


    // для громкости
    @Test
    void shouldSetVolumeIfVolumeIsOverMax() {
        Radio radio = new Radio(101);
        radio.setVolume(radio.getAmountOfStation());
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsUnderMin() {
        Radio radio = new Radio(-1);
        radio.setVolume(radio.getAmountOfStation());
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        Radio radio = new Radio(100);
        radio.setVolume(radio.getAmountOfStation());
        int expected = 100;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio(0);
        radio.setVolume(radio.getAmountOfStation());
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());
    }
}