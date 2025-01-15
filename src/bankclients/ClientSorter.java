package bankclients;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс для сортировки списка клиентов.
 */
public class ClientSorter {

    /**
     * Сортирует список клиентов по размеру вклада.
     *
     * @param clients Список клиентов
     * @return Отсортированный список клиентов по размеру вклада (по возрастанию)
     */
    public static List<Client> sortByDepositAmount(List<Client> clients) {
        return clients.stream()
                .sorted(Comparator.comparingDouble(Client::getDepositAmount))
                .collect(Collectors.toList());
    }

     /**
     * Сортирует список клиентов по размеру вклада в обратном порядке.
     *
     * @param clients Список клиентов
     * @return Отсортированный список клиентов по размеру вклада (по убыванию)
     */
    public static List<Client> sortByDepositAmountReversed(List<Client> clients) {
        return clients.stream()
                .sorted(Comparator.comparingDouble(Client::getDepositAmount).reversed())
                .collect(Collectors.toList());
    }


    /**
     * Сортирует список клиентов по дате открытия счета.
     *
     * @param clients Список клиентов
     * @return Отсортированный список клиентов по дате открытия счета (по возрастанию)
     */
    public static List<Client> sortByAccountOpeningDate(List<Client> clients) {
        return clients.stream()
                .sorted(Comparator.comparing(Client::getAccountOpeningDate))
                .collect(Collectors.toList());
    }

    /**
     * Сортирует список клиентов по фамилии.
     *
     * @param clients Список клиентов
     * @return Отсортированный список клиентов по фамилии (в лексикографическом порядке)
     */
    public static List<Client> sortBySurname(List<Client> clients) {
        return clients.stream()
                .sorted(Comparator.comparing(Client::getSurname))
                .collect(Collectors.toList());
    }

    /**
     * Сортирует список клиентов по нескольким критериям: размер вклада (по убыванию), затем дата открытия счета (по возрастанию), затем фамилия (в лексикографическом порядке).
     *
     * @param clients Список клиентов
     * @return Отсортированный список клиентов
     */
    public static List<Client> sortByMultipleCriteria(List<Client> clients) {
      return clients.stream()
              .sorted(Comparator.<Client, Double>comparing(Client::getDepositAmount).reversed()
                      .thenComparing(Client::getAccountOpeningDate)
                      .thenComparing(Client::getSurname)
              )
             .collect(Collectors.toList());
    }

}
