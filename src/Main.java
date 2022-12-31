import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car(null, "Granta", 1.7, "желтый",0, "Россия", "автоматическая", "седан", "а001аа61", 4, true, true, true);
//        lada.brand = "Lada ";
//        lada.model = "Granta";
//        lada.engineVolume = 1.7;
//        lada.color = "желтый";
//        lada.year = 2015;
//        lada.country = "Россия";

        Car audi = new Car("Audi", null, 3.0,"черный", 2020, "Германия", "автоматическая", "седан", "а001аа61", 4, true, true, true);
//        audi.brand = "Audi";
//        audi.model = "A8 50 L TDI quattro";
//        audi.engineVolume = 3.0;
//        audi.color = "черный";
//        audi.year = 2020;
//        audi.country = "Германия";

        Car bmv = new Car("BMW", "Z8", 3.0, "черный",0,"Германия", "автоматическая", "седан", "а001аа61", 4, true, true, true);
//        bmv.brand = "BMW";
//        bmv.model = "Z8";
//        bmv.engineVolume = 3.0;
//        bmv.color = "черный";
//        bmv.year = 2021;
//        bmv.country = "Германия";

        Car kia = new Car("Kia", "Sportage 4-го поколения",2.4, null, 2018,"Южная Корея", "автоматическая", "седан", "а001аа61", 4, true, true, true );
//        kia.brand = "Kia";
//        kia.model = "Sportage 4-го поколения";
//        kia.engineVolume = 2.4;
//        kia.color = "красный";
//        kia.year = 2018;
//        kia.country = "Южная Корея";

        Car hyundai  = new Car("Hyundai", "Avante",1.6, "оранжевый", 2016, null, "автоматическая", "седан", "а001аа61", 4, true, true, true);
//        hyundai.brand = "Hyundai";
//        hyundai.model = "Avante";
//        hyundai.engineVolume = 1.6;
//        hyundai.color = "оранжевый";
//        hyundai.year = 2016;
//        hyundai.country = "Южная Корея";

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmv);
        System.out.println(kia);
        System.out.println(hyundai);


    }
}