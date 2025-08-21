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

    public double getRate(String from, String to){
        return currencyRates.stream()
                .filter(currencyRate -> currencyRate.getFromCurrency().equals(from) &&
                        currencyRate.getToCurrency().equals(to))
                .map(CurrencyRate::getPrice)
                .findFirst()
                .orElse(0d);
    }

}
