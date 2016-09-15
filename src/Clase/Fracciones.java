/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author Payares
 */
public class Fracciones {

    private int num;
    private int den;

    public Fracciones(int numerador, int denominador) throws Denominador0Exception {
        this.num = numerador;
        this.den = denominador;

        if (denominador == 0) {
            throw new Denominador0Exception();
        }
    }

   
    public int getNumerador() {
        return num;
    }

    public int getDenominador() {
        return den;
    }

    public void setNumerador(int numerador) {
        this.num = numerador;
    }

    public void setDenominador(int denominador) {
        this.den = denominador;
    }

    public Fracciones sumar( Fracciones f2) throws Denominador0Exception {
         Fracciones f;
        int num, den;

        num = this.num * f2.den + this.den * f2.num;
        den = this.den * f2.den;
        f = new  Fracciones(num, den);
        return f;
    }

    public  Fracciones resta( Fracciones f2) throws Denominador0Exception {
         Fracciones f;
        int num, den;

        num = this.num * f2.den - this.den * f2.num;
        den = this.den * f2.den;
        f = new Fracciones(num, den);
        return f;
    }

    public  Fracciones multiplicacion( Fracciones f2) throws Denominador0Exception {
        Fracciones f;
        int num, den;

        num = this.num * f2.num;
        den = this.den * f2.den;
        f = new  Fracciones(num, den);
        return f;
    }

    public  Fracciones division( Fracciones f2) throws Denominador0Exception {
         Fracciones f;
        int num, den;

        num = this.num * f2.den;
        den = this.den * f2.num;
        f = new  Fracciones(num, den);
        return f;
    }
    
}
