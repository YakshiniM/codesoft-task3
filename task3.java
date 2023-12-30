import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Currency Selection
        System.out.print("Enter the base currency: ");
        String baseCurrency = scanner.nextLine();

        System.out.print("Enter the target currency: ");
        String targetCurrency = scanner.nextLine();

        // Fetch real-time exchange rates (Not implemented in this example; use a real API)
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        if (exchangeRate == -1) {
            System.out.println("Invalid currency selection. Exiting...");
            System.exit(0);
        }

        // Amount Input
        System.out.print("Enter the amount to convert from " + baseCurrency + " to " + targetCurrency + ": ");
        double amountToConvert = scanner.nextDouble();

        // Currency Conversion
        double convertedAmount = amountToConvert * exchangeRate;

        // Display Result
        System.out.println("Converted Amount: " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }

    // Placeholder method to simulate fetching real-time exchange rates
    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
        // In a real application, you would use an API to get the actual exchange rate
        // For simplicity, we are using fixed rates here. Replace this with actual API calls.
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.85;  // 1 USD = 0.85 EUR
        } else if (baseCurrency.equals("USD") && targetCurrency.equals("GBP")) {
            return 0.75;  // 1 USD = 0.75 GBP
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return 1.18;  // 1 EUR = 1.18 USD
        } else if (baseCurrency.equals("GBP") && targetCurrency.equals("USD")) {
            return 1.33;  // 1 GBP = 1.33 USD
        } else {
            return -1;  // Invalid currency pair
        }
    }
}
