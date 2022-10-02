package Animals;

import java.util.Objects;

public class notFlyingBirds extends Birds {
    private String moving;

    public notFlyingBirds(String name, int age, String environment, String moving) {
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
        notFlyingBirds notFlyingBirds = (notFlyingBirds) o;
        return Objects.equals(getName(), notFlyingBirds.getName());
    }
    @Override
    public String toString() {
        return "Птицы нелетающие: " + super.toString() + " " + moving;
    }

}
