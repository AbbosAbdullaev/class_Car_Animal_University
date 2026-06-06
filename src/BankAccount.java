public class BankAccount {

    private String ownerName;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 0){
            this.balance = balance;
            System.out.println("Balans 0 ga teng");
        }
    }

    public void deposit(double amount){
        if (amount > 0){
            this.balance = this.balance + amount;
            System.out.println(amount + " sizga so'm qushildi!");
        }else {
            System.out.println("xato 0 yoki minus kiritish kerak emas!");
        }

    }
    public void withDraw(double amount){
        if (amount >= 0 && amount <= this.balance){
            this.balance = this.balance - amount;
            System.out.println(amount + " sum yechildi");
        } else {
            System.out.println("Xatolik mablag' yetari emas!!");
        }
    }
}
