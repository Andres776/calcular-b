/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 312A-31
 */
public class Pitagoras {
    private double A;
    private double C;
    
    public Pitagoras(double c,double a) {
        A=a;
        C=c;
    }
    static public double calcular_hipotenusa_b(double a,double c)
    {
        return Math.sqrt(Math.pow(c, 2)+ Math.pow(a, 2));
    }

    /**
     * @return the A
     */
    public double getA() {
        return A;
    }

    /**
     * @param A the A to set
     */
    public void setA(double A) {
        this.A = A;
    }

    /**
     * @return the C
     */
    public double getC() {
        return C;
    }

    /**
     * @param C the C to set
     */
    public void setC(double C) {
        this.C = C;
    }
}
