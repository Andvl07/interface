package tourist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Менеджер для управления списком туристических фирм.
 */
class TravelAgencyManager {
    private List<TravelAgency> agencies;

    /**
     * Конструктор для создания объекта менеджера.
     */
    public TravelAgencyManager() {
        this.agencies = new ArrayList<>();
    }

    /**
     * Добавляет туристическую фирму в список.
     * @param agency Туристическая фирма для добавления.
     */
    public void addAgency(TravelAgency agency) {
        this.agencies.add(agency);
    }

    /**
     * Сортирует список туристических фирм по прибыли за текущий год.
     */
    public void sortByProfit() {
        ProfitComparatorImpl comparator = new ProfitComparatorImpl();
        Collections.sort(agencies, comparator::compare);
    }

    /**
     * Выводит информацию о всех туристических фирмах в списке.
     */
    public void printAgencies() {
        for (TravelAgency agency : agencies) {
            System.out.println(agency);
        }
    }
}
