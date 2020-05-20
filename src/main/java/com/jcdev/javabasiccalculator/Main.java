/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jcdev.javabasiccalculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JCDEV
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static List getNumbers(){
        List<Integer> numbers = new ArrayList<Integer>();
        boolean condition = false;
        do{
            try{
                System.out.println("Ingrese los numeros");
                numbers.add(scanner.nextInt());
                numbers.add(scanner.nextInt());
                condition = true;
                scanner.close();
            }catch(InputMismatchException e){
                System.out.println("¡Only numbers allowed!");
                scanner.next();           
            }
        }while(!condition);
        return numbers;
    }
    public static void Calculate(){
        int operation = 0;
        int result = 0;
        List<Integer> numbers = new ArrayList<Integer>();
        boolean condition = false;
        do{
            System.out.println("Ingrese la operación");
            try {
                operation = scanner.nextInt();
                condition = true;
            } catch (InputMismatchException e){
                System.out.println("¡Only numbers allowed!");
                scanner.next();
           }
        } while(!condition);
            switch(operation){
                case 1:
                    numbers = getNumbers();
                    result = (numbers.get(0) + numbers.get(1));
                    System.out.println("El resultado es: " + result);
                    break;
                case 2:
                     numbers = getNumbers();
                    result = (numbers.get(0) - numbers.get(1));
                    System.out.println("El resultado es: " + result);
                    break;
                case 3:
                    numbers = getNumbers();
                    result = (numbers.get(0) * numbers.get(1));
                    System.out.println("El resultado es: " + result);
                    break;
                case 4:
                    numbers = getNumbers();
                    double resultDouble = ((double)numbers.get(0) / (double)numbers.get(1));
                    System.out.println("El resultado es: " + resultDouble);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        
    }
    public static void main(String[] args) {
        Calculate();
    }
}
