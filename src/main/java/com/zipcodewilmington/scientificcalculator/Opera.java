package com.zipcodewilmington.scientificcalculator;

public class Opera {







    //////////////////////////////   METHODS - SHARMIN  ///////////////////////////////////////
    //Addition Method
    public static double addition(double a, double b) {
        return a + b;}
    //Subtraction Method
    public static double subtract(double a, double b) {
        return a - b;
    }
    //Multiplication Method
    public static double multiply(double a, double b) {
        return a * b;
    }
    //Division Method
    public static double divide(double a, double b) {
        return a / b;
    }
    //Radians to Degrees
    public static double degrees(double a, double b) {
        double degrees = 0;
        double radians;
        return degrees;
    }
    //Degrees to Radians
    public static double radians(double a, double b) {
        double radians = 0;
        double degrees;
        return radians;}



    ///////////////////////////////   METHODS DEEPTI   ///////////////////////////////////////////


    // Square
    public static double square(double x2) {
        double square = Math.pow(x2, 2);
        return square;
    }
    //Square Root
    public static double squareRoot(double x1) {
        double result = Math.sqrt(x1);
        return result;
    }
    //Exponential
    public static double exponentiation(double x1,double x2) {
        double exponent = Math.pow(x1,x2);
        return exponent;
    }
    //Factorial
    public static long factorial(long n1) {
        long result = 1L;
        for (long i = 1; i <= n1; i++) {
            result *= i;
        }
        return result;
    }
    //Log Value
    public static double logFunction ( double n1){
        double logvalue = Math.log(n1);
        return logvalue;
    }
    //Log Function
    public static double logFunction10 ( double n2){
        double log10result = Math.log10(n2);
        return log10result;
    }
    //Anti Log
    public static double antiLog ( double n1){
        double y = Math.log(n1); // Calculate the natural log of x
        double inverselog = Math.exp(y);
        //        double y = Math.log(n1) / Math.log(base); // Calculate log base 'base' of x
        //        double inverselog = Math.pow(base, y);
        return inverselog;
    }

    //Sine
    public static double sin(int deg){
        double sineValue = Math.sin(Math.toRadians(deg));
        return sineValue;
    }
    //Cosine
    public static double cos(int deg){
        double cosValue = Math.cos(Math.toRadians(deg));
        return cosValue;
    }
    //Tangent
    public static double tan(int deg){
        double tanValue = Math.tan(Math.toRadians(deg));
        return tanValue;
}


public static int invSin(double radians){
    int invSin = (int)Math.toDegrees(Math.asin(radians));
    return invSin;
}

public static int invCos(double radians){
    int invCos = (int)Math.toDegrees(Math.acos(radians));
    return invCos;
}



public static int invTan(double radians){
    int invTan = (int)Math.toDegrees(Math.atan(radians));
    return invTan;
}

//
//////////////////////////////////////////////////////////////////////////////////////////////


}