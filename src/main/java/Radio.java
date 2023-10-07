public class Radio {
    public String name;
    public int currentRadioStation; // номер текущей радиостанции
    public int maxRadioStation = 9;
    public int minRadioStation = 0;
    public int currentVolume; // громкость звука
    public int maxVolume = 100;
    public int minVolume = 0;


    // для громкости
    public int getMaxVolume() {
        return maxVolume;
    }

//    public void setMaxVolume(int maxVolume) {
//        this.maxVolume = maxVolume;
//    }

    public int getMinVolume() {
        return minVolume;
    }

//    public void setMinVolume(int minVolume) {
//        this.minVolume = minVolume;
//    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void pressPlusVolume() {
        setCurrentVolume(currentVolume + 1);
    }

    public void pressMinusVolume() {
        setCurrentVolume(currentVolume - 1);
    }


    // для станции
    public int getMaxRadioStation() {
        return maxRadioStation;
    }

//    public void setMaxRadioStation(int maxRadioStation) {
//        this.maxRadioStation = maxRadioStation;
//    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

//    public void setMinRadioStation(int minRadioStation) {
//        this.minRadioStation = minRadioStation;
//    }

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

    public void pressNextStation() {
        if (currentRadioStation >= maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void pressPrevStation() {
        if (currentRadioStation <= minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }
}