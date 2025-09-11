import java.util.Scanner;

//Currencies: US to Euros, British Pounds, Rupees, Mexican Pesos, and Canadian dollars

public class CurrencyConverter {
    public static double USD2EUR(double Us ){
        return Us*0.85;
    }

    public static double USD2GBP(double Us ){
        return Us*0.74;
    }
    public static double USD2INR(double Us){
        return Us*88.10;
    }
    public static double USD2MXN(double Us) {
        return Us * 18.6;
    }
    public static double USD2CAD(double Us ){
        return Us*1.38;
    }
    public static double EUR2USD(double Eu ){
        return Eu*1.17;
    }
    public static double GBP2USD(double Br){
        return Br*1.36;
    }
    public static double INR2USD(double Rp ){
        return Rp/88.10;
    }
    public static double MXN2USD(double Pp ){
        return Pp/18.6;
    }
    public static double CAD2USD(double Cd ){
        return Cd/1.38;
    }
    public static void main(String[] args) {
        //temp
        //1 INR = 0.011 USD
        //1 Mexican Peso = 0.054 USD
        //1 Euro = 1.17 USD
        //1 Pound = 1.35 USD
        //1 CAD = 0.72 USD
        String[] currencyColl = new String[6];
        currencyColl[0] = "USD";
        currencyColl[1] = "EUR";
        currencyColl[2] = "GBP";
        currencyColl[3] = "INR";
        currencyColl[4] = "MXN";
        currencyColl[5] = "CAD";
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Currency Converter System!");
        boolean running = true;
        String currencyInput = "";
        while (running) {
            System.out.println("What currency do you have? (USD, EUR, GBP, INR, MXN, or CAD)");
            currencyInput = input.nextLine();
            for (String s : currencyColl) {
                if (s.equalsIgnoreCase(currencyInput)){
                    running = false;
                    break;
                }
            }
            if (running) {
                System.out.println("Please enter a valid currency");
            }
        }
        System.out.println("Please enter an amount for conversion: ");
        double currencyAmount = input.nextDouble();
        String currencyInput2 = "";
        running = true;
        while (running) {
            System.out.println("What currency would you like to convert to? (USD, EUR, GBP, INR, MXN, or CAD)");
            currencyInput2 = input.nextLine();
            for (String s : currencyColl) {
                if (s.equalsIgnoreCase(currencyInput2)) {
                    running = false;
                    break;
                }
            }
            if (running) {
                System.out.println("Please enter a valid currency");
            }
        }
        if (!(currencyInput.equalsIgnoreCase("USD"))) {

        }
        if (currencyInput.equalsIgnoreCase("EUR")) {
            System.out.println(USD2EUR(currencyAmount));
        }
        if (currencyInput.equalsIgnoreCase("GBP")) {
            System.out.println(USD2GBP(currencyAmount));
        }
        if (currencyInput.equalsIgnoreCase("INR")) {
            System.out.println(USD2INR(currencyAmount));
        }
        if (currencyInput.equalsIgnoreCase("MXN")) {
            System.out.println(USD2MXN(currencyAmount));
        }
        if (currencyInput.equalsIgnoreCase("CAD")) {
            System.out.println(USD2CAD(currencyAmount));
        }
    }
}