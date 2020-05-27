package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lab6 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList();

        myList.add(1); // 0
        myList.add(2); // 1
        myList.add(3); // 2

        myList.add(3, 4);
//        System.out.println(myList);
//
//
//
//        int x = 3;
//        Double y = 3d;
//        Double a = 3d;
//        Float z = 4f;
//
//        myList.remove(y);
//
//        System.out.println(myList);
//        System.out.println(myList.size());

        LogicalOperations op = new LogicalOperations();

        op.addToList(myList, 16);
//        System.out.println(myList);

        op.printList(myList);
    }
}
