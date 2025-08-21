public class CurrencyRate{
    private Currency fromCurrency;
    private double price;
    private Currency toCurrency;

    public CurrencyRate(Currency fromCurrency, double price, Currency toCurrency){
        this.fromCurrency = fromCurrency;
        this.price = price;
        this.toCurrency = toCurrency;
    }


    public Currency getFromCurrency(){
        return this.fromCurrency;
    }

    public double getPrice(){
        return this.price;
    }

    public Currency getToCurrency(){
        return this.toCurrency;
    }


    public void setFromCurrency(Currency fromCurrency){
        this.fromCurrency = fromCurrency;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setToCurrency(Currency toCurrency){
        this.toCurrency = toCurrency;
    }

}
