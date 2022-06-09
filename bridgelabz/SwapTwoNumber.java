package com.bridgelabz;

public class SwapTwoNumber {
    public static void main(String[] args)
    {

        int firstNumber = 20;
        int secondNumber = 10;
        int temporaryVariable;

        System.out.println("----- Before Swapping -----");
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        // Swapping Logic
        temporaryVariable = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temporaryVariable;

        System.out.println("----- After Swapping ------");
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

    }

}
