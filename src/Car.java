public class Car {
    String brand;
    String model;
    double engine;
    String color;
    int productionYear;
    String country;

    public Car(String brand, String model, int productionYear, String country, String color, double engine) {
        if (brand == null){
            this.brand = null; }
        else { this.brand = brand; }

        if (model == null){
            this.model = null; }
        else { this.model = model; }

        if (productionYear == 0){
            this.productionYear = 2000; }
        else { this.productionYear = productionYear; }

        if (country == null){
            this.country = null; }
        else { this.country = country; }

        if (color == null){
            this.color = "белого"; }
        else { this.color = color; }

        if (engine == 0) {
            this.engine = 1.7;
        } else {
            this.engine = engine;
        }

    }

    @Override
    public String toString() {
        return brand + " " + model + " " + productionYear + " года выпуска, " + "сборка в " + country + ", " + color + " цвета" +
                " ,обЪем двигателя " + engine + " литра.";
    }

    public static void main(String[] args) {
        Car one = new Car(null, "Grande", 2015, "Россия", null, 0);


        System.out.println(one);
    }

}