public class CurrencyConverter {
    public static void main(String[] args) {
        CurrencyRatesManager currencyRatesManager = new CurrencyRatesManager();
        currencyRatesManager.addCurrencyRate("USD", "Доллар", 0.8582d, "EUR", "Евро");
        currencyRatesManager.addCurrencyRate("USD", "Доллар", 2.9738d, "BYN", "Бел. рубль");
        currencyRatesManager.addCurrencyRate("USD", "Доллар", 80.4609d, "RUB", "Рос. рубль");
        currencyRatesManager.addCurrencyRate("USD", "Доллар", 3.6493d, "PLN", "Польский злотый");
        currencyRatesManager.addCurrencyRate("USD", "Доллар", 7.2113d, "CNY", "Китайский юань");

        currencyRatesManager.addCurrencyRate("EUR", "Евро", 3.4652d,"BYN", "Бел. рубль");
        currencyRatesManager.addCurrencyRate("EUR", "Евро", 93.7554d,"RUB", "Рос. рубль");
        currencyRatesManager.addCurrencyRate("EUR", "Евро", 4.2522d,"PLN", "Польский злотый");
        currencyRatesManager.addCurrencyRate("EUR", "Евро", 8.4026d, "CNY", "Китайский юань");

        currencyRatesManager.addCurrencyRate("BYN", "Бел. рубль", 27.0563d, "RUB", "Рос. рубль");
        currencyRatesManager.addCurrencyRate("BYN", "Бел. рубль", 1.2271d, "PLN", "Польский злотый");
        currencyRatesManager.addCurrencyRate("BYN", "Бел. рубль", 2.4248d, "CNY", "Китайский юань");

        currencyRatesManager.addCurrencyRate("RUB", "Рос. рубль", 0.0454d, "PLN", "Польский злотый");
        currencyRatesManager.addCurrencyRate("RUB", "Рос. рубль", 0.0897d, "CNY", "Китайский юань");

        currencyRatesManager.addCurrencyRate("PLN", "Польский злотый", 1.9761d, "CNY", "Китайский юань");
        //USD-EUR-BYN-RUB-PLN

        InputHandler inputHandler = new InputHandler();


        System.out.print("Введите название исходной валюты:");
        String fromCurrencyName = inputHandler.inputString();

        System.out.print("Введите название целевой валюты:");
        String toCurrencyName = inputHandler.inputString();

        System.out.print("Введите сумму:");
        double price = inputHandler.inputDouble();

        System.out.print(" " + price + " " + fromCurrencyName + " -> "
                + price * currencyRatesManager.getRate(fromCurrencyName, toCurrencyName) + " " + toCurrencyName);

    }
}