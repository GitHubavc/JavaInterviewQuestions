package PatternsGeneration;

public class AllStarAndAlphabetPatternQuestions {
    public static void main(String[] args) {

//Pattern 1
//*
//* *
//* * *
//* * * *
//* * * * *

//        System.out.println("*****PATTERN 1*********");
//        for (int i = 0; i <= 4; i++) {
//            for (int j=0; j<= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//

// Pattern 2
//* * * * *
//* * * *
//* * *
//* *
//*

//        System.out.println("*****PATTERN 2*********");
//        for (int i=0; i<=4 ; i++) {
//           for (int j=4; j>=i; j--) {
//               System.out.print("* ");
//           }
//           System.out.println();


// Pattern 3
//*
//*  *
//*  *  *
//*  *  *  *
//*  *  *  *  *
//*  *  *  *
//*  *  *
//*  *
//*

//        System.out.println("*****PATTERN 3*********");
//        for (int i = 0; i <= 4; i++) {
//            for (int j=0; j<= i; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
//        for (int i=0; i<=3 ; i++) {
//           for (int j=3; j>=i; j--) {
//               System.out.print("*  ");
//           }
//           System.out.println();
//       }


// Pattern 4
//       *
//     * *
//   * * *
// * * * *

//        System.out.println("*****PATTERN 4*********");
//
//        for (int i=1 ; i<=4 ; i++) {
//            for (int j=3; j>=i; j--) {
//                System.out.print("  ");
//            }
//            for (int k=1; k<=i;k++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

//  Pattern 6
//       *
//     *   *
//   *   *   *
// *   *   *   *

//        System.out.println("*****PATTERN 5*********");
//
//        for (int i=1 ; i<=4 ; i++) {
//            for (int j=3; j>=i; j--) {
//                System.out.print("  ");
//            }
//            for (int k=1; k<=i;k++) {
//                System.out.print(" *  ");
//            }
//            System.out.println();
//        }


// Pattern 6
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
//        A B C D E F


//        System.out.println("*****PATTERN 6*********");
//        int alpha =65; //for "A" its 65 , for "a" its 97
//        for (int i = 0; i <= 5; i++) {
//            for (int j=0; j<= i; j++) {
//                System.out.print((char)(alpha+j)+" ");
//            }
//            System.out.println();
//        }

//Pattern 6
//        A
//        B B
//        C C C
//        D D D D
//        E E E E E
//        F F F F F F

        //        System.out.println("*****PATTERN 7*********");
            int alpha =97; //for "A-z" its 65-90 , for "a-z" its 97 to 122
            for (int i = 0; i <= 5; i++) {
                for (int j=0; j<= i; j++) {
                    System.out.print((char)(alpha)+" ");
                }
                alpha++;
                System.out.println();
            }

    }
}
