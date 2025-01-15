package bankclients;

import java.time.LocalDate;

/**
 * Реализация интерфейса Client.
 */
public class ClientImpl implements Client {
    private final String name;
    private final String surname;
    private final double depositAmount;
    private final LocalDate accountOpeningDate;

    /**
     * Конструктор класса ClientImpl.
     *
     * @param name Имя клиента
     * @param surname Фамилия клиента
     * @param depositAmount Размер вклада клиента
     * @param accountOpeningDate Дата открытия счета
     */
    public ClientImpl(String name, String surname, double depositAmount, LocalDate accountOpeningDate) {
        this.name = name;
        this.surname = surname;
        this.depositAmount = depositAmount;
        this.accountOpeningDate = accountOpeningDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public double getDepositAmount() {
        return depositAmount;
    }

    @Override
    public LocalDate getAccountOpeningDate() {
        return accountOpeningDate;
    }

     @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", depositAmount=" + depositAmount +
                ", accountOpeningDate=" + accountOpeningDate +
                '}';
    }
}
