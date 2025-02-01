import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();


        for(int i=0;i<T;i++){
            long n=sc.nextLong();
            ArrayList<Long> arr=new ArrayList<>();
            while(n%2==0){
                arr.add(2l);
                n/=2;
            }
            for(long j=3;j*j<=n;j+=2){
                while(n%j==0){
                    arr.add(j);
                    n/=j;
                }
            }
            if(n>2){
                arr.add(n);
            }
            boolean flag=true;
            for(int k=0;k<arr.size();k++){
                if(arr.get(k)%2!=0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES\n");
            }else{
                System.out.println("NO\n");
            }

        }

    }


}

