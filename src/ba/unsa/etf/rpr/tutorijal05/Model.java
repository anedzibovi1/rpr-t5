package ba.unsa.etf.rpr.tutorijal05;

public class Model {

    public double calculate(double number1, double number2, String operator) {
        switch (operator) {
            case "+" :
                return number1+number2;
            case "-" :
                return number1-number2;
            case "/" :
                if(number2==0) return 0;
                return number1/number2;
            case "x" :
                return number1*number2;
            case "." :
                return number1+number2/100;
        }
        return 0;
    }

    public double calculate1(double number1, String operator) {
        switch (operator) {
            case "%" :
                return number1/100;
        }
        return 0;
    }

}
