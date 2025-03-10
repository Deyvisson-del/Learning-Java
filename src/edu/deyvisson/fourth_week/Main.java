package edu.deyvisson.fourth_week;

public class Main {
    public static int opposite(int number) {
        System.out.println(number * -1);
        return number;
    }


    public static String numberToString(int num) {
        System.out.println(String.valueOf(num));
        return num + ""; // Return a string of the number here!
    }

    public static void main(String[] args) {
        opposite(14);
        numberToString(14);
        Object myVariavel = "text";
        System.out.println(myVariavel.getClass().getSimpleName());
    }
}

