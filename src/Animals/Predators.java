package Animals;

public class Predators extends Mammals {
    String foodType;

    public Predators(String name, int age, String environment, String foodType) {
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

    public void hunt (){
        System.out.println("Охочушь за всем живым");
    }
    @Override
    void go() {
        System.out.println("Я хожу и ищю жертву");
    }
    @Override
    public String toString() {
        return "Хищники: " + super.toString() + ", Тип еды " + foodType;
    }

}
