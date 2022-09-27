package transport;

public class Car {
    String brand;
    String model;
    double engine;
    String color;
    int productionYear;
    String country;

    public Car(String brand, String model, int productionYear, String country, String color, double engine) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (engine == 0) {
            this.engine = 1.7;
        } else {
            this.engine = engine;
        }
    }

    public Car() {
        this.brand = "default";
        this.model = "default";
        this.productionYear = 2000;
        this.country = "default";
        this.color = "белый";
        this.engine = 1.7;
    }


    @Override
    public String toString() {
        return brand + " " + model + " " + productionYear + " года выпуска, " + "сборка в " + country + ", " + color + " цвет" +
                " ,обЪем двигателя " + engine + " литра.";
    }
}