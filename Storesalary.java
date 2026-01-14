import java.util.Scanner;
class Storesalary{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter your Monthly Salary : ");
double salary = sc.nextDouble();
salary*=12;
System.out.print("Your Yearly salary is : " + salary);
sc.close();
}
}
