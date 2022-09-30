package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String country, String color, double maxSpeed) {
        super(brand, model, productionYear, country, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке.");
    }
    @Override
    public String toString() {
        return "Автобус: " + super.toString();

    }
}
