package transport;

import java.time.LocalDate;

public class Car extends Transport {
    double engine;
    String gear;
    private String carBody;
    String licensePlate;
    private int seats;
    String tyre;

    public static class key {
        private String remoteStartEngine;
        private String keylessAccess;


        public key(String remoteStartEngine, String keylessAccess) {
            if (remoteStartEngine == null || remoteStartEngine.isEmpty()) {
                this.remoteStartEngine = "нет авто-запуска";
            } else {
                this.remoteStartEngine = remoteStartEngine;
            }

            if (keylessAccess == null || keylessAccess.isEmpty()) {
                this.keylessAccess = "нет безключевого доступа";
            } else {
                this.keylessAccess = keylessAccess;
            }
        }

        public String getRemoteStartEngine() {
            return remoteStartEngine;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Автозапуск " + remoteStartEngine + " Безключевой доступ " + keylessAccess;

        }
    }

    public static class insurance {
        private int expirationDate;
        private double priceInsurance;
        private String numberInsurance;

        public insurance(int expirationDate, double priceInsurance, String numberInsurance) {
            if (expirationDate < LocalDate.now().getYear()) {
                System.out.println("Нужно оформить страховку");
            } else {
                this.expirationDate = expirationDate;
            }
            this.priceInsurance = priceInsurance;

            if (numberInsurance.matches("^\\w{9}")) {
                this.numberInsurance = numberInsurance;
            } else {
                this.numberInsurance = "Неправильный номер страховки";
            }
        }

        public int getExpirationDate() {

            return expirationDate;
        }

        public double getPriceInsurance() {

            return priceInsurance;
        }

        public String getNumberInsurance() {

            return numberInsurance;
        }

        @Override
        public String toString() {
            return "Полис дествителен до: " + expirationDate + " Цена полиса " + priceInsurance + " Номер полиса " + numberInsurance;
        }
    }

    public double getEngine() {
        return engine;
    }

    public String getGear() {
        return gear;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getTyre() {
        return tyre;
    }

    public Car(String brand, String model, int productionYear, String country, String color, double maxSpeed, double engine, String gear, String carBody, String licensePlate, int seats, String tyre) {
        super (brand,  model,  productionYear,  country,  color, maxSpeed);

        setEngine(engine);
        setGear(gear);
        setCarBody(carBody);


        if (licensePlate.matches("^[А-Я]{1}\\d{3}[А-Я]{2}\\d{3}")) {
            this.licensePlate = licensePlate;
        } else {
            this.licensePlate = "Неправильно введен номер автомобиля";
        }

        if (seats < 0 || seats > 8) {
            System.out.println("Укажите корректное количество мест");
        } else {
            this.seats = seats;
        }

        String session = "Лето";
        if (tyre.equalsIgnoreCase(session)) {
            this.tyre = tyre;
        } else {
            this.tyre = "Смените резину на сезонную";
        }

    }

//    public Car() {
//
//        this.engine = 1.7;
//        this.gear = "default";
//        this.carBody = "default";
//        this.licensePlate = "Неправильно введен номер автомобиля";
//        this.seats = 4;
//        this.tyre = "Смените резину на сезонную";
//
//    }


    public void setEngine(double engine) {
        if (engine == 0 || engine < 0) {
            this.engine = 1.7;
        } else {
            this.engine = engine;
        }
    }
    public void setGear(String gear) {
        if (gear == null || gear.isEmpty()) {
            this.gear = "default";
        } else {
            this.gear = gear;
        }
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        if (carBody == null || brand.isEmpty()) {
            this.carBody = "default";
        } else {
            this.carBody = carBody;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электро-парковках, если это электрокар.");
    }

    @Override
    public String toString() {
        return super.toString() + " Двигатель " + engine + " литра." + " Коробка передач " + gear + " Тип кузова " + carBody + " номер автомобиля "
                + licensePlate + " количетво мест " + seats + " резина " + tyre;

    }
}