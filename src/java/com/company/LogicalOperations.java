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

}
