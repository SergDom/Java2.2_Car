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

        Flying_birds seagull = new Flying_birds("Голастая", 2, "Река", "Машу крыльями");
        Flying_birds albatross = new Flying_birds("Важный", 4, "Океан", "Планирую над водой");
        Flying_birds falcon = new Flying_birds("Стримительный", 6, "Горы", "Высоко летаю");


        Not_flying_birds peacock = new  Not_flying_birds("Гордый", 3, "Парк", "Распускаю хвост и хожу");
        Not_flying_birds penguin = new  Not_flying_birds("Королек", 7, "Льдина", "Первеваливаюсь с боку на бок");
        Not_flying_birds dodo = new  Not_flying_birds("Курносая", 3, "Лес", "Бегаю и машу крыльями");

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
