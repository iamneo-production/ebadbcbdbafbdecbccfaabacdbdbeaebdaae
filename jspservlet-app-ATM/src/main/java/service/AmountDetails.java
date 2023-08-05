package service;



public class AmountDetails implements InterfaceClass {

    public double withdrawAmount(double a, double b) {
        return b-a;
    }

    public double  depositAmount(double a, double b) {
        return a+b;
    }

    public double accountBalance(double a) {
        return a;
    }

    
	
}
