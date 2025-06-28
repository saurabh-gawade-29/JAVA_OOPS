package Javarecursion;

public class Javarecurse {
    public static void main(String[] args) {
        int result= sum(5);
        System.out.println(result);
    }
    public static int sum(int k){
        if(k> 0){
          return k +  sum(k-1);
        }else{
            return k;
        }

    }
}
