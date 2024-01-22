import java.util.Scanner;

class bankAccount{
    private double bal;
    public bankAccount(double amount){
        bal = amount;
    }
    public void deposit(double amount){
        bal+=amount;
    }
    public boolean withdrawal(double amount){
        if(amount<=bal){
            bal-=amount;
            return true;
        }
        return false;
    }
    public double getBalance(){
        return bal;
    }
}

class Atm{
    private bankAccount account;
    public Atm(bankAccount amount){
        account = amount;
    }
    public void menu(){
        System.out.println("ATM MENU");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            menu();
            System.out.println("Seelct an option");
            int choose = sc.nextInt();
            switch(choose){
                case 1:
                   System.out.println("Enter account to depoisit:-");
                   double y = sc.nextDouble();
                   account.deposit(y);
                   System.out.println("Amount deposited sucessfully");
                   System.out.println("Your balance - Rs. " + account.getBalance()+"\n");
                   break;
                case 2:
                   System.out.println("Enter amount to be withdrawal:- ");
                   double z = sc.nextDouble();
                   if(account.withdrawal(z)){
                    System.out.println("your withdrawal sucessfull");
                    System.out.println("Your balance is- Rs. "+ account.getBalance()+"\n");
                   }else{
                    System.out.println("Insufficient balance"+"\n");
                   }
                   break;
                case 3: 
                   System.out.println("Your Balance: Rs. " + account.getBalance()+"\n");
                   break;
                case 4:
                   System.out.println("Thankyou for using out ATM services"+"\n");
                   sc.close();
                   return;
                default:
                   System.out.println("Invalid option. please select a valid option given above"+"\n");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        bankAccount user = new bankAccount(10000);
        Atm x = new Atm(user);
        x.run();
    }
}
