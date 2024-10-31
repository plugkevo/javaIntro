package thistest;

class Account {
    int rate;
    int amount;
    int interest;

    Account(int r, int a) {
        rate = r;
        amount = a;
    }

    void Total_Interest() {
        rate = this.rate+rate;
        interest = (this.rate + 5) * amount / 100;
        System.out.println("Total Interest on amount " + amount + " is " + interest);
    }
}

class ThisTest {
    public static void main(String[] args) {
        Account Acc1 = new Account(5, 5000);
        Acc1.Total_Interest();
    }
}