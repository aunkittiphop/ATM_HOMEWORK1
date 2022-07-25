import java.io.Reader;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        int amount;
        int signed_index = 0;
        boolean logincheck = true;
        boolean signoutcheck = true;
        String id;
        String username;
        String password;
        double account_bl;
        double withdraw;
        double calculate;
        Create_user[] aun2;

        Scanner aun = new Scanner(System.in);
        System.out.print("Enter amout of all account : ");
        amount = aun.nextInt();
        aun2 = new Create_user[amount];
        System.out.println("Enter Detail of each account");
        for (int i = 1; i <= amount; i++) {
            System.out.println("No." + i);

            do {
                System.out.print("Account ID : ");
                id = aun.next();
                if (id.length() != 13) {
                    System.out.println("Please enter Account id 13 characters");
                }
            } while (id.length() != 13);

            do {
                System.out.print("Account Name : ");
                username = aun.next();
                if (username.length() >= 50) {
                    System.out.println("Please enter Account Name again");
                }
            } while (username.length() >= 50);

            do {
                System.out.print("Password : ");
                password = aun.next();

                if (password.length() != 4) {
                    System.out.println("Please enter Password 4 character");
                }
            } while (password.length() != 4);

            do {
                System.out.print("Balance : ");
                account_bl = aun.nextInt();

                if (account_bl > 1000000) {
                    System.out.println("Please enter Balance lower 1M");
                }
            } while (account_bl > 1000000);

            aun2[i - 1] = new Create_user(id, password, username, account_bl);

        }
        while(true){
        while (logincheck) {
            id = "";
            password = "";
            signoutcheck = true;
            System.out.println("****************************");
            System.out.println("ATM ComputerThanyaburi Bank");
            System.out.print("Account ID : ");
            id = aun.next();

            System.out.print("Account Password : ");
            password = aun.next();

            for (int j = 0; j != amount; j++) {
                if (id.equals(aun2[j].getUser_id())) {
                    if (password.equals(aun2[j].getPassword())) {
                        signed_index = j;
                        System.out.println("Login Success");
                        logincheck = false;
                        break;

                    } else {
                        System.out.println("Password invalid");
                    }
                } else {
                    System.out.println("ID invalid");
                }
            }
        }
        while (signoutcheck) {
            System.out.println("****************************");
            System.out.println("ATM ComputerThanyaburi Bank");
            System.out.println("Account ID : " + aun2[signed_index].getUser_id());
            System.out.println("Menu Service");
            System.out.println("1. Account Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Choose : ");
            String choose = aun.next();

            switch (choose) {
                case "1":
                    System.out.println("Account Balance : " + aun2[signed_index].getAccount_bl());
                    break;

                case "2":
                    System.out.println("Account Balance : " + aun2[signed_index].getAccount_bl());
                    System.out.print("Withdraw : ");
                    withdraw = aun.nextInt();
                    calculate = (aun2[signed_index].getAccount_bl() - withdraw);
                    System.out.println("Account Balance " + calculate);
                    aun2[signed_index].setAccount_bl(calculate);
                    break;

                case "3":
                    signoutcheck = false;
                    logincheck = true;
                    break;
                default:
                    System.out.println("Please Enter 1 2 or 3 !");
                    break;
            }
        }
    }
    }
}
