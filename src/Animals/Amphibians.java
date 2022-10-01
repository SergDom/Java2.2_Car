package Animals;

public class Amphibians extends Animals {

    public Amphibians(String name, int age, String environment) {

        super(name, age, environment);
    }


    public void hunt() {
        System.out.println("Охочушь за насекомыми");
    }

    @Override
    void eat() {
        System.out.println("Я ем мошек");
    }

    @Override
    void go() {
        System.out.println("Я хожу по воде и суше");
    }

    @Override
    public String toString() {
        return "Земноводные: " + super.toString();
    }
}
