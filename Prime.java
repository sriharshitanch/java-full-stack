import java.util.*;
class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
int c=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
}
}
if(c>2)
{
System.out.println("not prime");
}
else
{
System.out.println("is prime");
}
}
}
