package com.nzavod.oop1.mycomplex;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public  void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    @Override
    public String toString(){
        if (real !=0 && imag !=0){
            return Double.toString(real) + ((imag>0) ? "+" + Double.toString(imag) + "i" : Double.toString(imag) + "i");
        }
        else if(real!=0 && imag ==0){
            return Double.toString(real);

        }
        else if(real == 0 && imag !=0) {
            return (imag > 0) ? Double.toString(imag) + "i" : Double.toString(imag) + "i";
        }
        else
            return "0";
    }

    public boolean isReal(){
        return real != 0.0;
    }
    public boolean isImaginary(){
        return imag != 0.0;
    }
    public boolean equals(double real, double imag){
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex obj) {
        return obj.equals(this.real, this.imag);
    }
    public double magnitude(){
        return Math.sqrt(Math.pow(real,2) + Math.pow(imag,2));
    }
    public double argument(){
        return Math.atan2(real,imag);
    }
    public MyComplex add( MyComplex right){
        real = real + right.getReal();
        imag = imag + right.getImag();
        return this;
    }
    public MyComplex addNew( MyComplex right){
        return new MyComplex(this.real + right.getReal(),
                this.imag + right.getImag());
    }
    public MyComplex substract( MyComplex right){
        real = real - right.getReal();
        imag = imag - right.getImag();
        return this;
    }
    public MyComplex substractNew( MyComplex right){
        return new MyComplex(this.real - right.getReal(),
                this.imag - right.getImag());
    }
    public MyComplex multiply( MyComplex right){
        double real1 = real;
        double imag1 = imag;
        real = (real1 * right.getReal() + (-1) *  imag1 * right.getImag());
        imag = (imag1 * right.getReal() + real1 * right.getImag());
        return this;
    }
    public MyComplex divide( MyComplex right){
        double real1 = real;
        double imag1 = imag;
        real = (real1 * right.real + imag1 * right.imag) /
                (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        imag = (right.real * imag1 - real1 * right.imag) /
                (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        return  this;
    }
    public MyComplex conjugate( ){
        return new MyComplex(real, (-1.0) * imag);
    }


}
