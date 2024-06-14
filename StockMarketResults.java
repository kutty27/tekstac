import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class StockMarketResults {

    public static void main(String[] args) {
        // List of stock symbols
        String[] stocks = {"AAPL", "GOOGL", "AMZN", "MSFT", "TSLA"};

        // Create a map to hold stock prices
        Map<String, Double> stockPrices = new HashMap<>();

        // Generate random stock prices
        Random random = new Random();
        for (String stock : stocks) {
            double price = 100 + (1000 - 100) * random.nextDouble(); // Prices between 100 and 1000
            stockPrices.put(stock, price);
        }

        // Print stock prices
        System.out.println("Stock Market Results:");
        for (Map.Entry<String, Double> entry : stockPrices.entrySet()) {
            System.out.printf("%s: $%.2f\n", entry.getKey(), entry.getValue());
        }
    }
}
