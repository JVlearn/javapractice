
/****************Getting user input in java **************/

import java.util.Scanner;


public class gettinguserinput{
        public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);

            System.out.println("What is your name? ");

            String name = scanner.nextLine();
            
            System.out.println("what is your rating 1 to 10");
            
            int rating = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your E-mail id :");

            String email = scanner.nextLine();
            
            System.out.println("Hello " + name);
            System.out.println("you have rated us : " + rating);
            System.out.println("Your E-mail id :" + email);

    

    }
}
