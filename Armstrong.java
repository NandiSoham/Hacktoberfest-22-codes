import java.util.*;

public class Armstrong
{
    public static void main(String args[])
    {
        int n,n1,n2,c=0;
        double r,s=0.0;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        n=sc.nextInt();
        
        n1=n;
        n2=n;
        while(n>0)
        {
            c=c+1;
            n=n/10;
        }
        while(n1>0)
        {
           r=n1%10;
           s=s+(Math.pow(r,c));
           n1=n1/10;
        }
        
        if(s==n2)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}