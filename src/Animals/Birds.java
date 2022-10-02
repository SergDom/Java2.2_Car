package Animals;

abstract public class Birds extends Animals {

    public Birds (String name, int age, String environment) {

        super(name, age, environment);
    }


    public void hunt() {
        System.out.println("Охочушь за жучками и паучками");
    }

}
