import java.util.Scanner;
class Table {

    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.printf("enter your number to find table: ");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}