import java.util.Scanner;

public class ChatGptEx3 {
    public static void main(String[] args) {

        //1- initialize what we know
        int hours;
        int rate;


        //2-Get input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the hours you want to send: ");
        hours = input.nextInt();
        System.out.print("Enter the rate you want to send: ");
        rate = input.nextInt();


        //3-Do processing
        int salary = hours * rate;


        //4- Print output

        System.out.println("Your salary is " + salary);
    }
}
