import java.util.Scanner;
class productname{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Product name : " );
String product = sc.nextLine();
System.out.print("The product price : ");
int price = sc.nextInt();
System.out.println("Your Bill");
System.out.println("Your Product : " + product);
System.out.println("product price : " + price);
sc.close();
}
}