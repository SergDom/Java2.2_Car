package Animals;

public class Zoo {

    public static void main(String[] args) {

        Predators giena = new Predators("Забияка", 10, "Савана", "Падаль");
        giena.setSpeed(50);


        Herbivores giraff = new Herbivores("Длинношей", 5, "Савана", "Листья");
        giraff.setSpeed(20);

        Amphibians frog = new Amphibians("Квакушка", 3, "Болото");

        System.out.println(giena);
        System.out.println(giraff);
        System.out.println(frog);



    }
}
