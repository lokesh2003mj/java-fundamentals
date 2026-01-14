import java.util.Scanner;
class Mobilenumber{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your mobile Number :");
String number = sc.nextLine();
System.out.println("Your Country code is : " + " +91 " + number);
sc.close();
}
}
