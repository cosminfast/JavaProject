package com.company;

public class LogicalOperations {


    public int getHigherNumber(int first, int second){
        if (first < second){
            return second;
        } else {
            return first;
        }
    }

    public String checkTextFastTrack(String text){
        if (text.equals("FastTrack")){
            return  "Learning....";
        }else {
            return "got to try some more";
        }
    }

    public void printToHundred(int number){
        for (int i = number; i <= 100; i++ ){
            System.out.println(i);
        }
    }

    public float getAverageFromHundred(){
        float sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        float average = sum / 100;
        System.out.println(sum);
        return (average);
    }

    public float sumAndAverageWhile(){
        int i = 1;
        int sum = 0;

        while(i <= 100){
            sum+=i;
            i++;
        }
        return sum/100;
    }

}
