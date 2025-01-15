package tourist;

/**
 * Реализация интерфейса {@link ProfitComparator}.
 * Сравнивает туристические фирмы по их прибыли.
 */
class ProfitComparatorImpl implements ProfitComparator {

    /**
     * {@inheritDoc}
     */
    @Override
    public int compare(TravelAgency a, TravelAgency b) {
        return Double.compare(a.getProfitForCurrentYear(), b.getProfitForCurrentYear());
    }
}

