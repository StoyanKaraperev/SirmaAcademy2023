import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<BankAccount> bankAccounts = new ArrayList<BankAccount>();
        while(!(command.equals("End"))){
            if (command.equals("Create")){
                BankAccount bankAccount = new BankAccount();
                bankAccounts.add(bankAccount);
                bankAccount.printNewAccount();
            } else if (command.equals("Deposit")){
                
            }

            command = scanner.nextLine();
        }




    }
}
