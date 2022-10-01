package Animals;

abstract class Animals {
    private String name;
    private int age;
    private final String environment;

    public Animals(String name, int age, String environment) {
        setName(name);
        setAge(age);
        if (environment == null || environment.isBlank()) {
            this.environment = "Некорректные данные";
        } else {
            this.environment = environment;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "Нечто";
        } else {
            this.name = name;
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Некорректные данные");
        } else {
            this.age = age;
        }
    }

    public String getEnvironment() {
        return environment;
    }

    public void sleep() {
        System.out.println("Я сплю");
    }
    abstract void eat();
    abstract void go();

    @Override
    public String toString() {
        return  name + ", возраст " + age + ", среда обитания " + environment;
    }
}
