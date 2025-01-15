package bankclients;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Главный класс для демонстрации сортировки клиентов.
 */
public class Programm2 {

    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new ClientImpl("Иван", "Петров", 1500.00, LocalDate.of(2023, 5, 10)));
        clients.add(new ClientImpl("Мария", "Сидорова", 2300.50, LocalDate.of(2023, 1, 15)));
        clients.add(new ClientImpl("Петр", "Иванов", 1500.00, LocalDate.of(2023, 3, 1)));
        clients.add(new ClientImpl("Анна", "Смирнова", 3000.75, LocalDate.of(2022, 12, 20)));
        clients.add(new ClientImpl("Ирина", "Козлова", 1000.00, LocalDate.of(2023, 5, 10)));
        clients.add(new ClientImpl("Олег", "Иванов", 2300.50, LocalDate.of(2023, 2, 15)));


        System.out.println("Исходный список клиентов:");
        clients.forEach(System.out::println);

        System.out.println("\nСортировка по размеру вклада (по возрастанию):");
        ClientSorter.sortByDepositAmount(clients).forEach(System.out::println);

        System.out.println("\nСортировка по размеру вклада (по убыванию):");
        ClientSorter.sortByDepositAmountReversed(clients).forEach(System.out::println);


        System.out.println("\nСортировка по дате открытия счета:");
        ClientSorter.sortByAccountOpeningDate(clients).forEach(System.out::println);

        System.out.println("\nСортировка по фамилии:");
        ClientSorter.sortBySurname(clients).forEach(System.out::println);

        System.out.println("\nСортировка по нескольким критериям (вклад по убыванию, дата по возрастанию, фамилия):");
        ClientSorter.sortByMultipleCriteria(clients).forEach(System.out::println);
    }
}
