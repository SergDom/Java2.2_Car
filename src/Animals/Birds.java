package Animals;

public class Birds extends Animals {



    public Birds (String name, int age, String environment) {

        super(name, age, environment);
    }


    public void hunt() {
        System.out.println("Охочушь за жучками и паучками");
    }

    @Override
    void eat() {
        System.out.println("Я ем насекомых");
    }

    @Override
    void go() {
        System.out.println("Я хожу по воде и суше");
    }

    @Override
    public String toString() {
        return "Птицы: " + super.toString();
    }
}
