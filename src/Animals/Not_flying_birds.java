package Animals;

import java.util.Objects;

public class Not_flying_birds extends Birds {
    String moving;

    public Not_flying_birds(String name, int age, String environment, String moving) {
        super(name, age, environment);
        setMoving(moving);
    }

    public String getMoving() {
        return moving;
    }

    public void setMoving(String moving) {

        if (moving == null || moving.isEmpty()) {
            this.moving = "не могу двигаться, что делать ?";
        } else {
            this.moving = moving;
        }
    }

    public void walk() {
        System.out.println("Я хожу где хочу");
    }

    @Override
    void eat() {
        System.out.println("Я ем насекомых и травку");
    }

    @Override
    void go() {
        System.out.println("Я перемещаюсь по земле");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Not_flying_birds not_flying_birds = (Not_flying_birds) o;
        return Objects.equals(getName(), not_flying_birds.getName());
    }
    @Override
    public String toString() {
        return "Птицы нелетающие: " + super.toString() + " " + moving;
    }

}
