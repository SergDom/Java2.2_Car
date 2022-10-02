package Animals;

import java.util.Objects;

public class Herbivores extends Mammals {
    private String foodType;
    public Herbivores(String name, int age, String environment, int speed, String foodType) {
        super(name, age, environment, speed);

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores herbivores = (Herbivores) o;
        return Objects.equals(getName(), herbivores.getName());
    }


    @Override
    public String toString() {
        return "Травоядные: " + super.toString() + ", Тип еды " + foodType;
    }
}
