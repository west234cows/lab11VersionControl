import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        //this has been uploaded to github
        //haha yeah man
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        Double operand1= scan.nextDouble();
        System.out.print("Enter second operand: ");
        Double operand2= scan.nextDouble();
        System.out.println("Calculator Menu\n---------------\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.print("Which operation do you want to perform?");
        int response = scan.nextInt();
        switch(response){
            case 1:
                double result=operand1+operand2;
                System.out.println("The result of the operation is "+result+". Goodbye!");
                break;
            case 2:
                result=operand1-operand2;
                System.out.println("The result of the operation is "+result+". Goodbye!");

                break;

            case 3:
                result=operand1*operand2;
                System.out.println("The result of the operation is "+result+". Goodbye!");
                break;
            case 4:
                result=operand1/operand2;
                System.out.println("The result of the operation is "+result+". Goodbye!");
                break;

            default:
                System.out.print("Error: Invalid selection! Terminating program.");

        }







    }
}
