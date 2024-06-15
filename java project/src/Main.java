import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("Welcome to the Currency Converter");
        System.out.print("Enter amount in USD: ");
        double amount = scanner.nextDouble();

        System.out.println("Select target currency: ");
        System.out.println("1. EUR");
        System.out.println("2. GBP");
        System.out.println("3. INR");
        System.out.println("4. JPY");
        System.out.println("5. AUD");
        int choice = scanner.nextInt();

        String targetCurrency = "";
        switch (choice) {
            case 1:
                targetCurrency = "EUR";
                break;
            case 2:
                targetCurrency = "GBP";
                break;
            case 3:
                targetCurrency = "INR";
                break;
            case 4:
                targetCurrency = "JPY";
                break;
            case 5:
                targetCurrency = "AUD";
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        double convertedAmount = converter.convert(amount, "USD", targetCurrency);
        System.out.printf("%.2f USD is %.2f %s%n", amount, convertedAmount, targetCurrency);
    }
}
