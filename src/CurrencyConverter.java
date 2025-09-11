import java.util.Scanner;

//Currencies: US to Euros, British Pounds, Rupees, Mexican Pesos, and Canadian dollars

public class CurrencyConverter {
    public double USD2EUR(double Us ){
        return Us*0.85;
    }

    public double USD2GBP(double Us ){
        return Us*0.74;
    }
    public double USD2INR(double Us){
        return Us*88.10;
    }
    public double USD2MXN(double Us) {
        return Us * 18.6;
    }
    public double USD2CAD(double Us ){
        return Us*1.38;
    }
    public double EUR2USD(double Eu ){
        return Eu*1.17;
    }
    public double GBP2USD(double Br){
        return Br*1.36;
    }
    public double INR2USD(double Rp ){
        return Rp/88.10;
    }
    public double MXN2USD(double Pp ){
        return Pp/18.6;
    }
    public double CAD2USD(double Cd ){
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
                if (s.equals(currencyInput)){
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
                if (s.equals(currencyInput2)) {
                    running = false;
                    break;
                }
            }
            if (running) {
                System.out.println("Please enter a valid currency");
            }
        }
        for(int i = 0; i < currencyColl.length; i++){
            if(currencyInput.equals(currencyColl[i])){
                String currFrom = currencyColl[i];
                for(int j = 0; j < currencyColl.length; j++){
                    if(currencyInput2.equals(currencyColl[j])){
                        String currTo = currencyColl[j];
                    }
                }
            }
        }
    }
}