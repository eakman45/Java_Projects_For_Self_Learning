import java.util.Scanner;

public class logging {
    public static void main(String[] args) {
        String username,password;
        Scanner inp = new Scanner(System.in);
        System.out.println("Username = ");
        username = inp.nextLine();
        System.out.println("Password = ");
        password = inp.nextLine();

        if(username.equals("Ege Akman") && password.equals("Java123")) {
            System.out.println("Logged in Succesfully");


        }
        else{
            System.out.println("Wrong information!");
            System.out.println("Do you want to change your password?");

            String answer = inp.nextLine();

            if(answer.equals("Yes")){
                System.out.println("Please enter your new password:");
                String newPassword = inp.nextLine();
                if(newPassword.equals("Java123")){
                    System.out.println("Your new password cannot be same with the previous one!");

                }
                else {
                    System.out.println("Your new password is set:"+newPassword);
                }
            }
            else{
                System.out.println("Please check your information!");
            }
        }
    }
}