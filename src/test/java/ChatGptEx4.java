import java.util.Scanner;

public class ChatGptEx4 {
    public static void main(String[] args) {

        //1-initialize what we know
        int length;
        int width;


        //2-Get input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = input.nextInt();
        System.out.print("Enter width: ");
        width = input.nextInt();


        //3-Do processing
        int area = length * width;


        //4-Print output
        System.out.println("The area of the rectangle is " + area);


    }
}
