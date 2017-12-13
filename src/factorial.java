import java.util.Scanner;

public class factorial {
    public static void main(String[]args){
        int n,factorial=1,m,oddsum=1, count;

        Scanner keyboard= new Scanner (System.in);
        System.out.println("Enter a positive integer number and i will give you the factorial");
        n=keyboard.nextInt();
        for(int i=n; i>=1; i--)
        {
            factorial=i*factorial;
            System.out.println(factorial);
        }

        Scanner keyboard2= new Scanner(System.in);
        System.out.println("enter a number and i will give you the sum of the first odd numbers");

        m=keyboard2.nextInt();
        for (int i=0; i<m; i++)
        {  oddsum=(2*i)+1;
            System.out.println(oddsum);}


        Scanner keyboard3=new Scanner (System.in);
        System.out.println("enter a number and i will give you a series of fibonacci number");

        count=keyboard3.nextInt();
        int[]fib= new int [count];
        fib[0]=0;
        fib[1]=1;
        for (int i=2;i<count;i++)
        {fib[i]=fib[i-1]+fib[i-2];}
        for (int i:fib){
            System.out.println(i);}

    }
}
