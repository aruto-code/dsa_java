public class Implement2Stack {
    int arr[];
    int cap, top1, top2;

    Implement2Stack(int n) {
        cap = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    public  boolean push1(int x){
        if(top1 < top2 -1){
            top1++;
        arr[top1] = x;
        return true;
        }
    return false;
    }
    public boolean push2(int x){
        if(top1 < top2 -1){
            top2++;
            arr[top2] = x;
            return true;
        }
        return false;
    }
    Integer pop1(){
        if(top1 >= 0){
        int x = arr[top1];
        top1--;
        return x;
        }
       return null;
    }

    Integer pop2(){
        if(top1 <= 0){
            int x = arr[top2];
            top2--;
            return x;
        }
        return null;
    }
    int size1(){
        return(top1 +1);
    }
    int size2(){
        return(top2 +1);
    }


    }

