import java.util.Scanner;
class Test2{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Monthly Income : ");
double income = sc.nextDouble();
System.out.println("Enter Your Monthly Expenses");
System.out.print("Enter your Rent : ");
double rent = sc.nextDouble();
income -=rent;
System.out.print("Enter your Food : ");
double food = sc.nextDouble();
income -=food;
System.out.print("Enter your Travel : ");
double travel = sc.nextDouble();
income -=travel;
System.out.println("Your Final Income Is : " + income);

if(income>=5000)
{
System.out.println("Saving is possible");
}
else
{
System.out.println("Low balance");
}
}
}