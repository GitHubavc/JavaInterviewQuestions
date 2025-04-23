package LeetCodeQuestions;

import java.util.Scanner;

public class BestTimeToBuySellStocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ask for size of array
        System.out.println("Enter the no of days the prices should be shown : ");
        int n=sc.nextInt();
        //create an array
        int[] price= new int[n];
        //input elements in array
        System.out.println("Enter "+n+" days prices accordingly : ");
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }
        //Print the days and prices
        System.out.println("Days and Prices: ");
        for (int i=0; i<=price.length-1;i++){
            System.out.println("Day : "+(i+1)+" >>> Price : "+price[i]);
        }
        System.out.println("The Max Profit is: "+maxProfit(price));
        sc.close();
    }

    public static int maxProfit(int[] prices){
        int max_Profit=0;
        int buy_Price= prices[0];
        for(int i=1;i<prices.length;i++){
            int curr_Profit=prices[i]-buy_Price;
            if(curr_Profit>max_Profit){
                max_Profit=curr_Profit;
            }
            if(prices[i]<buy_Price){
                buy_Price=prices[i];
            }

        }
        return max_Profit;
    }
}
