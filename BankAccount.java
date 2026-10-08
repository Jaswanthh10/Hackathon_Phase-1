import java.util.Scanner;
 class BankAccount1  {
   int accountNumber;
   String accountHolderName;
    double accountBalance;
 double deposit(double amount) {
    return amount+accountBalance;}
 double withdraw(double amount) {
    if(amount>accountBalance) {
        System.out.println("Insufficient balance");
        return accountBalance;
    } else {
        return accountBalance - amount;
    }
}
 double checkBalance() {
    return accountBalance;}
 void displayAccountDetails(int accountNumber,String accountHolderName,double accountBalance) {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
    }
    BankAccount1(int accountNumber,String accountHolderName,double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }
 }

public class BankAccount{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the account number: ");
int accountNumber = sc.nextInt();
System.out.println("Enter the account holder name: ");
String accountHolderName = sc.next();
System.out.println("Enter the account balance: ");
double accountBalance = sc.nextDouble();
System.out.println("Enter the amount to deposit: ");
double amount = sc.nextDouble();
System.out.println("Enter the amount to withdraw: ");
double withdrawAmount = sc.nextDouble();
BankAccount1 account = new BankAccount1(accountNumber, accountHolderName, accountBalance);
account.deposit(amount);
account.withdraw(withdrawAmount);
account.checkBalance();
account.displayAccountDetails(accountNumber, accountHolderName, accountBalance);
accountBalance = account.deposit(amount);
accountBalance = account.withdraw(withdrawAmount);

System.out.println("Updated Account Balance: " + account.checkBalance());
System.out.println("Updated Account Balance after deposit: " + account.deposit(amount));
System.out.println("Updated Account Balance after withdrawal: " + account.withdraw(withdrawAmount));
System.out.println("Updated Account Balance after deposit and withdrawal: " + account.checkBalance());
}}