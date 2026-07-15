package Arrays;

public class BuyAndSell {
  public static int BestBuy(int [] price){
    int buy = Integer.MAX_VALUE;
    int maxProfit = 0;
    for(int i = 0; i < price.length; i++){
      if(buy < price[i]){
        int profit = price[i] - buy;
        maxProfit = Math.max(profit, maxProfit);
      }
      else{
        buy = price[i];
      }
    }
    return maxProfit;
  }
  public static void main(String[] args) {
    int [] price = {7,1,5,3,6,4};
    System.out.println(BestBuy(price));
  }
}
