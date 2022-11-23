import java.util.Scanner;
import java.lang.*;
class NegativeNumberException extends Exception{
    public String toString(){
        return "Negative Number Entered";
    }
}
class LowBalanceException extends Exception{
    public String toString(){
        return "Account Balane Insufficient";
    }
}
class BankAccount {
    double balance, amount;
    long accNumber;
    Scanner sc = new Scanner(System.in);

    void setData() {
        System.out.print("Enter Account Number: ");
        accNumber = sc.nextLong();
        System.out.print("Enter Initial Account Balance: ");
        balance = sc.nextDouble();
    }

    void balanceEnquiry() {
        System.out.println("Account Balance: " + balance);
    }

    void withdraw() {
        System.out.print("Enter Amount to Withdraw: ");
        amount = sc.nextDouble();
        try {
            if (amount < 0) {
                throw new NegativeNumberException();
            } else if (amount > balance) {
                throw new LowBalanceException();
            } else {
                balance -= amount;
                System.out.println("Withdrawl Complete!!");
            }
        } catch (NegativeNumberException e) {
            System.out.println(e);
        } catch (LowBalanceException e) {
            System.out.println(e);
        }
    }

    void deposit() {
        System.out.print("Enter Amount to Deposit: ");
        amount = sc.nextDouble();
        try {
            if (amount < 0) {
                throw new NegativeNumberException();
            } else {
                balance += amount;
                System.out.println("Deposit Complete!!");
            }
        } catch (NegativeNumberException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc1 = new BankAccount();
        acc1.setData();
        int choice;
        do {
            System.out.print("Menu\n1.Balance Enquiry\n2.Deposit\n3.Withdraw\nEnter Choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    acc1.balanceEnquiry();
                    break;
                case 2:
                    acc1.deposit();
                    break;
                case 3:
                    acc1.withdraw();
                    break;
            }
        } while (choice != 0);
    }
}
