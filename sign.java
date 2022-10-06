import java.util.*;
public class sign
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
n=sc.nextInt();

if(n>0)
System.out.println("Positive");
else if(n<0)
System.out.println("Negative");
else
System.out.println("Zero");
}
}