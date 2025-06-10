import java.util.*;
public class FindDuplicates
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no.of elements:");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("enter the elements:");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
Set<Integer> s=new HashSet<>();
Set<Integer> d=new HashSet<>();
for(int num:arr)
{
if(s.contains(num))
{
d.add(num);
}
else
{
s.add(num);
}
}
if(d.isEmpty())
{
System.out.println("no duplicates");
}
else
{
System.out.println(d);
}
sc.close();
}
}
