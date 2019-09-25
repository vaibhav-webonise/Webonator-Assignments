import java.util.Scanner;

class Samsung extends Cellphone {

    private int samsungPayBalance = 0;
    String inputChoiceSamsungPay = "";
    Scanner scan = new Scanner(System.in);

    void samsungPay() {
        do {
            System.out.print("\n samsungPay options:: 1.Add money  2.Transfer  3.Balance");
            System.out.print("\n Select one operation:");
            int samsungPayChoice = scan.nextInt();
            switch (samsungPayChoice) {

                case 1:
                    addMoney();
                    break;
                case 2:
                    sendMoney();
                    break;
                case 3:
                    showBalance();
                    break;
            }
            System.out.print("\n Conitune with samsung pay::");
            inputChoiceSamsungPay = scan.next();
        } while (inputChoiceSamsungPay.equals("yes"));
    }

    void addMoney() {
        System.out.print("\n Enter account number to add money in samsungPay:");
        long accountNumber = scan.nextLong();
        System.out.print("\n Enter amount to add in samsungPay:");
        int amount = scan.nextInt();
        samsungPayBalance = samsungPayBalance + amount;
    }

    void sendMoney() {
        System.out.print("\n Enter amount to transfer money:");
        int amount = scan.nextInt();
        if (amount <= samsungPayBalance) {
            System.out.print("\n\n Enter account number to transfer money:");
            long accountNumber = scan.nextLong();
            System.out.print("\n Money transfered..");
            samsungPayBalance = samsungPayBalance - amount;
        } else {
            System.out.print("\n Insufficient balance..");
        }


    }

    void showBalance() {
        System.out.print("\n\n Available balance in samsungPay:" + samsungPayBalance);
    }


}

