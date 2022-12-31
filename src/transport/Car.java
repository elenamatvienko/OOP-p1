package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberSeats;
    private boolean summerTires;
    private Key key;

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VALUE = 1.5;
    private static final String DEFAULT_COLOR = "белый";
    private static final int DEFAULT_YEAR = 2020;
    private static final int DEFAULT_SEATS = 5;

    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String transmission, String bodyType, String registrationNumber,
               int numberSeats, boolean summerTires, boolean remoteStartEngine, boolean keyLessEntry) {
        if (brand == null || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }

        if (model == null || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }

        if (year <= 0) {
            this.year = DEFAULT_YEAR;
        } else {
            this.year = year;
        }

        if (country == null || country.isBlank()) {
            this.country = DEFAULT_VALUE;
        } else {

            this.country = country;
        }

        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = DEFAULT_VALUE;
        } else {
            this.bodyType = bodyType;
        }

        if (numberSeats <= 0) {
            this.numberSeats = DEFAULT_SEATS;
        } else {
            this.numberSeats = numberSeats;
        }

        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setSummerTires(summerTires);
        setKey(remoteStartEngine, keyLessEntry);
    }

    class Key {
        private final boolean remoteStartEngine;
        private final boolean keyLessEntry;

        public Key(boolean remoteStartEngine, boolean keyLessEntry) {
            this.remoteStartEngine = remoteStartEngine;
            this.keyLessEntry = keyLessEntry;
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeyLessEntry() {
            return keyLessEntry;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStartEngine=" + remoteStartEngine +
                    ", keyLessEntry=" + keyLessEntry +
                    '}';
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }


    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VALUE;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank()) {
            this.transmission = DEFAULT_VALUE;
        } else {
            this.transmission = transmission;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank()) {
            this.registrationNumber = DEFAULT_VALUE;
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public void changeTires(int month) {
        if (month >= 4 && month <= 10) {
            setSummerTires(true);
        } else {
            setSummerTires(false);
        }
    }
    public void setKey (boolean remoteStartEngine, boolean keyLessEntry) {
        this.key = new Key(remoteStartEngine, keyLessEntry);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberSeats=" + numberSeats +
                ", summerTires=" + summerTires +
                ", key=" + key +
                '}';
    }
}


