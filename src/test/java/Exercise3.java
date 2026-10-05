import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //1- Initialize what we know

        int assigmentTotal = 40;
        int examTotal =200;
        int assigmentGrade;
        int finalExamGrade;


        //2- Get input

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your assigment grade");
        assigmentGrade = input.nextInt();
        System.out.print("Please enter your final exam grade");
        finalExamGrade = input.nextInt();


        //3- Do processing

        int studentGrade =assigmentGrade + finalExamGrade;
        int total = assigmentTotal + examTotal;
        float percentage =(float)studentGrade / total *100;


        //4- Print Output

        System.out.println("Your final grade is " +studentGrade);
        System.out.println("Your final percentage is " +percentage);

    }
}
