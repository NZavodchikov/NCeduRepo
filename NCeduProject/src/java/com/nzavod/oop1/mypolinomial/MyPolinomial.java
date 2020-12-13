package com.nzavod.oop1.mypolinomial;


public class MyPolinomial {
    private double[] coeffs;

    public MyPolinomial(double ... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree(){
        return coeffs.length -1;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("");
        for(int i = coeffs.length -1; i >= 0; i--){
            if(i != 0) {
                if(i == 1){
                    builder.append(coeffs[i] + "x + ");
                    continue;
                }
                builder.append(coeffs[i] + "x^" + i + " + ");
            }
            else{
                builder.append(coeffs[i]);
            }
        }
        return  builder.toString();

    }
    public double evaluate(double x){
        double result = coeffs[0];
        for (int i = 1; i < coeffs.length; i++){
            result = result + coeffs[i] * Math.pow(x,i);
        }
        return result;
    }
    public MyPolinomial add (MyPolinomial right){
        MyPolinomial myPolinomial=null;
        if(coeffs.length > right.coeffs.length){
            double [] newCoeffs = new  double[coeffs.length];
            int count = 0;
            while (count < right.coeffs.length){
                newCoeffs[count] = coeffs[count] + right.coeffs[count];
                count++;
            }
            while (count < coeffs.length){
                newCoeffs[count] = coeffs[count];
                count++;
            }
            myPolinomial = new MyPolinomial(newCoeffs);
        }
        else if(coeffs.length < right.coeffs.length ){
            double [] newCoeffs = new  double[right.coeffs.length];
            int count = 0;
            while (count < coeffs.length){
                newCoeffs[count] = coeffs[count] + right.coeffs[count];
                count++;
            }
            while (count < right.coeffs.length){
                newCoeffs[count] = right.coeffs[count];
                count++;
            }
            myPolinomial = new MyPolinomial(newCoeffs);
        }
        else if(coeffs.length == right.coeffs.length){
            double [] newCoeffs = new  double[right.coeffs.length];
            int count = 0;
            while (count < coeffs.length){
                newCoeffs[count] = coeffs[count] + right.coeffs[count];
                count++;
            }
            myPolinomial = new MyPolinomial(newCoeffs);

        }
        return  myPolinomial;


    }
    public MyPolinomial multiply(MyPolinomial right){
         double[] result = new double[coeffs.length + right.coeffs.length - 1];
        for (int i = coeffs.length-1; i >= 0; i--) {
            for (int j = right.coeffs.length-1; j >= 0; j--) {
                result[i + j] += coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolinomial(result);
    }



}
