import java.util.Scanner;

public class atm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username : ");
        String userName= input.next();
        System.out.println("Please enter your password :");
        int pin= input.nextInt();
        int process;
        int balance = 2000;
        int right=3;
        int digit=0;
        int tempNum=pin;
        while(tempNum !=0){
            tempNum/=10;
            digit++;
        }

        if(userName.equals("User")&& pin==1234){
            System.out.println("Correct username and password.");
            do {
                System.out.println("""
                        1-Money Deposit
                        2-Withdraw
                        3-Check Balance
                        4-Exit""");
                System.out.print("Please select the process you want to do : ");
                process = input.nextInt();
                switch (process) {
                    case 1 -> {
                        System.out.print("Amount you want to deposit :");
                        int amount = input.nextInt();
                        balance += amount;
                    }
                    case 2 -> {
                        System.out.println("Amount you want to withdraw : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Sufficient balance");
                        } else {
                            balance -= price;
                        }
                    }
                    case 3 -> System.out.println("Your balance is = " + balance);

                    default -> System.out.println("There is no process related with your input. ");
                }
            }while(process != 4);
            System.out.println("Thank you for choosing our bank. ");
            }
        else{
            right--;
                if (digit != 4) {
                    System.out.println("Your pin number should be 4 digits");
                } else {
                    System.out.println("Wrong username or pin. TRY AGAIN!");
                }

        }
        if (right == 0) {
            System.out.println("Your account is blocked.Please contact our/your bank.");
        } else {
            System.out.println("Your remaining rights : " + right);
        }


    }
}
