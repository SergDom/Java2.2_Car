package Animals;

public abstract class Mammals extends Animals {
    private int speed;


    public Mammals(String name, int age, String environment) {
        super(name, age, environment);
        setSpeed(speed);
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed=0;
            System.out.println("Я стою");
        } else {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    void eat() {
        System.out.println("Ем вкусную еду");
    }
    public void walk (){
        System.out.println("Я гуляю");
    }
    @Override
    public String toString() {
        return super.toString() + " скорость " + speed;
    }
}
