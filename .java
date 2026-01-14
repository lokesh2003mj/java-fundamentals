import java.util.Scanner;
class Marks{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.print("Marks in Science : ");
int marks1 = sc.nextInt();
System.out.print("Marks in Maths : ");
int marks2 = sc.nextInt();
System.out.print("Marks in English : ");
int marks3 = sc.nextInt();
int total = marks1+marks2+marks3;
System.out.print("Your Total Marks is : " + total);
sc.close();
}
}

