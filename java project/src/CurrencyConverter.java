
public class CurrencyConverter {
    private CurrencyRates rates;

    public CurrencyConverter() {
        rates = new CurrencyRates();
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        double fromRate = rates.getRate(fromCurrency);
        double toRate = rates.getRate(toCurrency);
        return (amount / fromRate) * toRate;
    }
}
