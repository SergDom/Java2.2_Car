package Animals;

public class Zoo {

    public static void main(String[] args) {

        Predators giena = new Predators("Забияка", 10, "Савана", "Падаль");
        giena.setSpeed(15);


        Herbivores giraff = new Herbivores("Длинношей", 5, "Савана", "Листья");
        giraff.setSpeed(20);

        Amphibians frog = new Amphibians("Квакушка", 3, "Болото");

        Flying_birds chaika = new Flying_birds("Голастая", 2, "Река", "Машу кряльями");


        Not_flying_birds pavlin = new  Not_flying_birds("Гордый", 3, "Парк", "Распускаю хвост и хожу");

        System.out.println(giena);

        System.out.println(giraff);

        System.out.println(frog);

        System.out.println(chaika);

        System.out.println(pavlin);




    }
}
