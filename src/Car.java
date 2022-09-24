public class Car {
    String brand;
    String model;
    double engine;
    String color;
    int productionYear;
    String country;

    public Car(String brand, String model, int productionYear, String country, String color, double engine) {
        if (brand == null){
            this.brand = "default"; }
        else { this.brand = brand; }

        if (model == null){
            this.model = "default"; }
        else { this.model = model; }

        if (productionYear <= 0){
            this.productionYear = 2000; }
        else { this.productionYear = productionYear; }

        if (country == null){
            this.country = "default"; }
        else { this.country = country; }

        if (color == null){
            this.color = "белый"; }
        else { this.color = color; }

        if (engine == 0) {
            this.engine = 1.7;
        } else {
            this.engine = engine;
        }

    }

    @Override
    public String toString() {
        return brand + " " + model + " " + productionYear + " года выпуска, " + "сборка в " + country + ", " + color + " цвет" +
                " ,обЪем двигателя " + engine + " литра.";
    }

    public static void main(String[] args) {
        Car one = new Car(null, "Grande", 2015, "Россия", null, 0);
        Car two = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 3.0);
        Car three = new Car("BMW", "Z8", 2021, null, "черный", 3.0);
        Car four = new Car("Kia", "Sportage 4 поколение", 2018, "Южной Корее", "красный", 2.4);
        Car five = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 1.6);


        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
    }

}