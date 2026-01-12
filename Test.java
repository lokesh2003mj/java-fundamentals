import java.util.Scanner;
class Test{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Number ");
int number = sc.nextInt();
System.out.println("Your Entered Number is " + number);
number++;
System.out.println("Number after increment " + number);
number--;
System.out.println("The final value is " + number );
sc.close();

}
}