import java.util.ArrayList;
import java.util.List;

public class CurrencyRatesManager {
    private List<CurrencyRate> currencyRates;

    public CurrencyRatesManager(){
        this.currencyRates = new ArrayList<CurrencyRate>();
    }

    public void addCurrencyRate(CurrencyRate currencyRate){
        this.currencyRates.add(currencyRate);
    }

    public void addCurrencyRate(String fromName, String fromCode, double price, String toName, String toCode){
        Currency fromCurrency = new Currency(fromCode, fromName);
        Currency toCurrency = new Currency(toCode, toName);

        CurrencyRate currencyRate = new CurrencyRate(fromCurrency, price, toCurrency);
        CurrencyRate currencyRateReverse = new CurrencyRate(toCurrency, 1 / price, fromCurrency);

        this.currencyRates.add(currencyRate);
        this.currencyRates.add(currencyRateReverse);
    }

    public double getRate(String from, String to){
        return currencyRates.stream()
                .filter(currencyRate -> currencyRate.getFromCurrency().getName().equals(from) &&
                        currencyRate.getToCurrency().getName().equals(to))
                .map(CurrencyRate::getPrice)
                .findFirst()
                .orElse(0d);
    }

}
