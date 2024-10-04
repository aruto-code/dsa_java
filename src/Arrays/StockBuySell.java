public class StockBuySell {

    static int maxProfit(int price[], int start, int end){
        if(start >= end){
            return 0;
        }
        int profit = 0;
        for(int i = start; i< end; i++){
            for(int j = i + 1; j <= end;j++){
                if (price[i] < price[j]) {

                    int curr_profit = price[j] - price[i] + maxProfit(price, start , i-1) +
                            maxProfit(price, j+1 ,end);
                    profit = Math.max(profit, curr_profit);
                }

                }
            }
        return profit;
        }

        static int maxProfit(int price[]){
            int n = price.length;
            int profit = 0;
            for(int i = 1; i< n; i++){
                if(price[i -1 ] < price[i] ){
                    profit = profit + (price[i] - price[i -1 ]);

                }
            }
            return profit;
        }



    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};
        int n = price.length;
        int res = maxProfit( price, 0, n - 1);
        System.out.println(res);
    }

}
