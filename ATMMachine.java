import java.util.Scanner;

public class ATMMachine {

    public static void main(String args[]) {
        // declare and initialize balance,withdrawl, and deposit
        int balance = 100000, withdraw, deposit;

        try
                (Scanner sc = new Scanner(System.in)) {
            while (true){
                System.out.println("Automated teller Machine");
                System.out.println("choose 1 for withdrawl");
                System.out.println("choose 2 for Deposit ");
                System.out.println("choose 3 to check balance");
                System.out.println("choose 4 to EXIT");
                System.out.print("choose the operation you want to perform");

                // Get Choice From user
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.print("Enter Money to be withdrawn:");

                        // get the input from user
                        withdraw = sc.nextInt();

                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("PLease collect the Money");
                        } else {
                            // show error
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("null");
                        break;
                    
                    case 2:
                        
                        System.out.print("Enter money to be deposited");
                        deposit = sc.nextInt();
                        
                        //Add the deposited amount to the total balance
                        balance = balance + deposit;
                        System.out.println("Your money has been deposited");
                        System.out.println("null");
                        break;

                    case 3:
                        //Balance Enquiry
                        System.out.println("Balance :" + balance);
                        System.out.println("null");
                        break;

                    case 4:
                        //Exit
                        System.exit(0);
                }
            }

            }
        }
}
