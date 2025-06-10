class Human
{
String name;
int id;
int age;
public void Breath()
{
System.out.println("human");
}
}
class Student extends Human{
int marks;
public void Breath()
{
System.out.println("stu human");
}
}
class Teacher extends Human{
int salary;
public void Breath(){
System.out.println("teach human");
}
}
public class Main{
public static void main(String args[])
{
Human h1=new Human();
Human h2=new Student();
Human h3=new Teacher();
h1.Breath();
h2.Breath();
h3.Breath();
}
}





