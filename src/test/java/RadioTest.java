import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class RadioTest {
    Radio radio = new Radio();

    // тесты для станции
    @Test
    public void comeOverLastRadioStation() {
        radio.setCurrentRadioStation(9);
        radio.pressNextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void comeUnderFirstRadioStation() {
        radio.setCurrentRadioStation(0);
        radio.pressPrevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        radio.setCurrentRadioStation(4);
        radio.pressNextStation();

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        radio.setCurrentRadioStation(7);
        radio.pressPrevStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void OverFirstRadioStation() {
        radio.setCurrentRadioStation(11);
        radio.getMaxRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void UnderFirstRadioStation() {
        radio.setCurrentRadioStation(-1);
        radio.getMinRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    // тесты для громкости
    @Test
    public void volumeOverMax() {
        radio.setCurrentVolume(101);
        radio.getMaxVolume();

        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDownUnderMin() {
        radio.setCurrentVolume(-1);
        radio.getMinVolume();

        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void plusVolume() {
        radio.setCurrentVolume(56);
        radio.pressPlusVolume();

        int expected = 57;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minusVolume() {
        radio.setCurrentVolume(5);
        radio.pressMinusVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
