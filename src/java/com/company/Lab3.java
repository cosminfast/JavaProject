package com.company;

public class Lab3 {


    public static void main(String[] args) {
//        Given two numbers, see which one is the greatest and print it

        LogicalOperations op = new LogicalOperations();

        int x = 3;
        int y = 4;

//        int higher = op.getHigherNumber(x, y);
//        System.out.println(higher);
// -------------------------------------------------------------


//    Given a text input, if it is “FastTrack”, then print
//    “Learning text comparison”. If not,
//    print “Got to try some more”


        String text = "FastTrack";

//        System.out.println(op.checkTextFastTrack(text));
//
//
//        if (text.equals("FastTrack") || x <= y) {
//            System.out.println("a");
//        }
//
//
        if (x < y) {
            System.out.println(x);
        } else if (x > y) {
            System.out.println(y);
        } else if (x == y) {
            System.out.println("egale");
        } else {
            System.out.println("Nici o conditie de mai sus");
        }

        int caseNumber = 2;

        switch (caseNumber) {
            case 1:
                System.out.println("e 1");
                break;
            case 2:
                System.out.println("e 2");
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Nu e nici una de mai sus");
        }

    }


}
