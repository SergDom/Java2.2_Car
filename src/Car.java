import transport.Bus;
import transport.Car;
import transport.Train;


class CarTest {
        public static void main(String[] args) {
            Car one = new Car("Lada", "Grande", 2015, "Россия", null, 150,0,"AT","Седан","А123ВГ199",5,"Лето");
            Car.key one1= new Car.key("Установлен","Установлен");
            Car.insurance one2 = new Car.insurance(2022, 150.00, "AB12345CD");
            one.refill();

            Train lastochka = new Train("Ласточка", "B-901", 2011, "Россия", null, 301, 3500);

            Bus liaz = new Bus("ЛИАЗ", "677", 1963, "Россия", "оранжевый", 70);
            Bus maz = new Bus("ЛИАЗ", "677", 1963, "Россия", "оранжевый", 70);
            liaz.refill();



//            Car two = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 3.0,"AT","Универсал","Л780ВГ799",5,"Лето");
//            Car three = new Car("BMW", "Z8", 2021, null, "черный", 3.0,"MT","Хатчбек","К456ВГ750",2,"Зима");
//            Car four = new Car("Kia", "Sportage 4 поколение", 2018, "Южной Корее", "красный", 2.4,"AT","Внедорожник","К456ВГ333",5,"Лето");
//            Car five = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 1.6,"AT","Универсал","К456ВГ33",3,"Зима");
//            Car six = new Car();


            System.out.println(one);
            System.out.println(one1);
            System.out.println(one2);

            System.out.println(lastochka);

            System.out.println(liaz);

//            System.out.println(two);
//            System.out.println(three);
//            System.out.println(four);
//            System.out.println(five);
//            System.out.println(six);
        }
    }
