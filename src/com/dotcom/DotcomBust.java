package com.dotcom;

import java.util.Scanner;

import java.util.ArrayList;

public class DotcomBust {
    public static void main(String[] args) {
        int numberOfGuess = 0;

        int myRandom = Dotcom.getRandomNumberInRange(0,4);

        Dotcom myDot = new Dotcom();

        String [] location = {String.valueOf(myRandom),String.valueOf(myRandom+1),String.valueOf(myRandom+2)};

        myDot.setLocationCell(location);

        boolean isAlive = true;

        Scanner myScanner = new Scanner(System.in);



        while (isAlive == true){

            System.out.print("insert your guess");
            String guess = myScanner.nextLine();
            String result = myDot.checkYourself(guess);

            numberOfGuess++;

            if(result.equals("kill")){
                isAlive = false;
                System.out.println("you took num of guess ="+numberOfGuess);
            }

        }




    }
}


class Dotcom{
    private ArrayList<String > locationCell = new ArrayList<>();
    private int numberOfHit;


    String checkYourself(String stringGuess){
        String result = "miss";
        int index = locationCell.indexOf(stringGuess);

        if(index >=0){
            locationCell.remove(index);

            if(locationCell.isEmpty()){
                result = "kill";
            }else {
                result = "hit";
            }
        }

        System.out.println(result);
        return result;
    }

    public void setLocationCell(String [] locationCell) {
        for(String item:locationCell){
            this.locationCell.add(item);
        }

    }

    public static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}