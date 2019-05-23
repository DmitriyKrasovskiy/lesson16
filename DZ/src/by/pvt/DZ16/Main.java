package by.pvt.DZ16;

import java.util.Comparator;
import java.util.Random;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Integer num1 = random.nextInt(100);
        Integer num2 = random.nextInt(100);

        System.out.println("Число 1: "+num1+";"+" Число 2: "+num2);

        Comparator<Integer> comparator = Comparator.comparingInt(x -> x);  //либо (x,y) -> x-y

        MaxMinPrint.printMax(BinaryOperator.maxBy(comparator),num1,num2);
        MaxMinPrint.printMin(BinaryOperator.minBy(comparator),num1,num2);
    }

}
