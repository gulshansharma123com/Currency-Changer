import java.util.HashMap;
import java.util.Map;

public class CurrencyRates {
    private Map<String, Double> rates;

    public CurrencyRates() {
        rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("EUR", 0.85);
        rates.put("GBP", 0.75);
        rates.put("INR", 74.0);
        rates.put("JPY", 110.0);
        rates.put("AUD", 1.35);
    }

    public double getRate(String currency) {
        return rates.getOrDefault(currency, 1.0);
    }
}
