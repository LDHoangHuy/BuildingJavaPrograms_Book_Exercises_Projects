package Chapter3;

public class Prj2_Savings {
    public static void main(String[] args) {
        /*
         * 6.5% / year, 25 years, $1000 initial, $100 deposit /year
         * display: current balance, interest, new deposit, new balance
         * 1. interest = 6.5% * current balance
         * 2. new deposit = $100
         * 3. new balance = current balance + interest + new deposit
         * 4. display all of them
         * 5. current balance = new balance
         * 6. back to line 1 until reach year 25
         */
        double iRate = 0.065;
        int years = 25;
        double currentBalance = 1000;
        double deposit = 100;
        double interest;
        double newBalance = currentBalance;
        for (int i = 1; i <= years; i++) {
            currentBalance = newBalance;
            interest = iRate * currentBalance;
            newBalance = currentBalance + interest + deposit;
            System.err.printf("%d. curBal: %f || interest: %f || new deposit: %f || new bal: %f%n", i, currentBalance, interest, deposit, newBalance);
        }
    }
}
