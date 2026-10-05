package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of salespersons : ");
        int n = scan.nextInt();
        int[] sales = new int[n];
        int sum;
        int mn=0; int mx = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
            if (sales[i] > sales[mx]) mx = i;
            if (sales[i] < sales[mn]) mn = i;
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverafe sales: " + (double) sum/sales.length);
        System.out.print("\nSalesperson " + mx+ " had the highest sale with $" + sales[mx]) ;
        System.out.print("\nSalesperson " + mn+ " had the lowest sale with $" + sales[mn]) ;
        System.out.println("\nEnter the limit : ");
        int x =  scan.nextInt();
        int k=0;
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        for (int i=0;i<sales.length;i++) {
            if (sales[i] > x) {
                System.out.println(" " + (i+1) + " " + sales[i]);
                k++;
            }
        }
        System.out.println("Number of salespeople whose sales exceeded the value entered : "+ k);



    }
}