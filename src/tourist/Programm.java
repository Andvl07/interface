package tourist;

/**
 * Главный класс, демонстрирующий работу с туристическими фирмами.
 */
public class Programm {
    /**
     * Главный метод программы.
     * @param args Аргументы командной строки.
     */
    public static void main(String[] args) {
        TravelAgencyManager manager = new TravelAgencyManager();

        manager.addAgency(new SimpleTravelAgency("Рога и копыта", 15000.0));
        manager.addAgency(new SimpleTravelAgency("Вокруг света", 30000.0));
        manager.addAgency(new SimpleTravelAgency("Морской бриз", 10000.0));
        manager.addAgency(new SimpleTravelAgency("Солнечный тур", 25000.0));

        System.out.println("Турфирмы до сортировки:");
        manager.printAgencies();

        manager.sortByProfit();

        System.out.println("\nТурфирмы после сортировки по прибыли:");
        manager.printAgencies();
    }
}
