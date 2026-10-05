import java.util.Scanner;

public class ChatGptExercise {
    public static void main(String[] args) {


        //1- initialize what we know
        int quizTotal = 20;
        int midTotal = 30;
        int quizGrade;
        int midGrade;


        //2- Get input from user

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your quiz grade");
        quizGrade = input.nextInt();
        System.out.println("Please enter your midgrade grade");
        midGrade = input.nextInt();



        //3- Do processing
        int totalGrade = quizGrade + midGrade;
        int total = quizTotal + midTotal;
        float percentage = (float)totalGrade/total*100;



        //4-Print output

        System.out.println("Your total grade is " + totalGrade );
        System.out.println("Your total percentage is " + percentage);
    }
}
