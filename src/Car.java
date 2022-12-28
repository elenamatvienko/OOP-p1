public class Car {
    private String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;


    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        if (brand == null) {
            this.brand = "default";
        }
        this.model = model;
        if (model == null) {
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        this.color = color;
        if (color == null) {
            this.color = "белый";
        }
        this.year = year;
        if (year <= 0) {
            this.year = 2000;
        }
        this.country = country;
        if (country == null) {
            this.country = "default";
        }
    }

    @Override
    public String toString() {
        return "brand: " + brand + " model: " + model + " engineVolume: " + engineVolume + " color: " + color + " year: " + year + " country: " + country;
    }
}


