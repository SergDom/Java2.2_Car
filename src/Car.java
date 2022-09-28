import transport.Car;

class CarTest {
        public static void main(String[] args) {
            Car one = new Car(null, "Grande", 2015, "Россия", null, 0,"AT","Седан","А123ВГ199",5,"Лето");
            Car.key one1= new Car.key("Установлен","Установлен");
            Car.insurance one2 = new Car.insurance(2022, 150.00, "12345");
//            Car two = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 3.0);
//            Car three = new Car("BMW", "Z8", 2021, null, "черный", 3.0);
//            Car four = new Car("Kia", "Sportage 4 поколение", 2018, "Южной Корее", "красный", 2.4);
//            Car five = new Car("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 1.6);
            Car six = new Car();


            System.out.println(one);
            System.out.println(one1);
            System.out.println(one2);

//            System.out.println(two);
//            System.out.println(three);
//            System.out.println(four);
//            System.out.println(five);
            System.out.println(six);
        }
    }
