public class Radio {
    private int currentRadioStation;
    private int minRadioStation;
    private int maxRadioStation = 10;
    private int volume;
    private int minVolume;
    private int maxVolume = 100;

    // создаем конструктор объекта
    public Radio(int currentRadioStation, int maxRadioStation, int volume, int maxVolume) {
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.volume = volume;
        this.maxVolume = maxVolume;
    }

    // для радио станции
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void changeOnPreviousRadioStation() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }

    public void changeOnNextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation++;
    }

    // для громкости
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }

    public void volumeUpForOne() {

        if (volume == maxVolume) {
            this.volume = volume;
        }
        if (volume < maxVolume) {
            this.volume++;
        }
    }

    public void volumeDownForOne() {
        if (volume == minVolume) {
            this.volume = volume;
        }
        if (volume > minVolume) {
            this.volume--;
        }
    }
}