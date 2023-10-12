import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class RadioTest {

    // для радио станции
    @Test
    void shouldSetCurrentRadioStationBackIfStationIsMin() {
        Radio radio = new Radio(0);
        radio.setCurrentStation(radio.getCountOfStation());

        int expected = 0;
        Assertions.assertEquals(expected, radio.getCountOfStation());
    }

    @Test
    void shouldSetCurrentRadioStationBackIfStationIsBetweenMinAndMax() {
        Radio radio = new Radio(40);
        radio.setCurrentStation(radio.getCountOfStation());

        int expected = radio.getCurrentStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldChangeOnPreviousRadioStation() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(radio.getCountOfStation());
        radio.previousStation();

        int expected = radio.getCurrentStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldChangeOnPreviousRadioStationIfStationIsMin() {
        Radio radio = new Radio(0);
        radio.setCurrentStation(radio.getCountOfStation());
        radio.previousStation();

        int expected = radio.getMaxStation();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldChangeOnNextRadioStationIfStationIsMax() {
        Radio radio = new Radio(200);
        radio.setCurrentStation(radio.getCountOfStation());
        radio.nextStation();

        int expected = radio.getMaxStation();
        Assertions.assertEquals(expected, radio.getCountOfStation() -1);
    }

    @Test
    void shouldChangeOnNextRadioStationIfStationIsMaxWithMin() {
        Radio radio = new Radio(150);
//        radio.getMaxStation();
        radio.setCurrentStation(radio.getMaxStation());
        radio.nextStation();

        int expected = radio.getMinStation();
        Assertions.assertEquals(expected, radio.getMinStation());
    }

    @Test
    void shouldCheckIfDefaultStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(radio.getCountOfStation());

        int expected = radio.getCountOfStation();
        Assertions.assertEquals(expected, radio.getCountOfStation());
    }


    // для громкости
    @Test
    void shouldSetVolumeIfVolumeIsUnderMaxAndPlusVolume() {
        Radio radio = new Radio(15);
        radio.setCurrentVolume(radio.getCountOfStation());
        radio.plusVolume();

        int expected = 16;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsOverMinAndMinusVolume() {
        Radio radio = new Radio(15);
        radio.setCurrentVolume(radio.getCountOfStation());
        radio.minusVolume();

        int expected = 14;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        Radio radio = new Radio(100);
        radio.setCurrentVolume(radio.getCountOfStation());
        radio.plusVolume();

        int expected = radio.getMaxVolume();
        Assertions.assertEquals(expected, radio.getCountOfStation());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio(0);
        radio.setCurrentVolume(radio.getCountOfStation());
        radio.minusVolume();

        int expected = radio.getMinVolume();
        Assertions.assertEquals(expected, radio.getCountOfStation());
    }
}