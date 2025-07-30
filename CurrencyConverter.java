import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usdToInr = 83.12;
        double eurToInr = 90.30;
        double gbpToInr = 105.50;
        double inrToUsd = 1 / usdToInr;
        double inrToEur = 1 / eurToInr;
        double inrToGbp = 1 / gbpToInr;

        while (true) {
            System.out.println("\n----- Currency Converter -----");
            System.out.println("1. USD to INR");
            System.out.println("2. EUR to INR");
            System.out.println("3. GBP to INR");
            System.out.println("4. INR to USD");
            System.out.println("5. INR to EUR");
            System.out.println("6. INR to GBP");
            System.out.println("7. Exit");
            System.out.print("Choose option (1-7): ");
            
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Exiting Currency Converter. Thank you!");
                break;
            }

            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            double result;

            switch (choice) {
                case 1:
                    result = amount * usdToInr;
                    System.out.println("USD " + amount + " = INR " + result);
                    break;
                case 2:
                    result = amount * eurToInr;
                    System.out.println("EUR " + amount + " = INR " + result);
                    break;
                case 3:
                    result = amount * gbpToInr;
                    System.out.println("GBP " + amount + " = INR " + result);
                    break;
                case 4:
                    result = amount * inrToUsd;
                    System.out.println("INR " + amount + " = USD " + result);
                    break;
                case 5:
                    result = amount * inrToEur;
                    System.out.println("INR " + amount + " = EUR " + result);
                    break;
                case 6:
                    result = amount * inrToGbp;
                    System.out.println("INR " + amount + " = GBP " + result);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}
