/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.EX2;

/**
 *
 * @author chams
 */
public class MathOperations {
    public void calculateFactorial(int x) throws IllegalArgumentException{
        if(x<0) throw new IllegalArgumentException("variable est negative");
    }
    public void calculateSquareRoot(int x){
         if(x<0) throw new ArithmeticException("variable est negative");
   
    }
}
