import java.util.Scanner;

public class StockBuyNSale {
    public static int maxProfit(int prices[]){
        int maxprofit =0;
        int minprice = Integer.MAX_VALUE;
        for(int price : prices){
            if(price<minprice){
                minprice = price;
            } 
            else {
                maxprofit = Math.max(maxprofit, price-minprice);
            }
        }
        return maxprofit;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int prices[]= new int[n];
        for(int i=0;i<n;i++){
            prices[i]= sc.nextInt();
        } 
        System.out.println("Max Profit"+ maxProfit(prices));
    }
}