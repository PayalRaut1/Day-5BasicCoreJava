package com.bridgelabz;

public class FlipCoin {
    public static void main(String[] args)
    {

        int numofflips=10;
        int heads = 0;
        int tails = 0;
        for (int i=0; i<=10; i++)
        {
            if(Math.random() < 0.5)
            {
                tails++;
            }
            else
            {
                heads++;
            }
        }
        double percentageoftails = (tails * 100)/numofflips;
        double percentageofheads = 100-percentageoftails;
        System.out.println("percentage of tails: " + percentageoftails);
        System.out.println("percentage od heads: " + percentageofheads);
    }

}
