package com.company;


public class Program {
    private Read read = new Read();
    private Calculator calc = new Calculator();
    private LogicalOperations op = new LogicalOperations();

    public void startProgram() {

        boolean repeatProgram;
        do {
            repeatProgram = executeProgram();
        } while (repeatProgram);


    }

    private boolean executeProgram() {
        printMenu();
        int number = read.getInt();
        switch (number) {
            case 1:
                doSum();
                break;
            case 2:
                doSubstract();
                break;
            case 4:
                printHigherNumber();
                break;
            case 5:
                checkTextFast();

            case 0:
                System.out.println("Bye bye!");
                return false;


            default:
                printMenu();
        }
        return true;
    }


    private void printMenu() {
        System.out.println(
                "Hello!\n" +
                        "Choose an option:\n" +
                        "1. Sum\n" +
                        "2. Substraction\n" +
                        "3. Division\n" +
                        "4. Get higher number\n" +
                        "5. Check text FastTrack\n" +
                        "\n" +
                        "0. EXIT"

        );
    }

    private void doSum() {
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The sum is: " + calc.sum(first, second));
    }

    private void doSubstract() {
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The result is: " + calc.substraction(first, second));
    }

    private void printHigherNumber() {
        System.out.println("Enter two values.");
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("the higher number is: " +
                op.getHigherNumber(first, second));
    }

    private void checkTextFast() {
        System.out.print("Enter text:");
        String text = read.getString();
        System.out.println(op.checkTextFastTrack(text));
    }


    private void sortList() {
//        List<Integer> list = read.getList();
//        System.out.println(op.sortList(list));
    }
}
