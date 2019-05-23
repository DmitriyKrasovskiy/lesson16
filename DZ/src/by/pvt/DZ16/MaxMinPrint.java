package by.pvt.DZ16;

import java.util.function.BinaryOperator;

public class MaxMinPrint {

    static void printMin(BinaryOperator<Integer> binaryOperator, Integer num1, Integer num2){
        System.out.println("Min= "+binaryOperator.apply(num1,num2));
    }

    static void printMax(BinaryOperator<Integer> binaryOperator, Integer firstValue, Integer secondValue){
        System.out.println("Max= "+binaryOperator.apply(firstValue,secondValue));
    }


}
