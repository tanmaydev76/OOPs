import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
	
	// 1 = Basic, 3 = Regular, 7 = Special, 15 = Premium
        int[] userTypeArr = {1, 3, 7, 15, 7 , 15};
	
        int[] balance = {12384, 65332, 4536, 69782, 4567, 3289};  //six customers with ids 0, 1, 2, 3, 4, 5 respectively


        Scanner sc = new Scanner(System.in);
        int repeat = 1;

        while (repeat == 1) {

            System.out.println("Enter User ID (0-5): ");
            int userid = sc.nextInt();

            int userType = userTypeArr[userid];

            System.out.println("Enter Operation:");
            System.out.println("Check Balance - 1");
            System.out.println("Deposit - 2");
            System.out.println("Withdraw - 4");
            System.out.println("Transfer Funds - 8");
            int opr = sc.nextInt();

            if ((opr & userType) == 0) {
                System.out.println("Can't perform this operation");
            } else {
                switch (opr) {
                    case 1:
                        System.out.println("Balance: " + balance[userid]);
                        break;

                    case 2:
                    	System.out.println();
                        System.out.println("Enter Deposit Amount: ");
                        int deposit = sc.nextInt();
                        balance[userid] += deposit;
                        System.out.println("Balance: " + balance[userid]);
                        break;

                    case 4:
                    	System.out.println();
                        System.out.println("Enter Withdrawal Amount: ");
                        int withdraw = sc.nextInt();

                        if (withdraw > balance[userid]) {
                            System.out.println("Insufficient Balance");
                        } else {
                            balance[userid] -= withdraw;
                            System.out.println(withdraw + " rupees withdrawn");
                        }
                        break;

                    case 8:
                    	System.out.println();
                        System.out.println("Enter Receiver's User ID (0-5): ");
                        int id = sc.nextInt();
			
                        System.out.println("Enter Transfer Amount: ");
                        int transfer = sc.nextInt();

                        if (transfer > balance[userid]) {
                            System.out.println("Insufficient Balance");
                        } else {
                            balance[userid] -= transfer;
                            balance[id] += transfer;
                            System.out.println(transfer + " rupees transferred to user " + id);
                        }
                        break;

                    default:
                        System.out.println("Invalid Operation");
                }
            }

            System.out.println("Press 1 to continue, 0 to exit:");
            repeat = sc.nextInt();
            System.out.println();
        }

        sc.close();
    }
}

