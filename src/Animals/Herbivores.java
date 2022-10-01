package Animals;

public class Herbivores extends Mammals {
    String foodType;
    public Herbivores(String name, int age, String environment, String foodType) {
        super(name, age, environment);

        setFoodType(foodType);
    }
    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        if (foodType == null || foodType.isEmpty()) {
            this.foodType = "Нет еды (((";
        } else {
            this.foodType = foodType;
        }
    }

    public void grazing (){
        System.out.println("Я гуляю по лугу");
    }
    @Override
    void go() {
        System.out.println("Я хожу по суше");
    }

    @Override
    public String toString() {
        return "Травоядные: " + super.toString() + ", Тип еды " + foodType;
    }
}
