import java.util.Scanner;
class Test1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Name: ");
String name = sc.nextLine();
System.out.print("Enter Your Age : ");
int age = sc.nextInt();
sc.nextLine();
System.out.print("Enter Your City : ");
String city = sc.nextLine();
System.out.println("Your Profil " );
System.out.println("Your Name : " + name);
System.out.println("Your Age  : " + age);
System.out.println("Your City : " + city);

if(age>=18)
{
System.out.println("Eligible For vote");
}
else
{
System.out.println("Not Eligible");
}
}
}