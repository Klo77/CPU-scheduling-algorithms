import java.io.FileNotFoundException;
import java.util.Scanner;
public class run {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner read=new Scanner(System.in);
        System.out.println("choose an algorithm please: ");
        System.out.println("---------------------------");
        System.out.println("Enter 1 for priority algorithm");
        System.out.println("Enter 2 for round algorithm");
        System.out.println("Enter 3 for SJTF algorithm");
        System.out.println("---------------------------");
        System.out.print("your choice is ? ");
        int choice=read.nextInt();
        boolean again=true;
        while(again) {
            again=false;
            if (choice == 1 || choice == 2 || choice == 3) {
                if (choice == 1) {
                    try {
                        priority temp = new priority();

                    } catch (Exception e) {
                        System.out.println("There an error in the excuting priority algorithm !");
                    }
                } else if (choice == 2) {
                    round temp = new round();
                } else {
                    SJTF temp = new SJTF();
                }
            } else {
                System.out.println("wrong number ! try again");
                again = true;
                System.out.print("your choice is ? ");
                choice=read.nextInt();
            }
        }
    }
}
