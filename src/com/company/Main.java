package com.company;

public class Main {

    public static void main(String[] args) {
        printDayofTheWeek(-1);

        printDayofTheWeek(1);

        printDayofTheWeek(2);

        printDayofTheWeek(3);

        printDayofTheWeek(4);

        printDayofTheWeek(5);

        printDayofTheWeek(6);

        printDayofTheWeek(7);
    }

    public static void printDayofTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.printf("Sunday");
                break;
            case 1:
                System.out.printf("Monday");
                break;
            case 2:
                System.out.printf("Tuesday");
                break;
            case 3:
                System.out.printf("Wednesday");
                break;
            case 4:
                System.out.printf("Thursday");
                break;
            case 5:
                System.out.printf("Friday");
                break;
            case 6:
                System.out.printf("Saturday");
                break;
            default:
                System.out.printf("Invalid Day");
        }
    }
}
