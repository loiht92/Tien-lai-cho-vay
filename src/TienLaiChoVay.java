import java.util.Scanner;

public class TienLaiChoVay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount:");
        double money = input.nextDouble();

        System.out.println("Enter number of month");
        int month = input.nextInt();

        System.out.println("Enter the interest rate ");
        double interest_rate = input.nextDouble();

        double total_interesr = 0 ;
        for (int i = 0; i< month ; i++){
            total_interesr = money * (interest_rate/100) /12 * month ;

        }
        System.out.println("total of interest : " +total_interesr);

    }
}
