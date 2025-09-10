import java.util.Scanner;

//Currencies: US to Euros, British Pounds, Rupees, Mexican Pesos, and Canadian dollars

public class CurrencyConverter {
    public double US2Euros(double Us ){
        return Us*0.85;
    }

    public double US2BritishPound(double Us ){
        return Us*0.74;
    }
    public double US2Rupees(double Us){
        return Us*88.10;
    }
    public double US2Pesos(double Us) {
        return Us * 18.6;
    }
    public double US2Canadian(double Us ){
        return Us*1.38;
    }
    public double Euros2US(double Eu ){
        return Eu*1.17;
    }
    public double BritishPounds2US(double Br){
        return Br*1.36;
    }
    public double Rupees2US(double Rp ){
        return Rp/88.10;
    }
    public double Pesos2US(double Pp ){
        return Pp/18.6;
    }
    public double Canadians2US(double Cd ){
        return Cd/1.17;
    }
    public static void main(String[] args) {
        //temp
        //1 INR = 0.011 USD
        //1 Mexican Peso = 0.054 USD
        //1 Euro = 1.17 USD
        //1 Pound = 1.35 USD
        //1 CAD = 0.72 USD

    }
}