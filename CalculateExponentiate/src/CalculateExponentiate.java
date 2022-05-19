import java.util.Scanner;

public class CalculateExponentiate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Base Number...:");  // 2
        int baseNumber = scanner.nextInt();
        System.out.print("Please Enter Exponentiate Number...:"); //4
        int exponentNumber = scanner.nextInt();

        System.out.println("Result..:" + calculateExponentNumber(baseNumber,exponentNumber));
    }

    static int calculateExponentNumber(int baseNumber,int exponentNumber){
        if (exponentNumber == 0){
            return 1;
        }else if (baseNumber <= 1){
            return 1;
        }else{
            return baseNumber * calculateExponentNumber(baseNumber, exponentNumber - 1);
        }
    }
}