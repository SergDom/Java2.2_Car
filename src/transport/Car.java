package transport;

public class Car {
    private String brand;
    private String model;
    double engine;
    String color;
    private int productionYear;
    String country;

    String gear;
    private String carBody;
    String licensePlate;
    private int seats;
    String tyre;


    public Car(String brand, String model, int productionYear, String country, String color, double engine, String gear, String carBody, String licensePlate, int seats, String tyre) {
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

        if (gear == null) {
            this.gear = "default";
        } else {
            this.gear = gear;
        }

        if (carBody == null) {
            this.carBody = "default";
        } else {
            this.carBody = carBody;
        }

        if (licensePlate.matches("^[А-Я]{1}\\d{3}[А-Я]{2}\\d{3}")) {
            this.licensePlate = licensePlate;
        } else {
            this.licensePlate = "Неправильно введен номер автомабиля";
        }

        if (seats <= 0 || seats > 8) {
            this.seats = Integer.parseInt("Неправильно указано количество мест");
        } else {
            this.seats = seats;
        }

        this.tyre = tyre;
        String session = "лето";
        if (tyre.equals(session)) {
            this.tyre = tyre;
        } else {
            this.tyre = "Смените резину на сезонную";
        }

    }

    public Car() {
        this.brand = "default";
        this.model = "default";
        this.productionYear = 2000;
        this.country = "default";
        this.color = "белый";
        this.engine = 1.7;
        this.gear = "default";
        this.carBody = "default";
        this.licensePlate = "Неправильно введен номер автомабиля";
        this.seats = Integer.parseInt("Неправильно указано количество мест");
        this.tyre = "Смените резину на сезонную";

    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + productionYear + " года выпуска, " + "сборка в " + country + ", " + color + " цвет" +
                " ,обЪем двигателя " + engine + " литра.";
    }
}