import java.util.Scanner;

public class COVID19symptomps {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String  user = scanner.next();
        System.out.println("Please enter 1 if your answer is yes and reply with 0 if your answer is no");
        System.out.println("Do you have Fever and cough?");
        int i1 = scanner.nextInt();
        if (i1 ==1){
            num++;
        }
        System.out.println("Do you have Shortness of breath or difficulty breathing?");
        int i2 = scanner.nextInt();
        if (i2 ==1){
            num++;
        }
        System.out.println("Do you have Fatigue?");
        int i3 = scanner.nextInt();
        if (i3 ==1){
            num++;
        }
        System.out.println("Do you have Muscle or body aches?");
        int i4 = scanner.nextInt();
        if (i4 ==1){
            num++;
        }
        System.out.println("Do you have Headache?");
        int i5 = scanner.nextInt();
        if (i5 ==1){
            num++;
        }
        System.out.println("Do you have New loss of taste or smell?");
        int i6 = scanner.nextInt();
        if (i6 ==1){
            num++;
        }
        System.out.println("Do you have Sore throat?");
        int i7 = scanner.nextInt();
        if (i7 ==1){
            num++;
        }
        System.out.println("Do you have Congestion or runny nose?");
        int i8 = scanner.nextInt();
        if (i8 ==1){
            num++;
        }
        System.out.println("Do you have Nausea or vomiting?");
        int i9 = scanner.nextInt();
        if (i9 ==1){
            num++;
        }
        System.out.println("Do you have Diarrhea?");
        int i10 = scanner.nextInt();
        if (i10 ==1){
            num++;
        }
        scanner.close();
        int result = num*10;
        System.out.println(user+", the probability of your being COVID-19 affected is :"+result+"%");
    }
}
