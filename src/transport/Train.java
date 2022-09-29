package transport;

public class Train extends Transport {
    double cost;
    double time;
    String departure;
    String arrival;
    int quantityWagon;


    public Train(String brand, String model, int productionYear, String country, String color, double maxSpeed, double cost) {
        super(brand, model, productionYear, country, color, maxSpeed);

        if (cost < 0) {
            System.out.println("Укажите стоимость проезда");
        } else {
            this.cost = cost;
        }

        if (time < 0) {
            System.out.println("Укажите время");
        } else {
            this.time = time;
        }

        if (departure == null || departure.isEmpty()) {
            this.departure = "default";
        } else {
            this.departure = departure;
        }

        if (arrival == null || arrival.isEmpty()) {
            this.arrival = "default";
        } else {
            this.arrival = arrival;
        }

        if (quantityWagon < 0) {
            System.out.println("Укажите количество вагон");
        } else {
            this.quantityWagon = quantityWagon;
        }
    }

    public double getCost() {
        return cost;
    }

    public double getTime() {
        return time;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public int getQuantityWagon() {
        return quantityWagon;
    }
}
