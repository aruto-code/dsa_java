public class medianTwosortedarrays {

    static double getMed(int a1[], int a2[]){
        int n1 = a1.length;
        int n2 = a2.length;
        int begin1 = 0;
        int end1 = n1;
        if (a1.length > a2.length) {
            return getMed(a2, a1);
        }
        while(begin1 <= end1){
            int i1 = (begin1 + end1)/2;
            int i2 = (n1 + n2 + 1)/2 - i1;
            int min1 = (i1 == n1)?Integer.MAX_VALUE:a1[i1];
            int max1 = (i1 == 0)?Integer.MIN_VALUE:a1[i1 -1];
            int min2 = (i2 == n2)?Integer.MAX_VALUE:a2[i2];
            int max2 = (i2 == 0)?Integer.MIN_VALUE:a2[i2 -1];
            if(max1 <= min2 && max2 <= min1){
                if((n1 + n2)%2 == 0)
                    return (double)(Math.max(max1,max2) + Math.min(min1,min2))/2;
                else
                    return (double)Math.max(max1,max2);
            }
            else if (max1 > min2){
                end1 = i1 - 1;
            }
            else{
                begin1 = i1 + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int a1[] = {1,3};
        int a2[] = {2};
        double res = getMed(a1, a2);
        System.out.println(res);

    }
}
