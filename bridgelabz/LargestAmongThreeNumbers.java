package com.bridgelabz;

public class LargestAmongThreeNumbers
{
    public static void main(String[] args)
    {

        int firstNumber = 6;
        int secondNumber = 10;
        int thirdNumber = 7;

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber + " is Largest");
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber + " is Largest");
        }
        else {
            System.out.println(thirdNumber + " is Largest");
        }

    }
}
