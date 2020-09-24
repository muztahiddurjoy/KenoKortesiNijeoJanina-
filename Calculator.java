import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer with the index number(must)");
        System.out.println("1. Add");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiply");
        System.out.println("4. divide");
        System.out.println("5. Power");
        System.out.println("6. Root");
        System.out.println("7. Sin");
        System.out.println("8. Cos");
        System.out.println("9. Tan");
        System.out.println("10. log");

        int num  = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Enter the first number: ");
                int numAdd1 = scanner.nextInt();
                System.out.println("Enter the second number: ");
                int numAdd2= scanner.nextInt();
                int resultAdd = numAdd1+numAdd2;
                System.out.println("The result is: "+resultAdd);
                break;
            case 2:
                System.out.println("Enter the first number: ");
                int numSub1 = scanner.nextInt();
                System.out.println("Enter the second number: ");
                int numSub2 = scanner.nextInt();
                int resultSub = numSub1-numSub2;
                System.out.println("The result is: "+resultSub);
                break;
            case 3:
                System.out.println("Enter the first number: ");
                int numMulti1 = scanner.nextInt();
                System.out.println("Enter the second number");
                int numMulti2 = scanner.nextInt();
                int resultMulti = numMulti1*numMulti2;
                System.out.println("The result is: "+resultMulti);
                break;
            case 4:
                System.out.println("Enter the first number:");
                int numDevide = scanner.nextInt();
                System.out.println("Enter the second number:");
                int numDevide2 = scanner.nextInt();
                int resultDevide = numDevide/numDevide2;
                System.out.println("Then result is: "+resultDevide);
                break;
            case 5:
                System.out.println("Enter the number: ");
                int numPow = scanner.nextInt();
                System.out.println("Enter the power");
                int powPow = scanner.nextInt();
                System.out.println("The result is:"+Math.pow(numPow,powPow));
                break;
            case 6:
                System.out.println("Enter the number:");
                int numRoot = scanner.nextInt();
                System.out.println("The result is: "+Math.sqrt(numRoot));
                break;
            case 7:
                System.out.println("Enter the number: ");
                int numSin = scanner.nextInt();
                System.out.println("The result is: "+Math.sin(numSin));
                break;
            case 8:
                System.out.println("Enter the number:");
                int  numCos = scanner.nextInt();
                System.out.println("The result is: "+Math.cos(numCos));
                break;
            case 9:
                System.out.println("Enter the number:");
                int numTan = scanner.nextInt();
                System.out.println("The result is: "+Math.tan(numTan));
                break;
            case 10:
                System.out.println("Enter the number:");
                int numLog = scanner.nextInt();
                System.out.println("The result is: "+Math.log(numLog));
                break;
            default:
                System.out.println("You haven't selected anything. please run this program again");
                break;
        }

    }
}
