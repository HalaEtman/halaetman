package com.company;

public class Main {

    public static void main(String[] args) {
        float weight_earth;
        float weight_mars;
        double weight_mars_double;
        int weight_mars_int;
        char weight_mars_char;


        weight_earth = 71;
        weight_mars = 0.38F * weight_earth;
        System.out.println(weight_earth + " KG on earth = " + weight_mars + " KG on mars");


        weight_mars_double = weight_mars;
        System.out.println("Weight on mars using double command = " + weight_mars_double);


        System.out.printf("Weight on mars limited to 4 decimal places  = %.4f %n",  weight_mars_double);


        weight_mars_int = (int)weight_mars_double;
        System.out.println("weight on mars using int command = "+ weight_mars_int);


        weight_mars_char = (char)weight_mars_int;
        System.out.println("ASCII char using weight on mars = " + weight_mars_char);


        weight_mars_int = weight_mars_char * (int)weight_mars_double;
        System.out.println(weight_mars_int + "\n");


    }
}
