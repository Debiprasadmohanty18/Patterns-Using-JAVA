import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        int n = sc.nextInt();
        int rem,sum=0;
        sc.close();
        while(n!=0)
        {
            rem = n%10;
            sum = (sum*10) + rem;
            n = n/10;
        }
        System.out.println("Reverse of "+ n + "is:- " + sum);
    }
}
