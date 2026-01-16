import java.util.Scanner;

class Test5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        double totalExpense = 0;
        int count = 1;

        while (count <= 3) {
            System.out.print("Enter expense " + count + ": ");
            totalExpense += sc.nextDouble();
            count++;
        }

        double balance = income - totalExpense;

        System.out.println("Remaining Balance: " + balance);

        if (age >= 18 && balance >= 5000) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
