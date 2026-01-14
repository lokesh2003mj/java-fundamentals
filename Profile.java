import java.util.Scanner;
class Profile{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Name : ");
String name = sc.nextLine();
System.out.print("Enter Your Age : ");
int age = sc.nextInt();
sc.nextLine();
System.out.print("Enter Your City : ");
String city = sc.nextLine();
System.out.println(" Your Profile ");
System.out.println(" Your Name is : " + name);
System.out.println(" Your Age is : " + age);
System.out.println(" Your City is : " + city);
sc.close();
}
}
