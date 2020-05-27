package com.company;

import java.util.List;

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

    public int[] getArrayHundred(){
        int array[] = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i+1;
        }
        return array;
    }

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public float getAverageFromArray(int[] array){
        float sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum += array[i];

        }

        return sum / array.length;
    }


    public void addToList(List<Integer> myList, int x){
        myList.add(x);
    }

    public void printList(List<Integer> list){
//        for (int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
        for (int x : list){
            System.out.println(x);
        }
    }

}
