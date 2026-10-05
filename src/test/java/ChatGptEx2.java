import java.util.Scanner;

public class ChatGptEx2 {
    public static void main(String[] args) {

        //1- initialize what we know
        int price;
        int quantity;


        //2- Get input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your price");
        price = input.nextInt();
        System.out.println("Enter your quantity");
        quantity = input.nextInt();


        //3- Do processing
        int total = price * quantity;


        //4- Print output
        System.out.println("Your total is " + total);
    }
}
