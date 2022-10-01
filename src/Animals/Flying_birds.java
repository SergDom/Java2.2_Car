package Animals;

import java.util.Objects;

public class Flying_birds extends Birds {
    String moving;

    public Flying_birds(String name, int age, String environment, String moving) {
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

    public void fly() {
        System.out.println("Я могу летать");
    }

    @Override
    void eat() {
        System.out.println("Я ем насекомых и мышей");
    }

    @Override
    void go() {
        System.out.println("Я хожу и летаю где хочу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying_birds flying_birds = (Flying_birds) o;
        return Objects.equals(getName(), flying_birds.getName());
    }


    @Override
    public String toString() {
        return "Птицы летающие: " + super.toString() + " " + moving;
    }
}


