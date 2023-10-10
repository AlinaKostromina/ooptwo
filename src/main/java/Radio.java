public class Radio {
    private int currentRadioStation;
    private int minRadioStation;
    private int maxRadioStation = 10;
    private int volume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int amountOfStation;
    private int defaultAmountOfStation = 10;

    // создаем конструктор объекта
    public Radio(int amountOfStation) {
        this.amountOfStation = currentRadioStation;
    }

    public Radio() {
        this.defaultAmountOfStation = currentRadioStation;
    }

    // для радио станции
    public int getAmountOfStation() {
        return amountOfStation;
    }

    public int setAmountOfStation() {
        return amountOfStation;
    }


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
    }

    public void changeOnNextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
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

//    public void volumeUpForOne() {
//
//        if (volume == maxVolume) {
//            this.volume = volume;
//        }
//        if (volume < maxVolume) {
//            this.volume++;
//        }
//    }
//
//    public void volumeDownForOne() {
//        if (volume == minVolume) {
//            this.volume = volume;
//        }
//        if (volume > minVolume) {
//            this.volume--;
//        }
//    }
}