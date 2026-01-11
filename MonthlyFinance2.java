import java.util.Scanner;
class MonthlyFinance2{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Name : ");
String name = sc.nextLine();
System.out.print("Enter Your Age : ");
int age = sc.nextInt();
System.out.print("Enter Your Monthly Income : ");
double income = sc.nextDouble();
System.out.println( " ");
System.out.println("Enter Your Monthly Expenses");
System.out.print("Enter Your Monthly rent : ");
double rent = sc.nextDouble();
income -=rent;
System.out.print("Enter Your Monthly food : ");
double food = sc.nextDouble();
income -=food;
System.out.print("Enter Your Monthly travel : ");
double travel = sc.nextDouble();
income -=travel;
System.out.println("Your Remaining balance : " + income );
System.out.println( " ");
System.out.print("Enter Your attendence per : ");
int attendence = sc.nextInt();
if(age>=18)
{
if(attendence>=75)
{
if(income>=5000)
{
System.out.println("Eligble for Benefits");
}
else
{
System.out.println("Low Balance");
}
}
else
{
System.out.println("Low Attendence");
}
}
else
{
System.out.println("Under Age");
}


sc.close();
}
}
