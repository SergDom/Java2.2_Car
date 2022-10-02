package Animals;

public class Zoo {

    public static void main(String[] args) {

        Predators hyena = new Predators("Забияка", 10, "Савана", 15,"Падаль");
        Predators tiger = new Predators("Клыкастый", 5, "Савана", 45,"Мясо");
        Predators beer = new Predators("Лапастый", 7, "Лес", 30,"Мясо и ягоды");

        Herbivores gazelle = new Herbivores("Рогатая", 3, "Савана", 30,"Травка");
        Herbivores giraffe = new Herbivores("Длинношей", 5, "Савана", 26,"Листья");
        Herbivores horse = new Herbivores("Скакун", 6, "Прерия", 40,"Овес");


        Amphibians frog = new Amphibians("Квакушка", 3, "Болото");
        Amphibians snake = new Amphibians("Вертлявый", 1, "Болото");

        flyingBirds seagull = new flyingBirds("Голастая", 2, "Река", "Машу крыльями");
        flyingBirds albatross = new flyingBirds("Важный", 4, "Океан", "Планирую над водой");
        flyingBirds falcon = new flyingBirds("Стримительный", 6, "Горы", "Высоко летаю");


        notFlyingBirds peacock = new notFlyingBirds("Гордый", 3, "Парк", "Распускаю хвост и хожу");
        notFlyingBirds penguin = new notFlyingBirds("Королек", 7, "Льдина", "Первеваливаюсь с боку на бок");
        notFlyingBirds dodo = new notFlyingBirds("Курносая", 3, "Лес", "Бегаю и машу крыльями");

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(beer);
        System.out.println("======================");
        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println("======================");
        System.out.println(frog);
        System.out.println(snake);
        System.out.println("======================");
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
        System.out.println("======================");
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);

        Predators hyena2 = new Predators("Забияка", 11, "Савана", 15,"Падаль");
        System.out.println(hyena.equals(hyena2));



    }
}
