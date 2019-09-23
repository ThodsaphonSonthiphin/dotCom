package com.dotcom;

import java.util.Scanner;

public class DotcomTestDrive {
    public static void main(String[] args) {
        int numberOfGuess = 0;




    }
}


class Dotcom{
    private int[] locationCell;
    private int numberOfHit;


    String checkYourself(String stringGuess){
        String result = "miss";
        int guess = Integer.parseInt(stringGuess);

        for(int cell:locationCell){
            if(guess == cell){
                result = "hit";
                numberOfHit++;
                break;
            }
        }

        if(numberOfHit == locationCell.length){
            result = "kill";
        }

        System.out.println(result);
        return result;
    }

    public void setLocationCell(int[] locationCell) {
        this.locationCell = locationCell;
    }

    public static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}