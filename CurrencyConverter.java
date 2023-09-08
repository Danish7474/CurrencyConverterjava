import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount, exchangeRate, convertedAmount;
        String fromCurrency, toCurrency;

        // Define exchange rates (for example: USD to EUR)
        double usdToEurRate = 0.85;

        System.out.print("Enter the amount: ");
        amount = scanner.nextDouble();

        System.out.print("Enter the source currency (e.g., USD): ");
        fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency (e.g., EUR): ");
        toCurrency = scanner.next().toUpperCase();

        // Perform currency conversion
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            exchangeRate = usdToEurRate;
            convertedAmount = amount * exchangeRate;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            exchangeRate = 1 / usdToEurRate;
            convertedAmount = amount * exchangeRate;
        } else {
            System.out.println("Unsupported currency conversion.");
            scanner.close();
            return;
        }

        System.out.println(amount + " " + fromCurrency + " is equal to " + convertedAmount + " " + toCurrency);

        scanner.close();
    }
}
