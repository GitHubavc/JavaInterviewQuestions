package PatternsGeneration;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows needed : ");
        int rows=sc.nextInt();
        //createRightHalfPyramidPattern(rows);
        createRightHalfPyramidOddPattern(rows);
        sc.close();
    }

    //Right Half Pyramid Pattern
    public static void createRightHalfPyramidPattern(int rowCount){
        for(int i=1;i<=rowCount;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Right Half Pyramid Pattern odd number
    public static void createRightHalfPyramidOddPattern(int rowCount){
        int k =1;
        for(int i=1;i<=rowCount;i++){
            for(int j=1;j<=k;j++){
                System.out.print("* ");
            }
            k=k+2;
            System.out.println();
        }
    }
}
