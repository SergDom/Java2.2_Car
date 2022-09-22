public class Car {
    String brand;
    String model;
    double engine;
    String color;
    int productionYear;
    String country;

    public Car (String brand, String model, int productionYear,  String country, String color, double engine){
        this.brand=brand;
        this.model=model;
        this.productionYear=productionYear;
        this.country=country;
        this.color=color;
        this.engine=engine;
    }

    @Override
    public String toString() {
        return  brand + " " + model + " " + productionYear + " года выпуска, " + "сборка в " + country + ", " + color + " цвета" +
                " ,обЪем двигателя " + engine + " литра.";
    }

    public static void main(String[] args) {
Car one = new Car("Lada", "Grande", 2015, "Россия", "желтого", 1.7);


        System.out.println(one);
    }

}