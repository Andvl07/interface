package bankclients;
import java.time.LocalDate;

/**
 * Интерфейс, представляющий клиента банка.
 */
public interface Client {

    /**
     * Возвращает имя клиента.
     *
     * @return имя клиента
     */
    String getName();

    /**
     * Возвращает фамилию клиента.
     *
     * @return фамилия клиента
     */
    String getSurname();

    /**
     * Возвращает размер вклада клиента.
     *
     * @return размер вклада
     */
    double getDepositAmount();

    /**
     * Возвращает дату открытия счета.
     *
     * @return дата открытия счета
     */
    LocalDate getAccountOpeningDate();
}
