import java.util.Scanner;

//Currencies: US to Euros, British Pounds, Rupees, Mexican Pesos, and Canadian dollars

public class CurrencyConverter {
    int USDollars;
    int Euros;
    int BritishPound;
    int Rupees;
    int MexicanPesos;
    int CanadianDollars;
    public static void main(String[] args) {
        //1 INR = 0.011 USD
        //1 Mexican Peso = 0.054 USD
        //1 Euro = 1.17 USD
        //1 Pound = 1.35 USD
        //1 CAD = 0.72 USD
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Currency Converter System!");
        System.out.println("What currency do you have? (USD, EUR, GBP, INR, MXN, or CAD)");
        String currencyInput = input.nextLine();
        System.out.println("Please enter an amount for conversion: ");
        double currencyAmount = input.nextDouble();
        System.out.println("What currency would you like to convert to? (USD, EUR, GBP, INR, MXN, or CAD)");
    }
}