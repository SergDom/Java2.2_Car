package transport;

public abstract class Transport {
    private String brand;
    private String model;
    final private int productionYear;
    final private String country;
    String color;
    double maxSpeed;

    public Transport(String brand, String model, int productionYear, String country, String color, double maxSpeed) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        setColor(color);
        setMaxSpeed(maxSpeed);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;

        }
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed <= 0) {
            System.out.println("Скорость не известна");
        } else {
            this.maxSpeed = maxSpeed;
        }
    }


    public abstract void refill();

    @Override
    public String toString() {
        return brand + " " + model + " " + productionYear + " года выпуска, " + "сборка в " + country + ", " + color + " цвет" + " Максимальная скорость " + maxSpeed;

    }
}