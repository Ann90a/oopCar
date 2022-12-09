public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015,
                "Россия", "", 1.7);
        lada.welcomeMassage();
        Car audi = new Car("Audi", "A8 50L TDI quattro", 2020,
                "", "Черный", 3.0);
        audi.welcomeMassage();
        Car bmw = new Car("BMW", "Z8", 0,
                "null", "Черный", 3.0);
        bmw.welcomeMassage();
        Car kia = new Car("Kia", "Sportage 4-ого поколения", 2018,
                "Южная Корея", "", 2.4);
        kia.welcomeMassage();
        Car hyundai = new Car("Hyundai", "Avante", -2016,
                "Южная Корея", "Оранжевый", 1.6);
        hyundai.welcomeMassage();

    }
}