package tourist;

/**
 * Простая реализация интерфейса {@link TravelAgency}.
 * Представляет собой турфирму с названием и прибылью за текущий год.
 */
class SimpleTravelAgency implements TravelAgency {
    private String name;
    private double profitForCurrentYear;

    /**
     * Конструктор для создания объекта турфирмы.
     * @param name Название турфирмы.
     * @param profitForCurrentYear Прибыль турфирмы за текущий год.
     */
    public SimpleTravelAgency(String name, double profitForCurrentYear) {
        this.name = name;
        this.profitForCurrentYear = profitForCurrentYear;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getProfitForCurrentYear() {
        return profitForCurrentYear;
    }


    /**
     * Переопределенный метод toString для удобного вывода информации о турфирме.
     * @return Строковое представление объекта турфирмы.
     */
    @Override
    public String toString() {
        return "TravelAgency{" +
                "name='" + name + '\'' +
                ", profitForCurrentYear=" + profitForCurrentYear +
                '}';
    }
}
