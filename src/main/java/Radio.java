public class Radio {
    private int minStation = 0;
    private int maxStation;

    private int currentStation = 0;

    private int currentVolume = 0;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int defaultMaxStation = 9;

    private int countOfStation;

    // конструкторы Radio
    public Radio(int countOfStation) {
        this.maxStation = countOfStation - 1;
        this.countOfStation = countOfStation;
    }

    public Radio() {
        this.maxStation = defaultMaxStation;
        this.countOfStation = 10;
    }

    public int getCountOfStation() {
        return countOfStation;
    }

    public void setCountOfStation(int countOfStation) {
        this.countOfStation = countOfStation;
        this.maxStation = countOfStation - 1;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        }
        else currentStation++;
    }

    public void previousStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        }
        else currentStation--;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= minStation && station <= maxStation) {
            currentStation = station;
        }
    }

    public int getMinStation() {
        return minStation;
    }

//    public void setMinStation(int minStation) {
//        this.minStation = minStation;
//    }

    public int getMaxStation() {
        return maxStation;
    }

//    public void setMaxStation(int maxStation) {
//        this.maxStation = maxStation;
//    }


    // для громкости
    public int getMinVolume() {
        return minVolume;
    }

//    public void setMinVolume(int minVolume) {
//        this.minVolume = minVolume;
//    }

    public int getMaxVolume() {
        return maxVolume;
    }

//    public void setMaxVolume(int maxVolume) {
//        this.maxVolume = maxVolume;
//    }

    public void plusVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void minusVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        if (volume >= minVolume && volume <= maxVolume) {
            this.currentVolume = volume;
        }
    }
}