package Exam;

import java.util.Scanner;

public class Pyramind {
    public static void main(String[] args) {
        int rows = 4;
        int k = 0;
        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space<rows-1; ++space){
                System.out.println("");
            }
            while (k !=2*i-1){

                System.out.println("*");
                k++;
            }
        }
        System.out.println();
    }
}
