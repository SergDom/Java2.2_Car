package Animals;

import java.util.Objects;

public class flyingBirds extends Birds {
    private String moving;

    public flyingBirds(String name, int age, String environment, String moving) {
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
        flyingBirds flyingBirds = (flyingBirds) o;
        return Objects.equals(getName(), flyingBirds.getName());
    }


    @Override
    public String toString() {
        return "Птицы летающие: " + super.toString() + " " + moving;
    }
}


