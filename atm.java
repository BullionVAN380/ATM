import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //initialised balance /default
        double balance = 10000.0;

        while (true) {
            // Display menu
            System.out.println("ATM Menu:");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Select an option (1-4): ");

            int option = scanner.nextInt();

            //swich in defferent options

            switch (option) {

                //withdraw switch
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. New balance: Ksh" + balance);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                //diposite case
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit successful. New balance: Ksh" + balance);
                    break;

                //balance case
                case 3:
                    System.out.println("Current balance: Ksh" + balance);
                    break;

                //Exit project case
                case 4:
                    System.out.println("Exiting. Thank you for using the ATM.");
                    scanner.close();
                    System.exit(0);

                    //default case
                default:
                    System.out.println("Invalid option. Please select 1, 2, 3, or 4.");
                    break;
            }

            System.out.println();
        }
    }
}
